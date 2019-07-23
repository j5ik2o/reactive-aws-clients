// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync

import software.amazon.awssdk.services.appsync.model._
import software.amazon.awssdk.services.appsync.{ AppSyncAsyncClient => JavaAppSyncAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object AppSyncAsyncClient {

  def apply(javaClient: JavaAppSyncAsyncClient): AppSyncAsyncClient =
    new AppSyncAsyncClient {
      override val underlying: JavaAppSyncAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/appsync/AppSyncAsyncClient.html
  */
trait AppSyncAsyncClient extends AppSyncClient[Future] {
  val underlying: JavaAppSyncAsyncClient

  override def createApiKey(createApiKeyRequest: CreateApiKeyRequest): Future[CreateApiKeyResponse] =
    underlying.createApiKey(createApiKeyRequest).toScala

  override def createDataSource(createDataSourceRequest: CreateDataSourceRequest): Future[CreateDataSourceResponse] =
    underlying.createDataSource(createDataSourceRequest).toScala

  override def createFunction(createFunctionRequest: CreateFunctionRequest): Future[CreateFunctionResponse] =
    underlying.createFunction(createFunctionRequest).toScala

  override def createGraphqlApi(createGraphqlApiRequest: CreateGraphqlApiRequest): Future[CreateGraphqlApiResponse] =
    underlying.createGraphqlApi(createGraphqlApiRequest).toScala

  override def createResolver(createResolverRequest: CreateResolverRequest): Future[CreateResolverResponse] =
    underlying.createResolver(createResolverRequest).toScala

  override def createType(createTypeRequest: CreateTypeRequest): Future[CreateTypeResponse] =
    underlying.createType(createTypeRequest).toScala

  override def deleteApiKey(deleteApiKeyRequest: DeleteApiKeyRequest): Future[DeleteApiKeyResponse] =
    underlying.deleteApiKey(deleteApiKeyRequest).toScala

  override def deleteDataSource(deleteDataSourceRequest: DeleteDataSourceRequest): Future[DeleteDataSourceResponse] =
    underlying.deleteDataSource(deleteDataSourceRequest).toScala

  override def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): Future[DeleteFunctionResponse] =
    underlying.deleteFunction(deleteFunctionRequest).toScala

  override def deleteGraphqlApi(deleteGraphqlApiRequest: DeleteGraphqlApiRequest): Future[DeleteGraphqlApiResponse] =
    underlying.deleteGraphqlApi(deleteGraphqlApiRequest).toScala

  override def deleteResolver(deleteResolverRequest: DeleteResolverRequest): Future[DeleteResolverResponse] =
    underlying.deleteResolver(deleteResolverRequest).toScala

  override def deleteType(deleteTypeRequest: DeleteTypeRequest): Future[DeleteTypeResponse] =
    underlying.deleteType(deleteTypeRequest).toScala

  override def getDataSource(getDataSourceRequest: GetDataSourceRequest): Future[GetDataSourceResponse] =
    underlying.getDataSource(getDataSourceRequest).toScala

  override def getFunction(getFunctionRequest: GetFunctionRequest): Future[GetFunctionResponse] =
    underlying.getFunction(getFunctionRequest).toScala

  override def getGraphqlApi(getGraphqlApiRequest: GetGraphqlApiRequest): Future[GetGraphqlApiResponse] =
    underlying.getGraphqlApi(getGraphqlApiRequest).toScala

  override def getIntrospectionSchema(
      getIntrospectionSchemaRequest: GetIntrospectionSchemaRequest
  ): Future[GetIntrospectionSchemaResponse] =
    underlying.getIntrospectionSchema(getIntrospectionSchemaRequest).toScala

  override def getResolver(getResolverRequest: GetResolverRequest): Future[GetResolverResponse] =
    underlying.getResolver(getResolverRequest).toScala

  override def getSchemaCreationStatus(
      getSchemaCreationStatusRequest: GetSchemaCreationStatusRequest
  ): Future[GetSchemaCreationStatusResponse] =
    underlying.getSchemaCreationStatus(getSchemaCreationStatusRequest).toScala

  override def getType(getTypeRequest: GetTypeRequest): Future[GetTypeResponse] =
    underlying.getType(getTypeRequest).toScala

  override def listApiKeys(listApiKeysRequest: ListApiKeysRequest): Future[ListApiKeysResponse] =
    underlying.listApiKeys(listApiKeysRequest).toScala

  override def listDataSources(listDataSourcesRequest: ListDataSourcesRequest): Future[ListDataSourcesResponse] =
    underlying.listDataSources(listDataSourcesRequest).toScala

  override def listFunctions(listFunctionsRequest: ListFunctionsRequest): Future[ListFunctionsResponse] =
    underlying.listFunctions(listFunctionsRequest).toScala

  override def listGraphqlApis(listGraphqlApisRequest: ListGraphqlApisRequest): Future[ListGraphqlApisResponse] =
    underlying.listGraphqlApis(listGraphqlApisRequest).toScala

  override def listGraphqlApis(): Future[ListGraphqlApisResponse] =
    underlying.listGraphqlApis().toScala

  override def listResolvers(listResolversRequest: ListResolversRequest): Future[ListResolversResponse] =
    underlying.listResolvers(listResolversRequest).toScala

  override def listResolversByFunction(
      listResolversByFunctionRequest: ListResolversByFunctionRequest
  ): Future[ListResolversByFunctionResponse] =
    underlying.listResolversByFunction(listResolversByFunctionRequest).toScala

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Future[ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toScala

  override def listTypes(listTypesRequest: ListTypesRequest): Future[ListTypesResponse] =
    underlying.listTypes(listTypesRequest).toScala

  override def startSchemaCreation(
      startSchemaCreationRequest: StartSchemaCreationRequest
  ): Future[StartSchemaCreationResponse] =
    underlying.startSchemaCreation(startSchemaCreationRequest).toScala

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toScala

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toScala

  override def updateApiKey(updateApiKeyRequest: UpdateApiKeyRequest): Future[UpdateApiKeyResponse] =
    underlying.updateApiKey(updateApiKeyRequest).toScala

  override def updateDataSource(updateDataSourceRequest: UpdateDataSourceRequest): Future[UpdateDataSourceResponse] =
    underlying.updateDataSource(updateDataSourceRequest).toScala

  override def updateFunction(updateFunctionRequest: UpdateFunctionRequest): Future[UpdateFunctionResponse] =
    underlying.updateFunction(updateFunctionRequest).toScala

  override def updateGraphqlApi(updateGraphqlApiRequest: UpdateGraphqlApiRequest): Future[UpdateGraphqlApiResponse] =
    underlying.updateGraphqlApi(updateGraphqlApiRequest).toScala

  override def updateResolver(updateResolverRequest: UpdateResolverRequest): Future[UpdateResolverResponse] =
    underlying.updateResolver(updateResolverRequest).toScala

  override def updateType(updateTypeRequest: UpdateTypeRequest): Future[UpdateTypeResponse] =
    underlying.updateType(updateTypeRequest).toScala

}
