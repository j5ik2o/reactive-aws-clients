// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.monix

import software.amazon.awssdk.services.appsync.model._
import com.github.j5ik2o.reactive.aws.appsync.{ AppSyncAsyncClient, AppSyncClient }
import monix.eval.Task
import monix.reactive.Observable

object AppSyncMonixClient {

  def apply(underlying: AppSyncAsyncClient): AppSyncMonixClient = new AppSyncMonixClientImpl(underlying)

}

trait AppSyncMonixClient extends AppSyncClient[Task] {

  val underlying: AppSyncAsyncClient

  override def createApiKey(createApiKeyRequest: CreateApiKeyRequest): Task[CreateApiKeyResponse] =
    Task.deferFuture {
      underlying.createApiKey(createApiKeyRequest)
    }

  override def createDataSource(createDataSourceRequest: CreateDataSourceRequest): Task[CreateDataSourceResponse] =
    Task.deferFuture {
      underlying.createDataSource(createDataSourceRequest)
    }

  override def createFunction(createFunctionRequest: CreateFunctionRequest): Task[CreateFunctionResponse] =
    Task.deferFuture {
      underlying.createFunction(createFunctionRequest)
    }

  override def createGraphqlApi(createGraphqlApiRequest: CreateGraphqlApiRequest): Task[CreateGraphqlApiResponse] =
    Task.deferFuture {
      underlying.createGraphqlApi(createGraphqlApiRequest)
    }

  override def createResolver(createResolverRequest: CreateResolverRequest): Task[CreateResolverResponse] =
    Task.deferFuture {
      underlying.createResolver(createResolverRequest)
    }

  override def createType(createTypeRequest: CreateTypeRequest): Task[CreateTypeResponse] =
    Task.deferFuture {
      underlying.createType(createTypeRequest)
    }

  override def deleteApiKey(deleteApiKeyRequest: DeleteApiKeyRequest): Task[DeleteApiKeyResponse] =
    Task.deferFuture {
      underlying.deleteApiKey(deleteApiKeyRequest)
    }

  override def deleteDataSource(deleteDataSourceRequest: DeleteDataSourceRequest): Task[DeleteDataSourceResponse] =
    Task.deferFuture {
      underlying.deleteDataSource(deleteDataSourceRequest)
    }

