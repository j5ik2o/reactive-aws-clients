// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.lambda.LambdaAsyncClient
import software.amazon.awssdk.services.lambda.model._

object LambdaAkkaClient {

  def apply(asyncClient: LambdaAsyncClient): LambdaAkkaClient =
    new LambdaAkkaClient {
      override val underlying: LambdaAsyncClient = asyncClient
    }

  val DefaultParallelism: Int = 1

}

trait LambdaAkkaClient {

  import LambdaAkkaClient._

  val underlying: LambdaAsyncClient

  def addLayerVersionPermissionSource(
      addLayerVersionPermissionRequest: AddLayerVersionPermissionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AddLayerVersionPermissionResponse, NotUsed] =
    Source.single(addLayerVersionPermissionRequest).via(addLayerVersionPermissionFlow(parallelism))

  def addLayerVersionPermissionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AddLayerVersionPermissionRequest, AddLayerVersionPermissionResponse, NotUsed] =
    Flow[AddLayerVersionPermissionRequest].mapAsync(parallelism) { addLayerVersionPermissionRequest =>
      underlying.addLayerVersionPermission(addLayerVersionPermissionRequest)
    }

  def addPermissionSource(
      addPermissionRequest: AddPermissionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AddPermissionResponse, NotUsed] =
    Source.single(addPermissionRequest).via(addPermissionFlow(parallelism))

  def addPermissionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AddPermissionRequest, AddPermissionResponse, NotUsed] =
    Flow[AddPermissionRequest].mapAsync(parallelism) { addPermissionRequest =>
      underlying.addPermission(addPermissionRequest)
    }

  def createAliasSource(
      createAliasRequest: CreateAliasRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateAliasResponse, NotUsed] =
    Source.single(createAliasRequest).via(createAliasFlow(parallelism))

  def createAliasFlow(parallelism: Int = DefaultParallelism): Flow[CreateAliasRequest, CreateAliasResponse, NotUsed] =
    Flow[CreateAliasRequest].mapAsync(parallelism) { createAliasRequest =>
      underlying.createAlias(createAliasRequest)
    }

  def createEventSourceMappingSource(
      createEventSourceMappingRequest: CreateEventSourceMappingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateEventSourceMappingResponse, NotUsed] =
    Source.single(createEventSourceMappingRequest).via(createEventSourceMappingFlow(parallelism))

  def createEventSourceMappingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateEventSourceMappingRequest, CreateEventSourceMappingResponse, NotUsed] =
    Flow[CreateEventSourceMappingRequest].mapAsync(parallelism) { createEventSourceMappingRequest =>
      underlying.createEventSourceMapping(createEventSourceMappingRequest)
    }

  def createFunctionSource(
      createFunctionRequest: CreateFunctionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateFunctionResponse, NotUsed] =
    Source.single(createFunctionRequest).via(createFunctionFlow(parallelism))

  def createFunctionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateFunctionRequest, CreateFunctionResponse, NotUsed] =
    Flow[CreateFunctionRequest].mapAsync(parallelism) { createFunctionRequest =>
      underlying.createFunction(createFunctionRequest)
    }

  def deleteAliasSource(
      deleteAliasRequest: DeleteAliasRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteAliasResponse, NotUsed] =
    Source.single(deleteAliasRequest).via(deleteAliasFlow(parallelism))

  def deleteAliasFlow(parallelism: Int = DefaultParallelism): Flow[DeleteAliasRequest, DeleteAliasResponse, NotUsed] =
    Flow[DeleteAliasRequest].mapAsync(parallelism) { deleteAliasRequest =>
      underlying.deleteAlias(deleteAliasRequest)
    }

  def deleteEventSourceMappingSource(
      deleteEventSourceMappingRequest: DeleteEventSourceMappingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteEventSourceMappingResponse, NotUsed] =
    Source.single(deleteEventSourceMappingRequest).via(deleteEventSourceMappingFlow(parallelism))

  def deleteEventSourceMappingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteEventSourceMappingRequest, DeleteEventSourceMappingResponse, NotUsed] =
    Flow[DeleteEventSourceMappingRequest].mapAsync(parallelism) { deleteEventSourceMappingRequest =>
      underlying.deleteEventSourceMapping(deleteEventSourceMappingRequest)
    }

  def deleteFunctionSource(
      deleteFunctionRequest: DeleteFunctionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteFunctionResponse, NotUsed] =
    Source.single(deleteFunctionRequest).via(deleteFunctionFlow(parallelism))

  def deleteFunctionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteFunctionRequest, DeleteFunctionResponse, NotUsed] =
    Flow[DeleteFunctionRequest].mapAsync(parallelism) { deleteFunctionRequest =>
      underlying.deleteFunction(deleteFunctionRequest)
    }

  def deleteFunctionConcurrencySource(
      deleteFunctionConcurrencyRequest: DeleteFunctionConcurrencyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteFunctionConcurrencyResponse, NotUsed] =
    Source.single(deleteFunctionConcurrencyRequest).via(deleteFunctionConcurrencyFlow(parallelism))

  def deleteFunctionConcurrencyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteFunctionConcurrencyRequest, DeleteFunctionConcurrencyResponse, NotUsed] =
    Flow[DeleteFunctionConcurrencyRequest].mapAsync(parallelism) { deleteFunctionConcurrencyRequest =>
      underlying.deleteFunctionConcurrency(deleteFunctionConcurrencyRequest)
    }

  def deleteFunctionEventInvokeConfigSource(
      deleteFunctionEventInvokeConfigRequest: DeleteFunctionEventInvokeConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteFunctionEventInvokeConfigResponse, NotUsed] =
    Source.single(deleteFunctionEventInvokeConfigRequest).via(deleteFunctionEventInvokeConfigFlow(parallelism))

  def deleteFunctionEventInvokeConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteFunctionEventInvokeConfigRequest, DeleteFunctionEventInvokeConfigResponse, NotUsed] =
    Flow[DeleteFunctionEventInvokeConfigRequest].mapAsync(parallelism) { deleteFunctionEventInvokeConfigRequest =>
      underlying.deleteFunctionEventInvokeConfig(deleteFunctionEventInvokeConfigRequest)
    }

  def deleteLayerVersionSource(
      deleteLayerVersionRequest: DeleteLayerVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteLayerVersionResponse, NotUsed] =
    Source.single(deleteLayerVersionRequest).via(deleteLayerVersionFlow(parallelism))

  def deleteLayerVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteLayerVersionRequest, DeleteLayerVersionResponse, NotUsed] =
    Flow[DeleteLayerVersionRequest].mapAsync(parallelism) { deleteLayerVersionRequest =>
      underlying.deleteLayerVersion(deleteLayerVersionRequest)
    }

  def deleteProvisionedConcurrencyConfigSource(
      deleteProvisionedConcurrencyConfigRequest: DeleteProvisionedConcurrencyConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteProvisionedConcurrencyConfigResponse, NotUsed] =
    Source.single(deleteProvisionedConcurrencyConfigRequest).via(deleteProvisionedConcurrencyConfigFlow(parallelism))

  def deleteProvisionedConcurrencyConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteProvisionedConcurrencyConfigRequest, DeleteProvisionedConcurrencyConfigResponse, NotUsed] =
    Flow[DeleteProvisionedConcurrencyConfigRequest].mapAsync(parallelism) { deleteProvisionedConcurrencyConfigRequest =>
      underlying.deleteProvisionedConcurrencyConfig(deleteProvisionedConcurrencyConfigRequest)
    }

  def getAccountSettingsSource(
      getAccountSettingsRequest: GetAccountSettingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetAccountSettingsResponse, NotUsed] =
    Source.single(getAccountSettingsRequest).via(getAccountSettingsFlow(parallelism))

  def getAccountSettingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetAccountSettingsRequest, GetAccountSettingsResponse, NotUsed] =
    Flow[GetAccountSettingsRequest].mapAsync(parallelism) { getAccountSettingsRequest =>
      underlying.getAccountSettings(getAccountSettingsRequest)
    }

  def getAccountSettingsSource(): Source[GetAccountSettingsResponse, NotUsed] =
    Source.fromFuture(underlying.getAccountSettings())

  def getAliasSource(
      getAliasRequest: GetAliasRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetAliasResponse, NotUsed] =
    Source.single(getAliasRequest).via(getAliasFlow(parallelism))

  def getAliasFlow(parallelism: Int = DefaultParallelism): Flow[GetAliasRequest, GetAliasResponse, NotUsed] =
    Flow[GetAliasRequest].mapAsync(parallelism) { getAliasRequest =>
      underlying.getAlias(getAliasRequest)
    }

  def getEventSourceMappingSource(
      getEventSourceMappingRequest: GetEventSourceMappingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetEventSourceMappingResponse, NotUsed] =
    Source.single(getEventSourceMappingRequest).via(getEventSourceMappingFlow(parallelism))

  def getEventSourceMappingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetEventSourceMappingRequest, GetEventSourceMappingResponse, NotUsed] =
    Flow[GetEventSourceMappingRequest].mapAsync(parallelism) { getEventSourceMappingRequest =>
      underlying.getEventSourceMapping(getEventSourceMappingRequest)
    }

  def getFunctionSource(
      getFunctionRequest: GetFunctionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetFunctionResponse, NotUsed] =
    Source.single(getFunctionRequest).via(getFunctionFlow(parallelism))

  def getFunctionFlow(parallelism: Int = DefaultParallelism): Flow[GetFunctionRequest, GetFunctionResponse, NotUsed] =
    Flow[GetFunctionRequest].mapAsync(parallelism) { getFunctionRequest =>
      underlying.getFunction(getFunctionRequest)
    }

  def getFunctionConcurrencySource(
      getFunctionConcurrencyRequest: GetFunctionConcurrencyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetFunctionConcurrencyResponse, NotUsed] =
    Source.single(getFunctionConcurrencyRequest).via(getFunctionConcurrencyFlow(parallelism))

  def getFunctionConcurrencyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetFunctionConcurrencyRequest, GetFunctionConcurrencyResponse, NotUsed] =
    Flow[GetFunctionConcurrencyRequest].mapAsync(parallelism) { getFunctionConcurrencyRequest =>
      underlying.getFunctionConcurrency(getFunctionConcurrencyRequest)
    }

  def getFunctionConfigurationSource(
      getFunctionConfigurationRequest: GetFunctionConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetFunctionConfigurationResponse, NotUsed] =
    Source.single(getFunctionConfigurationRequest).via(getFunctionConfigurationFlow(parallelism))

  def getFunctionConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetFunctionConfigurationRequest, GetFunctionConfigurationResponse, NotUsed] =
    Flow[GetFunctionConfigurationRequest].mapAsync(parallelism) { getFunctionConfigurationRequest =>
      underlying.getFunctionConfiguration(getFunctionConfigurationRequest)
    }

  def getFunctionEventInvokeConfigSource(
      getFunctionEventInvokeConfigRequest: GetFunctionEventInvokeConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetFunctionEventInvokeConfigResponse, NotUsed] =
    Source.single(getFunctionEventInvokeConfigRequest).via(getFunctionEventInvokeConfigFlow(parallelism))

  def getFunctionEventInvokeConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetFunctionEventInvokeConfigRequest, GetFunctionEventInvokeConfigResponse, NotUsed] =
    Flow[GetFunctionEventInvokeConfigRequest].mapAsync(parallelism) { getFunctionEventInvokeConfigRequest =>
      underlying.getFunctionEventInvokeConfig(getFunctionEventInvokeConfigRequest)
    }

  def getLayerVersionSource(
      getLayerVersionRequest: GetLayerVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetLayerVersionResponse, NotUsed] =
    Source.single(getLayerVersionRequest).via(getLayerVersionFlow(parallelism))

  def getLayerVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLayerVersionRequest, GetLayerVersionResponse, NotUsed] =
    Flow[GetLayerVersionRequest].mapAsync(parallelism) { getLayerVersionRequest =>
      underlying.getLayerVersion(getLayerVersionRequest)
    }

  def getLayerVersionByArnSource(
      getLayerVersionByArnRequest: GetLayerVersionByArnRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetLayerVersionByArnResponse, NotUsed] =
    Source.single(getLayerVersionByArnRequest).via(getLayerVersionByArnFlow(parallelism))

  def getLayerVersionByArnFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLayerVersionByArnRequest, GetLayerVersionByArnResponse, NotUsed] =
    Flow[GetLayerVersionByArnRequest].mapAsync(parallelism) { getLayerVersionByArnRequest =>
      underlying.getLayerVersionByArn(getLayerVersionByArnRequest)
    }

  def getLayerVersionPolicySource(
      getLayerVersionPolicyRequest: GetLayerVersionPolicyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetLayerVersionPolicyResponse, NotUsed] =
    Source.single(getLayerVersionPolicyRequest).via(getLayerVersionPolicyFlow(parallelism))

  def getLayerVersionPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLayerVersionPolicyRequest, GetLayerVersionPolicyResponse, NotUsed] =
    Flow[GetLayerVersionPolicyRequest].mapAsync(parallelism) { getLayerVersionPolicyRequest =>
      underlying.getLayerVersionPolicy(getLayerVersionPolicyRequest)
    }

  def getPolicySource(
      getPolicyRequest: GetPolicyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetPolicyResponse, NotUsed] =
    Source.single(getPolicyRequest).via(getPolicyFlow(parallelism))

  def getPolicyFlow(parallelism: Int = DefaultParallelism): Flow[GetPolicyRequest, GetPolicyResponse, NotUsed] =
    Flow[GetPolicyRequest].mapAsync(parallelism) { getPolicyRequest =>
      underlying.getPolicy(getPolicyRequest)
    }

  def getProvisionedConcurrencyConfigSource(
      getProvisionedConcurrencyConfigRequest: GetProvisionedConcurrencyConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetProvisionedConcurrencyConfigResponse, NotUsed] =
    Source.single(getProvisionedConcurrencyConfigRequest).via(getProvisionedConcurrencyConfigFlow(parallelism))

  def getProvisionedConcurrencyConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetProvisionedConcurrencyConfigRequest, GetProvisionedConcurrencyConfigResponse, NotUsed] =
    Flow[GetProvisionedConcurrencyConfigRequest].mapAsync(parallelism) { getProvisionedConcurrencyConfigRequest =>
      underlying.getProvisionedConcurrencyConfig(getProvisionedConcurrencyConfigRequest)
    }

  def invokeSource(
      invokeRequest: InvokeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[InvokeResponse, NotUsed] =
    Source.single(invokeRequest).via(invokeFlow(parallelism))

  def invokeFlow(parallelism: Int = DefaultParallelism): Flow[InvokeRequest, InvokeResponse, NotUsed] =
    Flow[InvokeRequest].mapAsync(parallelism) { invokeRequest =>
      underlying.invoke(invokeRequest)
    }

  def listAliasesSource(
      listAliasesRequest: ListAliasesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListAliasesResponse, NotUsed] =
    Source.single(listAliasesRequest).via(listAliasesFlow(parallelism))

  def listAliasesFlow(parallelism: Int = DefaultParallelism): Flow[ListAliasesRequest, ListAliasesResponse, NotUsed] =
    Flow[ListAliasesRequest].mapAsync(parallelism) { listAliasesRequest =>
      underlying.listAliases(listAliasesRequest)
    }

  def listAliasesPaginatorFlow: Flow[ListAliasesRequest, ListAliasesResponse, NotUsed] =
    Flow[ListAliasesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listAliasesPaginator(request))
    }

  def listEventSourceMappingsSource(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListEventSourceMappingsResponse, NotUsed] =
    Source.single(listEventSourceMappingsRequest).via(listEventSourceMappingsFlow(parallelism))

  def listEventSourceMappingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListEventSourceMappingsRequest, ListEventSourceMappingsResponse, NotUsed] =
    Flow[ListEventSourceMappingsRequest].mapAsync(parallelism) { listEventSourceMappingsRequest =>
      underlying.listEventSourceMappings(listEventSourceMappingsRequest)
    }

  def listEventSourceMappingsSource(): Source[ListEventSourceMappingsResponse, NotUsed] =
    Source.fromFuture(underlying.listEventSourceMappings())

  def listEventSourceMappingsPaginatorSource: Source[ListEventSourceMappingsResponse, NotUsed] =
    Source.fromPublisher(underlying.listEventSourceMappingsPaginator())

  def listEventSourceMappingsPaginatorFlow
      : Flow[ListEventSourceMappingsRequest, ListEventSourceMappingsResponse, NotUsed] =
    Flow[ListEventSourceMappingsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listEventSourceMappingsPaginator(request))
    }

  def listFunctionEventInvokeConfigsSource(
      listFunctionEventInvokeConfigsRequest: ListFunctionEventInvokeConfigsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListFunctionEventInvokeConfigsResponse, NotUsed] =
    Source.single(listFunctionEventInvokeConfigsRequest).via(listFunctionEventInvokeConfigsFlow(parallelism))

  def listFunctionEventInvokeConfigsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListFunctionEventInvokeConfigsRequest, ListFunctionEventInvokeConfigsResponse, NotUsed] =
    Flow[ListFunctionEventInvokeConfigsRequest].mapAsync(parallelism) { listFunctionEventInvokeConfigsRequest =>
      underlying.listFunctionEventInvokeConfigs(listFunctionEventInvokeConfigsRequest)
    }

  def listFunctionEventInvokeConfigsPaginatorFlow
      : Flow[ListFunctionEventInvokeConfigsRequest, ListFunctionEventInvokeConfigsResponse, NotUsed] =
    Flow[ListFunctionEventInvokeConfigsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listFunctionEventInvokeConfigsPaginator(request))
    }

  def listFunctionsSource(
      listFunctionsRequest: ListFunctionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListFunctionsResponse, NotUsed] =
    Source.single(listFunctionsRequest).via(listFunctionsFlow(parallelism))

  def listFunctionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListFunctionsRequest, ListFunctionsResponse, NotUsed] =
    Flow[ListFunctionsRequest].mapAsync(parallelism) { listFunctionsRequest =>
      underlying.listFunctions(listFunctionsRequest)
    }

  def listFunctionsSource(): Source[ListFunctionsResponse, NotUsed] =
    Source.fromFuture(underlying.listFunctions())

  def listFunctionsPaginatorSource: Source[ListFunctionsResponse, NotUsed] =
    Source.fromPublisher(underlying.listFunctionsPaginator())

  def listFunctionsPaginatorFlow: Flow[ListFunctionsRequest, ListFunctionsResponse, NotUsed] =
    Flow[ListFunctionsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listFunctionsPaginator(request))
    }

  def listLayerVersionsSource(
      listLayerVersionsRequest: ListLayerVersionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListLayerVersionsResponse, NotUsed] =
    Source.single(listLayerVersionsRequest).via(listLayerVersionsFlow(parallelism))

  def listLayerVersionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListLayerVersionsRequest, ListLayerVersionsResponse, NotUsed] =
    Flow[ListLayerVersionsRequest].mapAsync(parallelism) { listLayerVersionsRequest =>
      underlying.listLayerVersions(listLayerVersionsRequest)
    }

  def listLayerVersionsPaginatorFlow: Flow[ListLayerVersionsRequest, ListLayerVersionsResponse, NotUsed] =
    Flow[ListLayerVersionsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listLayerVersionsPaginator(request))
    }

  def listLayersSource(
      listLayersRequest: ListLayersRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListLayersResponse, NotUsed] =
    Source.single(listLayersRequest).via(listLayersFlow(parallelism))

  def listLayersFlow(parallelism: Int = DefaultParallelism): Flow[ListLayersRequest, ListLayersResponse, NotUsed] =
    Flow[ListLayersRequest].mapAsync(parallelism) { listLayersRequest =>
      underlying.listLayers(listLayersRequest)
    }

  def listLayersSource(): Source[ListLayersResponse, NotUsed] =
    Source.fromFuture(underlying.listLayers())

  def listLayersPaginatorSource: Source[ListLayersResponse, NotUsed] =
    Source.fromPublisher(underlying.listLayersPaginator())

  def listLayersPaginatorFlow: Flow[ListLayersRequest, ListLayersResponse, NotUsed] =
    Flow[ListLayersRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listLayersPaginator(request))
    }

  def listProvisionedConcurrencyConfigsSource(
      listProvisionedConcurrencyConfigsRequest: ListProvisionedConcurrencyConfigsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListProvisionedConcurrencyConfigsResponse, NotUsed] =
    Source.single(listProvisionedConcurrencyConfigsRequest).via(listProvisionedConcurrencyConfigsFlow(parallelism))

  def listProvisionedConcurrencyConfigsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListProvisionedConcurrencyConfigsRequest, ListProvisionedConcurrencyConfigsResponse, NotUsed] =
    Flow[ListProvisionedConcurrencyConfigsRequest].mapAsync(parallelism) { listProvisionedConcurrencyConfigsRequest =>
      underlying.listProvisionedConcurrencyConfigs(listProvisionedConcurrencyConfigsRequest)
    }

  def listProvisionedConcurrencyConfigsPaginatorFlow
      : Flow[ListProvisionedConcurrencyConfigsRequest, ListProvisionedConcurrencyConfigsResponse, NotUsed] =
    Flow[ListProvisionedConcurrencyConfigsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listProvisionedConcurrencyConfigsPaginator(request))
    }

  def listTagsSource(
      listTagsRequest: ListTagsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTagsResponse, NotUsed] =
    Source.single(listTagsRequest).via(listTagsFlow(parallelism))

  def listTagsFlow(parallelism: Int = DefaultParallelism): Flow[ListTagsRequest, ListTagsResponse, NotUsed] =
    Flow[ListTagsRequest].mapAsync(parallelism) { listTagsRequest =>
      underlying.listTags(listTagsRequest)
    }

  def listVersionsByFunctionSource(
      listVersionsByFunctionRequest: ListVersionsByFunctionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListVersionsByFunctionResponse, NotUsed] =
    Source.single(listVersionsByFunctionRequest).via(listVersionsByFunctionFlow(parallelism))

  def listVersionsByFunctionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListVersionsByFunctionRequest, ListVersionsByFunctionResponse, NotUsed] =
    Flow[ListVersionsByFunctionRequest].mapAsync(parallelism) { listVersionsByFunctionRequest =>
      underlying.listVersionsByFunction(listVersionsByFunctionRequest)
    }

  def listVersionsByFunctionPaginatorFlow
      : Flow[ListVersionsByFunctionRequest, ListVersionsByFunctionResponse, NotUsed] =
    Flow[ListVersionsByFunctionRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listVersionsByFunctionPaginator(request))
    }

  def publishLayerVersionSource(
      publishLayerVersionRequest: PublishLayerVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PublishLayerVersionResponse, NotUsed] =
    Source.single(publishLayerVersionRequest).via(publishLayerVersionFlow(parallelism))

  def publishLayerVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PublishLayerVersionRequest, PublishLayerVersionResponse, NotUsed] =
    Flow[PublishLayerVersionRequest].mapAsync(parallelism) { publishLayerVersionRequest =>
      underlying.publishLayerVersion(publishLayerVersionRequest)
    }

  def publishVersionSource(
      publishVersionRequest: PublishVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PublishVersionResponse, NotUsed] =
    Source.single(publishVersionRequest).via(publishVersionFlow(parallelism))

  def publishVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PublishVersionRequest, PublishVersionResponse, NotUsed] =
    Flow[PublishVersionRequest].mapAsync(parallelism) { publishVersionRequest =>
      underlying.publishVersion(publishVersionRequest)
    }

  def putFunctionConcurrencySource(
      putFunctionConcurrencyRequest: PutFunctionConcurrencyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutFunctionConcurrencyResponse, NotUsed] =
    Source.single(putFunctionConcurrencyRequest).via(putFunctionConcurrencyFlow(parallelism))

  def putFunctionConcurrencyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutFunctionConcurrencyRequest, PutFunctionConcurrencyResponse, NotUsed] =
    Flow[PutFunctionConcurrencyRequest].mapAsync(parallelism) { putFunctionConcurrencyRequest =>
      underlying.putFunctionConcurrency(putFunctionConcurrencyRequest)
    }

  def putFunctionEventInvokeConfigSource(
      putFunctionEventInvokeConfigRequest: PutFunctionEventInvokeConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutFunctionEventInvokeConfigResponse, NotUsed] =
    Source.single(putFunctionEventInvokeConfigRequest).via(putFunctionEventInvokeConfigFlow(parallelism))

  def putFunctionEventInvokeConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutFunctionEventInvokeConfigRequest, PutFunctionEventInvokeConfigResponse, NotUsed] =
    Flow[PutFunctionEventInvokeConfigRequest].mapAsync(parallelism) { putFunctionEventInvokeConfigRequest =>
      underlying.putFunctionEventInvokeConfig(putFunctionEventInvokeConfigRequest)
    }

  def putProvisionedConcurrencyConfigSource(
      putProvisionedConcurrencyConfigRequest: PutProvisionedConcurrencyConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutProvisionedConcurrencyConfigResponse, NotUsed] =
    Source.single(putProvisionedConcurrencyConfigRequest).via(putProvisionedConcurrencyConfigFlow(parallelism))

  def putProvisionedConcurrencyConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutProvisionedConcurrencyConfigRequest, PutProvisionedConcurrencyConfigResponse, NotUsed] =
    Flow[PutProvisionedConcurrencyConfigRequest].mapAsync(parallelism) { putProvisionedConcurrencyConfigRequest =>
      underlying.putProvisionedConcurrencyConfig(putProvisionedConcurrencyConfigRequest)
    }

  def removeLayerVersionPermissionSource(
      removeLayerVersionPermissionRequest: RemoveLayerVersionPermissionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RemoveLayerVersionPermissionResponse, NotUsed] =
    Source.single(removeLayerVersionPermissionRequest).via(removeLayerVersionPermissionFlow(parallelism))

  def removeLayerVersionPermissionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RemoveLayerVersionPermissionRequest, RemoveLayerVersionPermissionResponse, NotUsed] =
    Flow[RemoveLayerVersionPermissionRequest].mapAsync(parallelism) { removeLayerVersionPermissionRequest =>
      underlying.removeLayerVersionPermission(removeLayerVersionPermissionRequest)
    }

  def removePermissionSource(
      removePermissionRequest: RemovePermissionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RemovePermissionResponse, NotUsed] =
    Source.single(removePermissionRequest).via(removePermissionFlow(parallelism))

  def removePermissionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RemovePermissionRequest, RemovePermissionResponse, NotUsed] =
    Flow[RemovePermissionRequest].mapAsync(parallelism) { removePermissionRequest =>
      underlying.removePermission(removePermissionRequest)
    }

  def tagResourceSource(
      tagResourceRequest: TagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TagResourceResponse, NotUsed] =
    Source.single(tagResourceRequest).via(tagResourceFlow(parallelism))

  def tagResourceFlow(parallelism: Int = DefaultParallelism): Flow[TagResourceRequest, TagResourceResponse, NotUsed] =
    Flow[TagResourceRequest].mapAsync(parallelism) { tagResourceRequest =>
      underlying.tagResource(tagResourceRequest)
    }

  def untagResourceSource(
      untagResourceRequest: UntagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UntagResourceResponse, NotUsed] =
    Source.single(untagResourceRequest).via(untagResourceFlow(parallelism))

  def untagResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UntagResourceRequest, UntagResourceResponse, NotUsed] =
    Flow[UntagResourceRequest].mapAsync(parallelism) { untagResourceRequest =>
      underlying.untagResource(untagResourceRequest)
    }

  def updateAliasSource(
      updateAliasRequest: UpdateAliasRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateAliasResponse, NotUsed] =
    Source.single(updateAliasRequest).via(updateAliasFlow(parallelism))

  def updateAliasFlow(parallelism: Int = DefaultParallelism): Flow[UpdateAliasRequest, UpdateAliasResponse, NotUsed] =
    Flow[UpdateAliasRequest].mapAsync(parallelism) { updateAliasRequest =>
      underlying.updateAlias(updateAliasRequest)
    }

  def updateEventSourceMappingSource(
      updateEventSourceMappingRequest: UpdateEventSourceMappingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateEventSourceMappingResponse, NotUsed] =
    Source.single(updateEventSourceMappingRequest).via(updateEventSourceMappingFlow(parallelism))

  def updateEventSourceMappingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateEventSourceMappingRequest, UpdateEventSourceMappingResponse, NotUsed] =
    Flow[UpdateEventSourceMappingRequest].mapAsync(parallelism) { updateEventSourceMappingRequest =>
      underlying.updateEventSourceMapping(updateEventSourceMappingRequest)
    }

  def updateFunctionCodeSource(
      updateFunctionCodeRequest: UpdateFunctionCodeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateFunctionCodeResponse, NotUsed] =
    Source.single(updateFunctionCodeRequest).via(updateFunctionCodeFlow(parallelism))

  def updateFunctionCodeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateFunctionCodeRequest, UpdateFunctionCodeResponse, NotUsed] =
    Flow[UpdateFunctionCodeRequest].mapAsync(parallelism) { updateFunctionCodeRequest =>
      underlying.updateFunctionCode(updateFunctionCodeRequest)
    }

  def updateFunctionConfigurationSource(
      updateFunctionConfigurationRequest: UpdateFunctionConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateFunctionConfigurationResponse, NotUsed] =
    Source.single(updateFunctionConfigurationRequest).via(updateFunctionConfigurationFlow(parallelism))

  def updateFunctionConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResponse, NotUsed] =
    Flow[UpdateFunctionConfigurationRequest].mapAsync(parallelism) { updateFunctionConfigurationRequest =>
      underlying.updateFunctionConfiguration(updateFunctionConfigurationRequest)
    }

  def updateFunctionEventInvokeConfigSource(
      updateFunctionEventInvokeConfigRequest: UpdateFunctionEventInvokeConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateFunctionEventInvokeConfigResponse, NotUsed] =
    Source.single(updateFunctionEventInvokeConfigRequest).via(updateFunctionEventInvokeConfigFlow(parallelism))

  def updateFunctionEventInvokeConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateFunctionEventInvokeConfigRequest, UpdateFunctionEventInvokeConfigResponse, NotUsed] =
    Flow[UpdateFunctionEventInvokeConfigRequest].mapAsync(parallelism) { updateFunctionEventInvokeConfigRequest =>
      underlying.updateFunctionEventInvokeConfig(updateFunctionEventInvokeConfigRequest)
    }

}
