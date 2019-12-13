// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.monix

import software.amazon.awssdk.services.lambda.model._
import com.github.j5ik2o.reactive.aws.lambda.{ LambdaAsyncClient, LambdaClient }
import monix.eval.Task
import monix.reactive.Observable

object LambdaMonixClient {

  def apply(asyncClient: LambdaAsyncClient): LambdaMonixClient = new LambdaMonixClient {
    override val underlying: LambdaAsyncClient = asyncClient
  }

}

trait LambdaMonixClient extends LambdaClient[Task] {

  val underlying: LambdaAsyncClient

  override def addLayerVersionPermission(
      addLayerVersionPermissionRequest: AddLayerVersionPermissionRequest
  ): Task[AddLayerVersionPermissionResponse] =
    Task.deferFuture {
      underlying.addLayerVersionPermission(addLayerVersionPermissionRequest)
    }

  override def addPermission(addPermissionRequest: AddPermissionRequest): Task[AddPermissionResponse] =
    Task.deferFuture {
      underlying.addPermission(addPermissionRequest)
    }

  override def createAlias(createAliasRequest: CreateAliasRequest): Task[CreateAliasResponse] =
    Task.deferFuture {
      underlying.createAlias(createAliasRequest)
    }

  override def createEventSourceMapping(
      createEventSourceMappingRequest: CreateEventSourceMappingRequest
  ): Task[CreateEventSourceMappingResponse] =
    Task.deferFuture {
      underlying.createEventSourceMapping(createEventSourceMappingRequest)
    }

  override def createFunction(createFunctionRequest: CreateFunctionRequest): Task[CreateFunctionResponse] =
    Task.deferFuture {
      underlying.createFunction(createFunctionRequest)
    }

  override def deleteAlias(deleteAliasRequest: DeleteAliasRequest): Task[DeleteAliasResponse] =
    Task.deferFuture {
      underlying.deleteAlias(deleteAliasRequest)
    }

  override def deleteEventSourceMapping(
      deleteEventSourceMappingRequest: DeleteEventSourceMappingRequest
  ): Task[DeleteEventSourceMappingResponse] =
    Task.deferFuture {
      underlying.deleteEventSourceMapping(deleteEventSourceMappingRequest)
    }