  override def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): Task[DeleteFunctionResponse] =
    Task.deferFuture {
      underlying.deleteFunction(deleteFunctionRequest)
    }

  override def deleteGraphqlApi(deleteGraphqlApiRequest: DeleteGraphqlApiRequest): Task[DeleteGraphqlApiResponse] =
    Task.deferFuture {
      underlying.deleteGraphqlApi(deleteGraphqlApiRequest)
    }

  override def deleteResolver(deleteResolverRequest: DeleteResolverRequest): Task[DeleteResolverResponse] =
    Task.deferFuture {
      underlying.deleteResolver(deleteResolverRequest)
    }

  override def deleteType(deleteTypeRequest: DeleteTypeRequest): Task[DeleteTypeResponse] =
    Task.deferFuture {
      underlying.deleteType(deleteTypeRequest)
    }

  override def getDataSource(getDataSourceRequest: GetDataSourceRequest): Task[GetDataSourceResponse] =
    Task.deferFuture {
      underlying.getDataSource(getDataSourceRequest)
    }

  override def getFunction(getFunctionRequest: GetFunctionRequest): Task[GetFunctionResponse] =
    Task.deferFuture {
      underlying.getFunction(getFunctionRequest)
    }

  override def getGraphqlApi(getGraphqlApiRequest: GetGraphqlApiRequest): Task[GetGraphqlApiResponse] =
    Task.deferFuture {
      underlying.getGraphqlApi(getGraphqlApiRequest)
    }

  override def getIntrospectionSchema(
      getIntrospectionSchemaRequest: GetIntrospectionSchemaRequest
  ): Task[GetIntrospectionSchemaResponse] =
    Task.deferFuture {
      underlying.getIntrospectionSchema(getIntrospectionSchemaRequest)
    }

  override def getResolver(getResolverRequest: GetResolverRequest): Task[GetResolverResponse] =
    Task.deferFuture {
      underlying.getResolver(getResolverRequest)
    }

  override def getSchemaCreationStatus(
      getSchemaCreationStatusRequest: GetSchemaCreationStatusRequest
  ): Task[GetSchemaCreationStatusResponse] =
    Task.deferFuture {
      underlying.getSchemaCreationStatus(getSchemaCreationStatusRequest)
    }

  override def getType(getTypeRequest: GetTypeRequest): Task[GetTypeResponse] =
    Task.deferFuture {
      underlying.getType(getTypeRequest)
    }

  override def listApiKeys(listApiKeysRequest: ListApiKeysRequest): Task[ListApiKeysResponse] =
    Task.deferFuture {
      underlying.listApiKeys(listApiKeysRequest)
    }

  override def listDataSources(listDataSourcesRequest: ListDataSourcesRequest): Task[ListDataSourcesResponse] =
    Task.deferFuture {
      underlying.listDataSources(listDataSourcesRequest)
    }

  override def listFunctions(listFunctionsRequest: ListFunctionsRequest): Task[ListFunctionsResponse] =
    Task.deferFuture {
      underlying.listFunctions(listFunctionsRequest)
    }

  override def listGraphqlApis(listGraphqlApisRequest: ListGraphqlApisRequest): Task[ListGraphqlApisResponse] =
    Task.deferFuture {
      underlying.listGraphqlApis(listGraphqlApisRequest)
    }

  override def listGraphqlApis(): Task[ListGraphqlApisResponse] =
    Task.deferFuture {
      underlying.listGraphqlApis()
    }

  override def listResolvers(listResolversRequest: ListResolversRequest): Task[ListResolversResponse] =
    Task.deferFuture {
      underlying.listResolvers(listResolversRequest)
    }

  override def listResolversByFunction(
      listResolversByFunctionRequest: ListResolversByFunctionRequest
  ): Task[ListResolversByFunctionResponse] =
    Task.deferFuture {
      underlying.listResolversByFunction(listResolversByFunctionRequest)
    }

  override def listTypes(listTypesRequest: ListTypesRequest): Task[ListTypesResponse] =
    Task.deferFuture {
      underlying.listTypes(listTypesRequest)
    }

  override def startSchemaCreation(
      startSchemaCreationRequest: StartSchemaCreationRequest
  ): Task[StartSchemaCreationResponse] =
    Task.deferFuture {
      underlying.startSchemaCreation(startSchemaCreationRequest)
    }

  override def updateApiKey(updateApiKeyRequest: UpdateApiKeyRequest): Task[UpdateApiKeyResponse] =
    Task.deferFuture {
      underlying.updateApiKey(updateApiKeyRequest)
    }

  override def updateDataSource(updateDataSourceRequest: UpdateDataSourceRequest): Task[UpdateDataSourceResponse] =
    Task.deferFuture {
      underlying.updateDataSource(updateDataSourceRequest)
    }

  override def updateFunction(updateFunctionRequest: UpdateFunctionRequest): Task[UpdateFunctionResponse] =
    Task.deferFuture {
      underlying.updateFunction(updateFunctionRequest)
    }

  override def updateGraphqlApi(updateGraphqlApiRequest: UpdateGraphqlApiRequest): Task[UpdateGraphqlApiResponse] =
    Task.deferFuture {
      underlying.updateGraphqlApi(updateGraphqlApiRequest)
    }

  override def updateResolver(updateResolverRequest: UpdateResolverRequest): Task[UpdateResolverResponse] =
    Task.deferFuture {
      underlying.updateResolver(updateResolverRequest)
    }

  override def updateType(updateTypeRequest: UpdateTypeRequest): Task[UpdateTypeResponse] =
    Task.deferFuture {
      underlying.updateType(updateTypeRequest)
    }

}
