
from __future__ import print_function  # Python 3.x compatibility

import requests
import base64


# base URL for all API calls to Musimap
base = 'https://api.musimap.net/'


# ADD YOUR CLIENT ID AND SECRET HERE

client_id = '1r3mhw9nfhuv7tok'
client_secret = 'l1nzfrajtvxrjorhsts1pf7e9td8jge9'

call = 'oauth/access_token'
params = {'grant_type': 'client_credentials', 'client_id': client_id, 'client_secret': client_secret}
resp = requests.post(base + call, params)
resp.status_code
#print (resp.text)
json = resp.json()
token = json['access_token']
#print (token)
token_enc = base64.standard_b64encode(token)
headers = {'Authorization': 'Bearer ' + token_enc}
#print (headers)

call = 'genres/search'

genre = 'indie' # indie, calypso

params = {'name': genre, 'access_token': token}  # token is always passed as an option via ?access_token=
resp = requests.get(base + call, params, headers=headers)
resp.status_code, resp.headers['content-type']
#print(resp.text)

# as JSON
json = resp.json()
results = json['results']
#print(results)

print("List of Genres UIDs and names:")

for res in results:
    print(res['uid'], '\t', res['name'])

call = 'genres'

params = {'access_token': token}

resp = requests.get(base + call, params, headers=headers)
resp.status_code

json = resp.json()
results = json['results']

print (json)

# recursive function
def print_genretree(depth, genretree):
    for genre in genretree:
        print('-' * depth, genre['name']) #, len(genre['children']), "children")
        if 'children' in genre.keys():
            print_genretree(depth+1, genre['children']) # recursive call, 1 level deeper

print_genretree(0, results)