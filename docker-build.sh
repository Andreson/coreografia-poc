 
 #          kubectl  port-forward -n=coreografia  dataclassification-api-fb5b7585c-pdjdr 8080:8080
 
 BUILD_VERSION=1
 
 
CONTAINER_NAME=app-mock-coreografia

if [ "$CONTAINER_REGISTRY_HOST" = "" ]; \
    then export CONTAINER_REGISTRY_HOST=andresonthiago; \
    fi
 
  docker build   . -t $CONTAINER_NAME

 

 echo "Imagem docker gerada :  "

 docker image ls $CONTAINER_NAME

 echo "Gerando tag imagem "

 docker tag $CONTAINER_NAME $CONTAINER_REGISTRY_HOST/$CONTAINER_NAME:$BUILD_VERSION

 docker tag $CONTAINER_NAME $CONTAINER_REGISTRY_HOST/$CONTAINER_NAME:latest


 echo "Fazendo push imagens"

 docker push  $CONTAINER_REGISTRY_HOST/$CONTAINER_NAME:$BUILD_VERSION

 

 docker push  $CONTAINER_REGISTRY_HOST/$CONTAINER_NAME:latest

 
echo " build concluido "


