// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.appsync.model._
import software.amazon.awssdk.services.appsync.{ AppSyncClient => JavaAppSyncClient }

object AppSyncSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaAppSyncClient): AppSyncSyncClient =
    new AppSyncSyncClient {
      override val underlying: JavaAppSyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/appsync/AppSyncClient.html */
trait AppSyncSyncClient extends AppSyncClient[Either[Throwable, ?]] {
  val underlying: JavaAppSyncClient
  import AppSyncSyncClient._

  override def createApiCache(createApiCacheRequest: CreateApiCacheRequest): Either[Throwable, CreateApiCacheResponse] =
    underlying.createApiCache(createApiCacheRequest).toEither

  override def createApiKey(createApiKeyRequest: CreateApiKeyRequest): Either[Throwable, CreateApiKeyResponse] =
    underlying.createApiKey(createApiKeyRequest).toEither

  override def createDataSource(
      createDataSourceRequest: CreateDataSourceRequest
  ): Either[Throwable, CreateDataSourceResponse] =
    underlying.createDataSource(createDataSourceRequest).toEither

  override def createFunction(createFunctionRequest: CreateFunctionRequest): Either[Throwable, CreateFunctionResponse] =
    underlying.createFunction(createFunctionRequest).toEither

  override def createGraphqlApi(
      createGraphqlApiRequest: CreateGraphqlApiRequest
  ): Either[Throwable, CreateGraphqlApiResponse] =
    underlying.createGraphqlApi(createGraphqlApiRequest).toEither

  override def createResolver(createResolverRequest: CreateResolverRequest): Either[Throwable, CreateResolverResponse] =
    underlying.createResolver(createResolverRequest).toEither

  override def createType(createTypeRequest: CreateTypeRequest): Either[Throwable, CreateTypeResponse] =
    underlying.createType(createTypeRequest).toEither

  override def deleteApiCache(deleteApiCacheRequest: DeleteApiCacheRequest): Either[Throwable, DeleteApiCacheResponse] =
    underlying.deleteApiCache(deleteApiCacheRequest).toEither

  override def deleteApiKey(deleteApiKeyRequest: DeleteApiKeyRequest): Either[Throwable, DeleteApiKeyResponse] =
    underlying.deleteApiKey(deleteApiKeyRequest).toEither

  override def deleteDataSource(
      deleteDataSourceRequest: DeleteDataSourceRequest
  ): Either[Throwable, DeleteDataSourceResponse] =
    underlying.deleteDataSource(deleteDataSourceRequest).toEither

  override def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): Either[Throwable, DeleteFunctionResponse] =
    underlying.deleteFunction(deleteFunctionRequest).toEither

  override def deleteGraphqlApi(
      deleteGraphqlApiRequest: DeleteGraphqlApiRequest
  ): Either[Throwable, DeleteGraphqlApiResponse] =
    underlying.deleteGraphqlApi(deleteGraphqlApiRequest).toEither

  override def deleteResolver(deleteResolverRequest: DeleteResolverRequest): Either[Throwable, DeleteResolverResponse] =
    underlying.deleteResolver(deleteResolverRequest).toEither

  override def deleteType(deleteTypeRequest: DeleteTypeRequest): Either[Throwable, DeleteTypeResponse] =
    underlying.deleteType(deleteTypeRequest).toEither

  override def flushApiCache(flushApiCacheRequest: FlushApiCacheRequest): Either[Throwable, FlushApiCacheResponse] =
    underlying.flushApiCache(flushApiCacheRequest).toEither

  override def getApiCache(getApiCacheRequest: GetApiCacheRequest): Either[Throwable, GetApiCacheResponse] =
    underlying.getApiCache(getApiCacheRequest).toEither

  override def getDataSource(getDataSourceRequest: GetDataSourceRequest): Either[Throwable, GetDataSourceResponse] =
    underlying.getDataSource(getDataSourceRequest).toEither

  override def getFunction(getFunctionRequest: GetFunctionRequest): Either[Throwable, GetFunctionResponse] =
    underlying.getFunction(getFunctionRequest).toEither

  override def getGraphqlApi(getGraphqlApiRequest: GetGraphqlApiRequest): Either[Throwable, GetGraphqlApiResponse] =
    underlying.getGraphqlApi(getGraphqlApiRequest).toEither

  override def getIntrospectionSchema(
      getIntrospectionSchemaRequest: GetIntrospectionSchemaRequest
  ): Either[Throwable, GetIntrospectionSchemaResponse] =
    underlying.getIntrospectionSchema(getIntrospectionSchemaRequest).toEither

  override def getResolver(getResolverRequest: GetResolverRequest): Either[Throwable, GetResolverResponse] =
    underlying.getResolver(getResolverRequest).toEither

  override def getSchemaCreationStatus(
      getSchemaCreationStatusRequest: GetSchemaCreationStatusRequest
  ): Either[Throwable, GetSchemaCreationStatusResponse] =
    underlying.getSchemaCreationStatus(getSchemaCreationStatusRequest).toEither

  override def getType(getTypeRequest: GetTypeRequest): Either[Throwable, GetTypeResponse] =
    underlying.getType(getTypeRequest).toEither

  override def listApiKeys(listApiKeysRequest: ListApiKeysRequest): Either[Throwable, ListApiKeysResponse] =
    underlying.listApiKeys(listApiKeysRequest).toEither

  override def listDataSources(
      listDataSourcesRequest: ListDataSourcesRequest
  ): Either[Throwable, ListDataSourcesResponse] =
    underlying.listDataSources(listDataSourcesRequest).toEither

  override def listFunctions(listFunctionsRequest: ListFunctionsRequest): Either[Throwable, ListFunctionsResponse] =
    underlying.listFunctions(listFunctionsRequest).toEither

  override def listGraphqlApis(): Either[Throwable, ListGraphqlApisResponse] =
    underlying.listGraphqlApis().toEither

  override def listGraphqlApis(
      listGraphqlApisRequest: ListGraphqlApisRequest
  ): Either[Throwable, ListGraphqlApisResponse] =
    underlying.listGraphqlApis(listGraphqlApisRequest).toEither

  override def listResolvers(listResolversRequest: ListResolversRequest): Either[Throwable, ListResolversResponse] =
    underlying.listResolvers(listResolversRequest).toEither

  override def listResolversByFunction(
      listResolversByFunctionRequest: ListResolversByFunctionRequest
  ): Either[Throwable, ListResolversByFunctionResponse] =
    underlying.listResolversByFunction(listResolversByFunctionRequest).toEither

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Either[Throwable, ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toEither

  override def listTypes(listTypesRequest: ListTypesRequest): Either[Throwable, ListTypesResponse] =
    underlying.listTypes(listTypesRequest).toEither

  override def startSchemaCreation(
      startSchemaCreationRequest: StartSchemaCreationRequest
  ): Either[Throwable, StartSchemaCreationResponse] =
    underlying.startSchemaCreation(startSchemaCreationRequest).toEither

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toEither

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toEither

  override def updateApiCache(updateApiCacheRequest: UpdateApiCacheRequest): Either[Throwable, UpdateApiCacheResponse] =
    underlying.updateApiCache(updateApiCacheRequest).toEither

  override def updateApiKey(updateApiKeyRequest: UpdateApiKeyRequest): Either[Throwable, UpdateApiKeyResponse] =
    underlying.updateApiKey(updateApiKeyRequest).toEither

  override def updateDataSource(
      updateDataSourceRequest: UpdateDataSourceRequest
  ): Either[Throwable, UpdateDataSourceResponse] =
    underlying.updateDataSource(updateDataSourceRequest).toEither

  override def updateFunction(updateFunctionRequest: UpdateFunctionRequest): Either[Throwable, UpdateFunctionResponse] =
    underlying.updateFunction(updateFunctionRequest).toEither

  override def updateGraphqlApi(
      updateGraphqlApiRequest: UpdateGraphqlApiRequest
  ): Either[Throwable, UpdateGraphqlApiResponse] =
    underlying.updateGraphqlApi(updateGraphqlApiRequest).toEither

  override def updateResolver(updateResolverRequest: UpdateResolverRequest): Either[Throwable, UpdateResolverResponse] =
    underlying.updateResolver(updateResolverRequest).toEither

  override def updateType(updateTypeRequest: UpdateTypeRequest): Either[Throwable, UpdateTypeResponse] =
    underlying.updateType(updateTypeRequest).toEither

}
