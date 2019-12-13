// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.appsync.{ AppSyncAsyncClient, AppSyncClient }
import software.amazon.awssdk.services.appsync.model._

import scala.concurrent.{ ExecutionContext, Future }

object AppSyncCatsIOClient {

  def apply(asyncClient: AppSyncAsyncClient)(implicit ec: ExecutionContext): AppSyncCatsIOClient =
    new AppSyncCatsIOClient {
      override val executionContext: ExecutionContext = ec
      override val underlying: AppSyncAsyncClient     = asyncClient
    }

}

trait AppSyncCatsIOClient extends AppSyncClient[IO] {

  val underlying: AppSyncAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def createApiCache(createApiCacheRequest: CreateApiCacheRequest): IO[CreateApiCacheResponse] =
    IO.fromFuture {
      IO(underlying.createApiCache(createApiCacheRequest))
    }

  override def createApiKey(createApiKeyRequest: CreateApiKeyRequest): IO[CreateApiKeyResponse] =
    IO.fromFuture {
      IO(underlying.createApiKey(createApiKeyRequest))
    }

  override def createDataSource(createDataSourceRequest: CreateDataSourceRequest): IO[CreateDataSourceResponse] =
    IO.fromFuture {
      IO(underlying.createDataSource(createDataSourceRequest))
    }

  override def createFunction(createFunctionRequest: CreateFunctionRequest): IO[CreateFunctionResponse] =
    IO.fromFuture {
      IO(underlying.createFunction(createFunctionRequest))
    }

  override def createGraphqlApi(createGraphqlApiRequest: CreateGraphqlApiRequest): IO[CreateGraphqlApiResponse] =
    IO.fromFuture {
      IO(underlying.createGraphqlApi(createGraphqlApiRequest))
    }

  override def createResolver(createResolverRequest: CreateResolverRequest): IO[CreateResolverResponse] =
    IO.fromFuture {
      IO(underlying.createResolver(createResolverRequest))
    }

  override def createType(createTypeRequest: CreateTypeRequest): IO[CreateTypeResponse] =
    IO.fromFuture {
      IO(underlying.createType(createTypeRequest))
    }

  override def deleteApiCache(deleteApiCacheRequest: DeleteApiCacheRequest): IO[DeleteApiCacheResponse] =
    IO.fromFuture {
      IO(underlying.deleteApiCache(deleteApiCacheRequest))
    }

  override def deleteApiKey(deleteApiKeyRequest: DeleteApiKeyRequest): IO[DeleteApiKeyResponse] =
    IO.fromFuture {
      IO(underlying.deleteApiKey(deleteApiKeyRequest))
    }

  override def deleteDataSource(deleteDataSourceRequest: DeleteDataSourceRequest): IO[DeleteDataSourceResponse] =
    IO.fromFuture {
      IO(underlying.deleteDataSource(deleteDataSourceRequest))
    }

