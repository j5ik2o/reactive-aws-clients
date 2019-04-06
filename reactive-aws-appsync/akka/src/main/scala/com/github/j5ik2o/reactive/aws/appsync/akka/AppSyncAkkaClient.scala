// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.appsync.AppSyncAsyncClient
import software.amazon.awssdk.services.appsync.model._

import scala.concurrent.Future

object AppSyncAkkaClient {

  def apply(underlying: AppSyncAsyncClient): AppSyncAkkaClient = new AppSyncAkkaClientImpl(underlying)

  val DefaultParallelism: Int = 1

}

trait AppSyncAkkaClient {

  import AppSyncAkkaClient._

  val underlying: AppSyncAsyncClient

  def createApiKeySource(createApiKeyRequest: CreateApiKeyRequest,
                         parallelism: Int = DefaultParallelism): Source[CreateApiKeyResponse, NotUsed] =
    Source.single(createApiKeyRequest).via(createApiKeyFlow(parallelism))

  def createApiKeyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateApiKeyRequest, CreateApiKeyResponse, NotUsed] =
    Flow[CreateApiKeyRequest].mapAsync(parallelism) { createApiKeyRequest =>
      underlying.createApiKey(createApiKeyRequest)
    }

  def createDataSourceSource(createDataSourceRequest: CreateDataSourceRequest,
                             parallelism: Int = DefaultParallelism): Source[CreateDataSourceResponse, NotUsed] =
    Source.single(createDataSourceRequest).via(createDataSourceFlow(parallelism))

  def createDataSourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateDataSourceRequest, CreateDataSourceResponse, NotUsed] =
    Flow[CreateDataSourceRequest].mapAsync(parallelism) { createDataSourceRequest =>
      underlying.createDataSource(createDataSourceRequest)
    }

  def createFunctionSource(createFunctionRequest: CreateFunctionRequest,
                           parallelism: Int = DefaultParallelism): Source[CreateFunctionResponse, NotUsed] =
    Source.single(createFunctionRequest).via(createFunctionFlow(parallelism))

  def createFunctionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateFunctionRequest, CreateFunctionResponse, NotUsed] =
    Flow[CreateFunctionRequest].mapAsync(parallelism) { createFunctionRequest =>
      underlying.createFunction(createFunctionRequest)
    }

  def createGraphqlApiSource(createGraphqlApiRequest: CreateGraphqlApiRequest,
                             parallelism: Int = DefaultParallelism): Source[CreateGraphqlApiResponse, NotUsed] =
    Source.single(createGraphqlApiRequest).via(createGraphqlApiFlow(parallelism))

  def createGraphqlApiFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateGraphqlApiRequest, CreateGraphqlApiResponse, NotUsed] =
    Flow[CreateGraphqlApiRequest].mapAsync(parallelism) { createGraphqlApiRequest =>
      underlying.createGraphqlApi(createGraphqlApiRequest)
    }

  def createResolverSource(createResolverRequest: CreateResolverRequest,
                           parallelism: Int = DefaultParallelism): Source[CreateResolverResponse, NotUsed] =
    Source.single(createResolverRequest).via(createResolverFlow(parallelism))

  def createResolverFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateResolverRequest, CreateResolverResponse, NotUsed] =
    Flow[CreateResolverRequest].mapAsync(parallelism) { createResolverRequest =>
      underlying.createResolver(createResolverRequest)
    }

  def createTypeSource(createTypeRequest: CreateTypeRequest,
                       parallelism: Int = DefaultParallelism): Source[CreateTypeResponse, NotUsed] =
    Source.single(createTypeRequest).via(createTypeFlow(parallelism))

  def createTypeFlow(parallelism: Int = DefaultParallelism): Flow[CreateTypeRequest, CreateTypeResponse, NotUsed] =
    Flow[CreateTypeRequest].mapAsync(parallelism) { createTypeRequest =>
      underlying.createType(createTypeRequest)
    }

  def deleteApiKeySource(deleteApiKeyRequest: DeleteApiKeyRequest,
                         parallelism: Int = DefaultParallelism): Source[DeleteApiKeyResponse, NotUsed] =
    Source.single(deleteApiKeyRequest).via(deleteApiKeyFlow(parallelism))

  def deleteApiKeyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteApiKeyRequest, DeleteApiKeyResponse, NotUsed] =
    Flow[DeleteApiKeyRequest].mapAsync(parallelism) { deleteApiKeyRequest =>
      underlying.deleteApiKey(deleteApiKeyRequest)
    }

  def deleteDataSourceSource(deleteDataSourceRequest: DeleteDataSourceRequest,
                             parallelism: Int = DefaultParallelism): Source[DeleteDataSourceResponse, NotUsed] =
    Source.single(deleteDataSourceRequest).via(deleteDataSourceFlow(parallelism))

  def deleteDataSourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteDataSourceRequest, DeleteDataSourceResponse, NotUsed] =
    Flow[DeleteDataSourceRequest].mapAsync(parallelism) { deleteDataSourceRequest =>
      underlying.deleteDataSource(deleteDataSourceRequest)
    }

  def deleteFunctionSource(deleteFunctionRequest: DeleteFunctionRequest,
                           parallelism: Int = DefaultParallelism): Source[DeleteFunctionResponse, NotUsed] =
    Source.single(deleteFunctionRequest).via(deleteFunctionFlow(parallelism))

  def deleteFunctionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteFunctionRequest, DeleteFunctionResponse, NotUsed] =
    Flow[DeleteFunctionRequest].mapAsync(parallelism) { deleteFunctionRequest =>
      underlying.deleteFunction(deleteFunctionRequest)
    }

  def deleteGraphqlApiSource(deleteGraphqlApiRequest: DeleteGraphqlApiRequest,
                             parallelism: Int = DefaultParallelism): Source[DeleteGraphqlApiResponse, NotUsed] =
    Source.single(deleteGraphqlApiRequest).via(deleteGraphqlApiFlow(parallelism))

  def deleteGraphqlApiFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteGraphqlApiRequest, DeleteGraphqlApiResponse, NotUsed] =
    Flow[DeleteGraphqlApiRequest].mapAsync(parallelism) { deleteGraphqlApiRequest =>
      underlying.deleteGraphqlApi(deleteGraphqlApiRequest)
    }

  def deleteResolverSource(deleteResolverRequest: DeleteResolverRequest,
                           parallelism: Int = DefaultParallelism): Source[DeleteResolverResponse, NotUsed] =
    Source.single(deleteResolverRequest).via(deleteResolverFlow(parallelism))

  def deleteResolverFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteResolverRequest, DeleteResolverResponse, NotUsed] =
    Flow[DeleteResolverRequest].mapAsync(parallelism) { deleteResolverRequest =>
      underlying.deleteResolver(deleteResolverRequest)
    }

  def deleteTypeSource(deleteTypeRequest: DeleteTypeRequest,
                       parallelism: Int = DefaultParallelism): Source[DeleteTypeResponse, NotUsed] =
    Source.single(deleteTypeRequest).via(deleteTypeFlow(parallelism))

  def deleteTypeFlow(parallelism: Int = DefaultParallelism): Flow[DeleteTypeRequest, DeleteTypeResponse, NotUsed] =
    Flow[DeleteTypeRequest].mapAsync(parallelism) { deleteTypeRequest =>
      underlying.deleteType(deleteTypeRequest)
    }

  def getDataSourceSource(getDataSourceRequest: GetDataSourceRequest,
                          parallelism: Int = DefaultParallelism): Source[GetDataSourceResponse, NotUsed] =
    Source.single(getDataSourceRequest).via(getDataSourceFlow(parallelism))

  def getDataSourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetDataSourceRequest, GetDataSourceResponse, NotUsed] =
    Flow[GetDataSourceRequest].mapAsync(parallelism) { getDataSourceRequest =>
      underlying.getDataSource(getDataSourceRequest)
    }

  def getFunctionSource(getFunctionRequest: GetFunctionRequest,
                        parallelism: Int = DefaultParallelism): Source[GetFunctionResponse, NotUsed] =
    Source.single(getFunctionRequest).via(getFunctionFlow(parallelism))

  def getFunctionFlow(parallelism: Int = DefaultParallelism): Flow[GetFunctionRequest, GetFunctionResponse, NotUsed] =
    Flow[GetFunctionRequest].mapAsync(parallelism) { getFunctionRequest =>
      underlying.getFunction(getFunctionRequest)
    }

  def getGraphqlApiSource(getGraphqlApiRequest: GetGraphqlApiRequest,
                          parallelism: Int = DefaultParallelism): Source[GetGraphqlApiResponse, NotUsed] =
    Source.single(getGraphqlApiRequest).via(getGraphqlApiFlow(parallelism))

  def getGraphqlApiFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetGraphqlApiRequest, GetGraphqlApiResponse, NotUsed] =
    Flow[GetGraphqlApiRequest].mapAsync(parallelism) { getGraphqlApiRequest =>
      underlying.getGraphqlApi(getGraphqlApiRequest)
    }

  def getIntrospectionSchemaSource(
      getIntrospectionSchemaRequest: GetIntrospectionSchemaRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetIntrospectionSchemaResponse, NotUsed] =
    Source.single(getIntrospectionSchemaRequest).via(getIntrospectionSchemaFlow(parallelism))

  def getIntrospectionSchemaFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetIntrospectionSchemaRequest, GetIntrospectionSchemaResponse, NotUsed] =
    Flow[GetIntrospectionSchemaRequest].mapAsync(parallelism) { getIntrospectionSchemaRequest =>
      underlying.getIntrospectionSchema(getIntrospectionSchemaRequest)
    }

  def getResolverSource(getResolverRequest: GetResolverRequest,
                        parallelism: Int = DefaultParallelism): Source[GetResolverResponse, NotUsed] =
    Source.single(getResolverRequest).via(getResolverFlow(parallelism))

  def getResolverFlow(parallelism: Int = DefaultParallelism): Flow[GetResolverRequest, GetResolverResponse, NotUsed] =
    Flow[GetResolverRequest].mapAsync(parallelism) { getResolverRequest =>
      underlying.getResolver(getResolverRequest)
    }

  def getSchemaCreationStatusSource(
      getSchemaCreationStatusRequest: GetSchemaCreationStatusRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetSchemaCreationStatusResponse, NotUsed] =
    Source.single(getSchemaCreationStatusRequest).via(getSchemaCreationStatusFlow(parallelism))

  def getSchemaCreationStatusFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetSchemaCreationStatusRequest, GetSchemaCreationStatusResponse, NotUsed] =
    Flow[GetSchemaCreationStatusRequest].mapAsync(parallelism) { getSchemaCreationStatusRequest =>
      underlying.getSchemaCreationStatus(getSchemaCreationStatusRequest)
    }

  def getTypeSource(getTypeRequest: GetTypeRequest,
                    parallelism: Int = DefaultParallelism): Source[GetTypeResponse, NotUsed] =
    Source.single(getTypeRequest).via(getTypeFlow(parallelism))

  def getTypeFlow(parallelism: Int = DefaultParallelism): Flow[GetTypeRequest, GetTypeResponse, NotUsed] =
    Flow[GetTypeRequest].mapAsync(parallelism) { getTypeRequest =>
      underlying.getType(getTypeRequest)
    }

  def listApiKeysSource(listApiKeysRequest: ListApiKeysRequest,
                        parallelism: Int = DefaultParallelism): Source[ListApiKeysResponse, NotUsed] =
    Source.single(listApiKeysRequest).via(listApiKeysFlow(parallelism))

  def listApiKeysFlow(parallelism: Int = DefaultParallelism): Flow[ListApiKeysRequest, ListApiKeysResponse, NotUsed] =
    Flow[ListApiKeysRequest].mapAsync(parallelism) { listApiKeysRequest =>
      underlying.listApiKeys(listApiKeysRequest)
    }

  def listDataSourcesSource(listDataSourcesRequest: ListDataSourcesRequest,
                            parallelism: Int = DefaultParallelism): Source[ListDataSourcesResponse, NotUsed] =
    Source.single(listDataSourcesRequest).via(listDataSourcesFlow(parallelism))

  def listDataSourcesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListDataSourcesRequest, ListDataSourcesResponse, NotUsed] =
    Flow[ListDataSourcesRequest].mapAsync(parallelism) { listDataSourcesRequest =>
      underlying.listDataSources(listDataSourcesRequest)
    }

  def listFunctionsSource(listFunctionsRequest: ListFunctionsRequest,
                          parallelism: Int = DefaultParallelism): Source[ListFunctionsResponse, NotUsed] =
    Source.single(listFunctionsRequest).via(listFunctionsFlow(parallelism))

  def listFunctionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListFunctionsRequest, ListFunctionsResponse, NotUsed] =
    Flow[ListFunctionsRequest].mapAsync(parallelism) { listFunctionsRequest =>
      underlying.listFunctions(listFunctionsRequest)
    }

  def listGraphqlApisSource(listGraphqlApisRequest: ListGraphqlApisRequest,
                            parallelism: Int = DefaultParallelism): Source[ListGraphqlApisResponse, NotUsed] =
    Source.single(listGraphqlApisRequest).via(listGraphqlApisFlow(parallelism))

  def listGraphqlApisFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListGraphqlApisRequest, ListGraphqlApisResponse, NotUsed] =
    Flow[ListGraphqlApisRequest].mapAsync(parallelism) { listGraphqlApisRequest =>
      underlying.listGraphqlApis(listGraphqlApisRequest)
    }

  def listGraphqlApisSource(): Source[ListGraphqlApisResponse, NotUsed] =
    Source.fromFuture(underlying.listGraphqlApis())

  def listResolversSource(listResolversRequest: ListResolversRequest,
                          parallelism: Int = DefaultParallelism): Source[ListResolversResponse, NotUsed] =
    Source.single(listResolversRequest).via(listResolversFlow(parallelism))

  def listResolversFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListResolversRequest, ListResolversResponse, NotUsed] =
    Flow[ListResolversRequest].mapAsync(parallelism) { listResolversRequest =>
      underlying.listResolvers(listResolversRequest)
    }

  def listResolversByFunctionSource(
      listResolversByFunctionRequest: ListResolversByFunctionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListResolversByFunctionResponse, NotUsed] =
    Source.single(listResolversByFunctionRequest).via(listResolversByFunctionFlow(parallelism))

  def listResolversByFunctionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListResolversByFunctionRequest, ListResolversByFunctionResponse, NotUsed] =
    Flow[ListResolversByFunctionRequest].mapAsync(parallelism) { listResolversByFunctionRequest =>
      underlying.listResolversByFunction(listResolversByFunctionRequest)
    }

  def listTypesSource(listTypesRequest: ListTypesRequest,
                      parallelism: Int = DefaultParallelism): Source[ListTypesResponse, NotUsed] =
    Source.single(listTypesRequest).via(listTypesFlow(parallelism))

  def listTypesFlow(parallelism: Int = DefaultParallelism): Flow[ListTypesRequest, ListTypesResponse, NotUsed] =
    Flow[ListTypesRequest].mapAsync(parallelism) { listTypesRequest =>
      underlying.listTypes(listTypesRequest)
    }

  def startSchemaCreationSource(startSchemaCreationRequest: StartSchemaCreationRequest,
                                parallelism: Int = DefaultParallelism): Source[StartSchemaCreationResponse, NotUsed] =
    Source.single(startSchemaCreationRequest).via(startSchemaCreationFlow(parallelism))

  def startSchemaCreationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartSchemaCreationRequest, StartSchemaCreationResponse, NotUsed] =
    Flow[StartSchemaCreationRequest].mapAsync(parallelism) { startSchemaCreationRequest =>
      underlying.startSchemaCreation(startSchemaCreationRequest)
    }

  def updateApiKeySource(updateApiKeyRequest: UpdateApiKeyRequest,
                         parallelism: Int = DefaultParallelism): Source[UpdateApiKeyResponse, NotUsed] =
    Source.single(updateApiKeyRequest).via(updateApiKeyFlow(parallelism))

  def updateApiKeyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateApiKeyRequest, UpdateApiKeyResponse, NotUsed] =
    Flow[UpdateApiKeyRequest].mapAsync(parallelism) { updateApiKeyRequest =>
      underlying.updateApiKey(updateApiKeyRequest)
    }

  def updateDataSourceSource(updateDataSourceRequest: UpdateDataSourceRequest,
                             parallelism: Int = DefaultParallelism): Source[UpdateDataSourceResponse, NotUsed] =
    Source.single(updateDataSourceRequest).via(updateDataSourceFlow(parallelism))

  def updateDataSourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateDataSourceRequest, UpdateDataSourceResponse, NotUsed] =
    Flow[UpdateDataSourceRequest].mapAsync(parallelism) { updateDataSourceRequest =>
      underlying.updateDataSource(updateDataSourceRequest)
    }

  def updateFunctionSource(updateFunctionRequest: UpdateFunctionRequest,
                           parallelism: Int = DefaultParallelism): Source[UpdateFunctionResponse, NotUsed] =
    Source.single(updateFunctionRequest).via(updateFunctionFlow(parallelism))

  def updateFunctionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateFunctionRequest, UpdateFunctionResponse, NotUsed] =
    Flow[UpdateFunctionRequest].mapAsync(parallelism) { updateFunctionRequest =>
      underlying.updateFunction(updateFunctionRequest)
    }

  def updateGraphqlApiSource(updateGraphqlApiRequest: UpdateGraphqlApiRequest,
                             parallelism: Int = DefaultParallelism): Source[UpdateGraphqlApiResponse, NotUsed] =
    Source.single(updateGraphqlApiRequest).via(updateGraphqlApiFlow(parallelism))

  def updateGraphqlApiFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateGraphqlApiRequest, UpdateGraphqlApiResponse, NotUsed] =
    Flow[UpdateGraphqlApiRequest].mapAsync(parallelism) { updateGraphqlApiRequest =>
      underlying.updateGraphqlApi(updateGraphqlApiRequest)
    }

  def updateResolverSource(updateResolverRequest: UpdateResolverRequest,
                           parallelism: Int = DefaultParallelism): Source[UpdateResolverResponse, NotUsed] =
    Source.single(updateResolverRequest).via(updateResolverFlow(parallelism))

  def updateResolverFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateResolverRequest, UpdateResolverResponse, NotUsed] =
    Flow[UpdateResolverRequest].mapAsync(parallelism) { updateResolverRequest =>
      underlying.updateResolver(updateResolverRequest)
    }

  def updateTypeSource(updateTypeRequest: UpdateTypeRequest,
                       parallelism: Int = DefaultParallelism): Source[UpdateTypeResponse, NotUsed] =
    Source.single(updateTypeRequest).via(updateTypeFlow(parallelism))

  def updateTypeFlow(parallelism: Int = DefaultParallelism): Flow[UpdateTypeRequest, UpdateTypeResponse, NotUsed] =
    Flow[UpdateTypeRequest].mapAsync(parallelism) { updateTypeRequest =>
      underlying.updateType(updateTypeRequest)
    }

}
