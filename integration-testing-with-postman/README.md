# integration-testing-with-postman

**Integration test with Postman and Javascript for API used in comment process in Çiçeksepeti**

**GET**  ``` https://www.getpostman.com/collections/b668e69a73698144c1ca```

## Step 1

First step, we'll import the Postman collection and Postman environment into Postman.

#### Instructions

- Open Postman

- Click on the  ```import``` button located in the top left corner of Postman

- The file you are importing is inside of the ```postman_collection``` folder in this repo

- After importing, you should have a collection called ```Ciceksepeti Bootcamp API Test.postman_collection```

- The file you are importing is inside of the ```postman_environment``` folder in this repo

- After importing, you should have a collection called ```CicekSepeti Bootcamp.postman_environment```  

## Step 2

#### Instructions

In this step, we will create a Postman test to fetching the return response on the city name value.

+ | Key | Value |
  |-------|-------|
  | cityName | ankara |
    + Click on the ```cityName_ankara``` request
    + Click on the ```Send``` button to see the returned data
    + Create tests to check the returned ```cityName``` value

![ankara](https://user-images.githubusercontent.com/55894683/147647870-681c36da-8609-4d68-82b0-82d4e40230b5.PNG)


+ | Key | Value |
  |-------|-------|
  | cityName | istanbul |
    + Click on the ```cityName_istanbul``` request
    + Click on the ```Send``` button to see the returned data
    + Create tests to check the returned ```cityName``` value

![istanbul](https://user-images.githubusercontent.com/55894683/147648018-eb14d60f-2991-4fdc-8554-7aad7abc1fe9.PNG)

+ | Key | Value |
  |-------|-------|
  | cityName | van |
    + Click on the ```cityName_van``` request
    + Click on the ```Send``` button to see the returned data
    + Create tests to check the returned ```cityName``` value

![van](https://user-images.githubusercontent.com/55894683/147648065-b53ddf40-57d7-4b92-9460-bca12b06af49.PNG)


+ | Key | Value |
  |-------|-------|
  | cityName | null |
    + Click on the ```cityName is null``` request
    + Click on the ```Send``` button to see the returned data
    + Create tests to check the returned ```cityName``` value

![null](https://user-images.githubusercontent.com/55894683/147648112-d53ecd46-4275-44e9-a688-ee9cb1991e9b.PNG)

## Step 3

Last step, we'll make reporting templates with Newman Command Line Runner in Postman

#### Instructions

- Open CMD

- Install newman ```$ npm install -g newman-reporter-html```

- Run newman ```$ newman run [your collection path] -r html``` 

if you have a collection environment, you can use  ```$ newman run [your collection path] -e [your environment path] -r html``` 

![Ekran Alıntısı](https://user-images.githubusercontent.com/55894683/147651508-2731006d-372e-480a-aa8a-5e2b4877cef5.PNG)

![Ekran Alıntısı1](https://user-images.githubusercontent.com/55894683/147651523-6aa07450-7b9e-4bbf-b650-23636976f5bc.PNG)

![Ekran Alıntısı2](https://user-images.githubusercontent.com/55894683/147651532-42ba294c-e201-4d96-b7e8-81afb997a907.PNG)












