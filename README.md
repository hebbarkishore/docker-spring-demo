You can execute the below commands to create the image in docker hub.
"docker build -t myapps/studentdetails:0.0.1 ."
The above will create the myapps/studentdetails:0.0.1 image.
Once done then you need to use the "docker compose up", this will execute the docker-compose.yml and create the containers as mentioned in the file.
Note: the above will create the 1 postgre image on your docker account and also it will create 2 containers related to app and postgres and it will be bundled together.