  override def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): IO[DeleteFunctionResponse] =
    IO.fromFuture {
      IO(underlying.deleteFunction(deleteFunctionRequest))
    }

  override def deleteGraphqlApi(deleteGraphqlApiRequest: DeleteGraphqlApiRequest): IO[DeleteGraphqlApiResponse] =
    IO.fromFuture {
      IO(underlying.deleteGraphqlApi(deleteGraphqlApiRequest))
    }

  override def deleteResolver(deleteResolverRequest: DeleteResolverRequest): IO[DeleteResolverResponse] =
    IO.fromFuture {
      IO(underlying.deleteResolver(deleteResolverRequest))
    }

  override def deleteType(deleteTypeRequest: DeleteTypeRequest): IO[DeleteTypeResponse] =
    IO.fromFuture {
      IO(underlying.deleteType(deleteTypeRequest))
    }

  override def flushApiCache(flushApiCacheRequest: FlushApiCacheRequest): IO[FlushApiCacheResponse] =
    IO.fromFuture {
      IO(underlying.flushApiCache(flushApiCacheRequest))
    }

  override def getApiCache(getApiCacheRequest: GetApiCacheRequest): IO[GetApiCacheResponse] =
    IO.fromFuture {
      IO(underlying.getApiCache(getApiCacheRequest))
    }

  override def getDataSource(getDataSourceRequest: GetDataSourceRequest): IO[GetDataSourceResponse] =
    IO.fromFuture {
      IO(underlying.getDataSource(getDataSourceRequest))
    }

  override def getFunction(getFunctionRequest: GetFunctionRequest): IO[GetFunctionResponse] =
    IO.fromFuture {
      IO(underlying.getFunction(getFunctionRequest))
    }

  override def getGraphqlApi(getGraphqlApiRequest: GetGraphqlApiRequest): IO[GetGraphqlApiResponse] =
    IO.fromFuture {
      IO(underlying.getGraphqlApi(getGraphqlApiRequest))
    }

  override def getIntrospectionSchema(
      getIntrospectionSchemaRequest: GetIntrospectionSchemaRequest
  ): IO[GetIntrospectionSchemaResponse] =
    IO.fromFuture {
      IO(underlying.getIntrospectionSchema(getIntrospectionSchemaRequest))
    }

  override def getResolver(getResolverRequest: GetResolverRequest): IO[GetResolverResponse] =
    IO.fromFuture {
      IO(underlying.getResolver(getResolverRequest))
    }

  override def getSchemaCreationStatus(
      getSchemaCreationStatusRequest: GetSchemaCreationStatusRequest
  ): IO[GetSchemaCreationStatusResponse] =
    IO.fromFuture {
      IO(underlying.getSchemaCreationStatus(getSchemaCreationStatusRequest))
    }

  override def getType(getTypeRequest: GetTypeRequest): IO[GetTypeResponse] =
    IO.fromFuture {
      IO(underlying.getType(getTypeRequest))
    }

  override def listApiKeys(listApiKeysRequest: ListApiKeysRequest): IO[ListApiKeysResponse] =
    IO.fromFuture {
      IO(underlying.listApiKeys(listApiKeysRequest))
    }

  override def listDataSources(listDataSourcesRequest: ListDataSourcesRequest): IO[ListDataSourcesResponse] =
    IO.fromFuture {
      IO(underlying.listDataSources(listDataSourcesRequest))
    }

  override def listFunctions(listFunctionsRequest: ListFunctionsRequest): IO[ListFunctionsResponse] =
    IO.fromFuture {
      IO(underlying.listFunctions(listFunctionsRequest))
    }

  override def listGraphqlApis(listGraphqlApisRequest: ListGraphqlApisRequest): IO[ListGraphqlApisResponse] =
    IO.fromFuture {
      IO(underlying.listGraphqlApis(listGraphqlApisRequest))
    }

  override def listGraphqlApis(): IO[ListGraphqlApisResponse] =
    IO.fromFuture {
      IO(underlying.listGraphqlApis())
    }

  override def listResolvers(listResolversRequest: ListResolversRequest): IO[ListResolversResponse] =
    IO.fromFuture {
      IO(underlying.listResolvers(listResolversRequest))
    }

  override def listResolversByFunction(
      listResolversByFunctionRequest: ListResolversByFunctionRequest
  ): IO[ListResolversByFunctionResponse] =
    IO.fromFuture {
      IO(underlying.listResolversByFunction(listResolversByFunctionRequest))
    }

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): IO[ListTagsForResourceResponse] =
    IO.fromFuture {
      IO(underlying.listTagsForResource(listTagsForResourceRequest))
    }

  override def listTypes(listTypesRequest: ListTypesRequest): IO[ListTypesResponse] =
    IO.fromFuture {
      IO(underlying.listTypes(listTypesRequest))
    }

  override def startSchemaCreation(
      startSchemaCreationRequest: StartSchemaCreationRequest
  ): IO[StartSchemaCreationResponse] =
    IO.fromFuture {
      IO(underlying.startSchemaCreation(startSchemaCreationRequest))
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): IO[TagResourceResponse] =
    IO.fromFuture {
      IO(underlying.tagResource(tagResourceRequest))
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): IO[UntagResourceResponse] =
    IO.fromFuture {
      IO(underlying.untagResource(untagResourceRequest))
    }

  override def updateApiCache(updateApiCacheRequest: UpdateApiCacheRequest): IO[UpdateApiCacheResponse] =
    IO.fromFuture {
      IO(underlying.updateApiCache(updateApiCacheRequest))
    }

  override def updateApiKey(updateApiKeyRequest: UpdateApiKeyRequest): IO[UpdateApiKeyResponse] =
    IO.fromFuture {
      IO(underlying.updateApiKey(updateApiKeyRequest))
    }

  override def updateDataSource(updateDataSourceRequest: UpdateDataSourceRequest): IO[UpdateDataSourceResponse] =
    IO.fromFuture {
      IO(underlying.updateDataSource(updateDataSourceRequest))
    }

  override def updateFunction(updateFunctionRequest: UpdateFunctionRequest): IO[UpdateFunctionResponse] =
    IO.fromFuture {
      IO(underlying.updateFunction(updateFunctionRequest))
    }

  override def updateGraphqlApi(updateGraphqlApiRequest: UpdateGraphqlApiRequest): IO[UpdateGraphqlApiResponse] =
    IO.fromFuture {
      IO(underlying.updateGraphqlApi(updateGraphqlApiRequest))
    }

  override def updateResolver(updateResolverRequest: UpdateResolverRequest): IO[UpdateResolverResponse] =
    IO.fromFuture {
      IO(underlying.updateResolver(updateResolverRequest))
    }

  override def updateType(updateTypeRequest: UpdateTypeRequest): IO[UpdateTypeResponse] =
    IO.fromFuture {
      IO(underlying.updateType(updateTypeRequest))
    }

}
