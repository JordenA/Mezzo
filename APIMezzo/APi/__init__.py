
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


###########

call = 'artists/search'

artist = 'Rihanna'

#params = {'name': track} # confusing result, where scores do not make much sense
params = {'nickname': artist, 'access_token': token} # different, more exact result


resp = requests.get(base + call, params, headers=headers)
resp.status_code


json = resp.json()
results = json['results']

for r in results:
    print(str(r['score']) + '\t' + r['uid'] + '\t' + r['nickname'])