  override def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): Task[DeleteFunctionResponse] =
    Task.deferFuture {
      underlying.deleteFunction(deleteFunctionRequest)
    }

  override def deleteFunctionConcurrency(
      deleteFunctionConcurrencyRequest: DeleteFunctionConcurrencyRequest
  ): Task[DeleteFunctionConcurrencyResponse] =
    Task.deferFuture {
      underlying.deleteFunctionConcurrency(deleteFunctionConcurrencyRequest)
    }

  override def deleteFunctionEventInvokeConfig(
      deleteFunctionEventInvokeConfigRequest: DeleteFunctionEventInvokeConfigRequest
  ): Task[DeleteFunctionEventInvokeConfigResponse] =
    Task.deferFuture {
      underlying.deleteFunctionEventInvokeConfig(deleteFunctionEventInvokeConfigRequest)
    }

  override def deleteLayerVersion(
      deleteLayerVersionRequest: DeleteLayerVersionRequest
  ): Task[DeleteLayerVersionResponse] =
    Task.deferFuture {
      underlying.deleteLayerVersion(deleteLayerVersionRequest)
    }

  override def deleteProvisionedConcurrencyConfig(
      deleteProvisionedConcurrencyConfigRequest: DeleteProvisionedConcurrencyConfigRequest
  ): Task[DeleteProvisionedConcurrencyConfigResponse] =
    Task.deferFuture {
      underlying.deleteProvisionedConcurrencyConfig(deleteProvisionedConcurrencyConfigRequest)
    }

  override def getAccountSettings(
      getAccountSettingsRequest: GetAccountSettingsRequest
  ): Task[GetAccountSettingsResponse] =
    Task.deferFuture {
      underlying.getAccountSettings(getAccountSettingsRequest)
    }

  override def getAccountSettings(): Task[GetAccountSettingsResponse] =
    Task.deferFuture {
      underlying.getAccountSettings()
    }

  override def getAlias(getAliasRequest: GetAliasRequest): Task[GetAliasResponse] =
    Task.deferFuture {
      underlying.getAlias(getAliasRequest)
    }

  override def getEventSourceMapping(
      getEventSourceMappingRequest: GetEventSourceMappingRequest
  ): Task[GetEventSourceMappingResponse] =
    Task.deferFuture {
      underlying.getEventSourceMapping(getEventSourceMappingRequest)
    }

  override def getFunction(getFunctionRequest: GetFunctionRequest): Task[GetFunctionResponse] =
    Task.deferFuture {
      underlying.getFunction(getFunctionRequest)
    }

  override def getFunctionConcurrency(
      getFunctionConcurrencyRequest: GetFunctionConcurrencyRequest
  ): Task[GetFunctionConcurrencyResponse] =
    Task.deferFuture {
      underlying.getFunctionConcurrency(getFunctionConcurrencyRequest)
    }

  override def getFunctionConfiguration(
      getFunctionConfigurationRequest: GetFunctionConfigurationRequest
  ): Task[GetFunctionConfigurationResponse] =
    Task.deferFuture {
      underlying.getFunctionConfiguration(getFunctionConfigurationRequest)
    }

  override def getFunctionEventInvokeConfig(
      getFunctionEventInvokeConfigRequest: GetFunctionEventInvokeConfigRequest
  ): Task[GetFunctionEventInvokeConfigResponse] =
    Task.deferFuture {
      underlying.getFunctionEventInvokeConfig(getFunctionEventInvokeConfigRequest)
    }

  override def getLayerVersion(getLayerVersionRequest: GetLayerVersionRequest): Task[GetLayerVersionResponse] =
    Task.deferFuture {
      underlying.getLayerVersion(getLayerVersionRequest)
    }

  override def getLayerVersionByArn(
      getLayerVersionByArnRequest: GetLayerVersionByArnRequest
  ): Task[GetLayerVersionByArnResponse] =
    Task.deferFuture {
      underlying.getLayerVersionByArn(getLayerVersionByArnRequest)
    }

  override def getLayerVersionPolicy(
      getLayerVersionPolicyRequest: GetLayerVersionPolicyRequest
  ): Task[GetLayerVersionPolicyResponse] =
    Task.deferFuture {
      underlying.getLayerVersionPolicy(getLayerVersionPolicyRequest)
    }

  override def getPolicy(getPolicyRequest: GetPolicyRequest): Task[GetPolicyResponse] =
    Task.deferFuture {
      underlying.getPolicy(getPolicyRequest)
    }

  override def getProvisionedConcurrencyConfig(
      getProvisionedConcurrencyConfigRequest: GetProvisionedConcurrencyConfigRequest
  ): Task[GetProvisionedConcurrencyConfigResponse] =
    Task.deferFuture {
      underlying.getProvisionedConcurrencyConfig(getProvisionedConcurrencyConfigRequest)
    }

  override def invoke(invokeRequest: InvokeRequest): Task[InvokeResponse] =
    Task.deferFuture {
      underlying.invoke(invokeRequest)
    }

  override def listAliases(listAliasesRequest: ListAliasesRequest): Task[ListAliasesResponse] =
    Task.deferFuture {
      underlying.listAliases(listAliasesRequest)
    }

  def listAliasesPaginator(listAliasesRequest: ListAliasesRequest): Observable[ListAliasesResponse] =
    Observable.fromReactivePublisher(underlying.listAliasesPaginator(listAliasesRequest))

  override def listEventSourceMappings(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest
  ): Task[ListEventSourceMappingsResponse] =
    Task.deferFuture {
      underlying.listEventSourceMappings(listEventSourceMappingsRequest)
    }

  override def listEventSourceMappings(): Task[ListEventSourceMappingsResponse] =
    Task.deferFuture {
      underlying.listEventSourceMappings()
    }

  def listEventSourceMappingsPaginator(): Observable[ListEventSourceMappingsResponse] =
    Observable.fromReactivePublisher(underlying.listEventSourceMappingsPaginator())

  def listEventSourceMappingsPaginator(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest
  ): Observable[ListEventSourceMappingsResponse] =
    Observable.fromReactivePublisher(underlying.listEventSourceMappingsPaginator(listEventSourceMappingsRequest))

  override def listFunctionEventInvokeConfigs(
      listFunctionEventInvokeConfigsRequest: ListFunctionEventInvokeConfigsRequest
  ): Task[ListFunctionEventInvokeConfigsResponse] =
    Task.deferFuture {
      underlying.listFunctionEventInvokeConfigs(listFunctionEventInvokeConfigsRequest)
    }

  def listFunctionEventInvokeConfigsPaginator(
      listFunctionEventInvokeConfigsRequest: ListFunctionEventInvokeConfigsRequest
  ): Observable[ListFunctionEventInvokeConfigsResponse] =
    Observable.fromReactivePublisher(
      underlying.listFunctionEventInvokeConfigsPaginator(listFunctionEventInvokeConfigsRequest)
    )

  override def listFunctions(listFunctionsRequest: ListFunctionsRequest): Task[ListFunctionsResponse] =
    Task.deferFuture {
      underlying.listFunctions(listFunctionsRequest)
    }

  override def listFunctions(): Task[ListFunctionsResponse] =
    Task.deferFuture {
      underlying.listFunctions()
    }

  def listFunctionsPaginator(): Observable[ListFunctionsResponse] =
    Observable.fromReactivePublisher(underlying.listFunctionsPaginator())

  def listFunctionsPaginator(listFunctionsRequest: ListFunctionsRequest): Observable[ListFunctionsResponse] =
    Observable.fromReactivePublisher(underlying.listFunctionsPaginator(listFunctionsRequest))

  override def listLayerVersions(listLayerVersionsRequest: ListLayerVersionsRequest): Task[ListLayerVersionsResponse] =
    Task.deferFuture {
      underlying.listLayerVersions(listLayerVersionsRequest)
    }

  def listLayerVersionsPaginator(
      listLayerVersionsRequest: ListLayerVersionsRequest
  ): Observable[ListLayerVersionsResponse] =
    Observable.fromReactivePublisher(underlying.listLayerVersionsPaginator(listLayerVersionsRequest))

  override def listLayers(listLayersRequest: ListLayersRequest): Task[ListLayersResponse] =
    Task.deferFuture {
      underlying.listLayers(listLayersRequest)
    }

  override def listLayers(): Task[ListLayersResponse] =
    Task.deferFuture {
      underlying.listLayers()
    }

  def listLayersPaginator(): Observable[ListLayersResponse] =
    Observable.fromReactivePublisher(underlying.listLayersPaginator())

  def listLayersPaginator(listLayersRequest: ListLayersRequest): Observable[ListLayersResponse] =
    Observable.fromReactivePublisher(underlying.listLayersPaginator(listLayersRequest))

  override def listProvisionedConcurrencyConfigs(
      listProvisionedConcurrencyConfigsRequest: ListProvisionedConcurrencyConfigsRequest
  ): Task[ListProvisionedConcurrencyConfigsResponse] =
    Task.deferFuture {
      underlying.listProvisionedConcurrencyConfigs(listProvisionedConcurrencyConfigsRequest)
    }

  def listProvisionedConcurrencyConfigsPaginator(
      listProvisionedConcurrencyConfigsRequest: ListProvisionedConcurrencyConfigsRequest
  ): Observable[ListProvisionedConcurrencyConfigsResponse] =
    Observable.fromReactivePublisher(
      underlying.listProvisionedConcurrencyConfigsPaginator(listProvisionedConcurrencyConfigsRequest)
    )

  override def listTags(listTagsRequest: ListTagsRequest): Task[ListTagsResponse] =
    Task.deferFuture {
      underlying.listTags(listTagsRequest)
    }

  override def listVersionsByFunction(
      listVersionsByFunctionRequest: ListVersionsByFunctionRequest
  ): Task[ListVersionsByFunctionResponse] =
    Task.deferFuture {
      underlying.listVersionsByFunction(listVersionsByFunctionRequest)
    }

  def listVersionsByFunctionPaginator(
      listVersionsByFunctionRequest: ListVersionsByFunctionRequest
  ): Observable[ListVersionsByFunctionResponse] =
    Observable.fromReactivePublisher(underlying.listVersionsByFunctionPaginator(listVersionsByFunctionRequest))

  override def publishLayerVersion(
      publishLayerVersionRequest: PublishLayerVersionRequest
  ): Task[PublishLayerVersionResponse] =
    Task.deferFuture {
      underlying.publishLayerVersion(publishLayerVersionRequest)
    }

  override def publishVersion(publishVersionRequest: PublishVersionRequest): Task[PublishVersionResponse] =
    Task.deferFuture {
      underlying.publishVersion(publishVersionRequest)
    }

  override def putFunctionConcurrency(
      putFunctionConcurrencyRequest: PutFunctionConcurrencyRequest
  ): Task[PutFunctionConcurrencyResponse] =
    Task.deferFuture {
      underlying.putFunctionConcurrency(putFunctionConcurrencyRequest)
    }

  override def putFunctionEventInvokeConfig(
      putFunctionEventInvokeConfigRequest: PutFunctionEventInvokeConfigRequest
  ): Task[PutFunctionEventInvokeConfigResponse] =
    Task.deferFuture {
      underlying.putFunctionEventInvokeConfig(putFunctionEventInvokeConfigRequest)
    }

  override def putProvisionedConcurrencyConfig(
      putProvisionedConcurrencyConfigRequest: PutProvisionedConcurrencyConfigRequest
  ): Task[PutProvisionedConcurrencyConfigResponse] =
    Task.deferFuture {
      underlying.putProvisionedConcurrencyConfig(putProvisionedConcurrencyConfigRequest)
    }

  override def removeLayerVersionPermission(
      removeLayerVersionPermissionRequest: RemoveLayerVersionPermissionRequest
  ): Task[RemoveLayerVersionPermissionResponse] =
    Task.deferFuture {
      underlying.removeLayerVersionPermission(removeLayerVersionPermissionRequest)
    }

  override def removePermission(removePermissionRequest: RemovePermissionRequest): Task[RemovePermissionResponse] =
    Task.deferFuture {
      underlying.removePermission(removePermissionRequest)
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): Task[TagResourceResponse] =
    Task.deferFuture {
      underlying.tagResource(tagResourceRequest)
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Task[UntagResourceResponse] =
    Task.deferFuture {
      underlying.untagResource(untagResourceRequest)
    }

  override def updateAlias(updateAliasRequest: UpdateAliasRequest): Task[UpdateAliasResponse] =
    Task.deferFuture {
      underlying.updateAlias(updateAliasRequest)
    }

  override def updateEventSourceMapping(
      updateEventSourceMappingRequest: UpdateEventSourceMappingRequest
  ): Task[UpdateEventSourceMappingResponse] =
    Task.deferFuture {
      underlying.updateEventSourceMapping(updateEventSourceMappingRequest)
    }

  override def updateFunctionCode(
      updateFunctionCodeRequest: UpdateFunctionCodeRequest
  ): Task[UpdateFunctionCodeResponse] =
    Task.deferFuture {
      underlying.updateFunctionCode(updateFunctionCodeRequest)
    }

  override def updateFunctionConfiguration(
      updateFunctionConfigurationRequest: UpdateFunctionConfigurationRequest
  ): Task[UpdateFunctionConfigurationResponse] =
    Task.deferFuture {
      underlying.updateFunctionConfiguration(updateFunctionConfigurationRequest)
    }

  override def updateFunctionEventInvokeConfig(
      updateFunctionEventInvokeConfigRequest: UpdateFunctionEventInvokeConfigRequest
  ): Task[UpdateFunctionEventInvokeConfigResponse] =
    Task.deferFuture {
      underlying.updateFunctionEventInvokeConfig(updateFunctionEventInvokeConfigRequest)
    }

}
