// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda

import software.amazon.awssdk.services.lambda.model._
import software.amazon.awssdk.services.lambda.paginators._
import software.amazon.awssdk.services.lambda.{ LambdaAsyncClient => JavaLambdaAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object LambdaAsyncClient {

  def apply(javaClient: JavaLambdaAsyncClient): LambdaAsyncClient =
    new LambdaAsyncClient {
      override val underlying: JavaLambdaAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/lambda/LambdaAsyncClient.html */
trait LambdaAsyncClient extends LambdaClient[Future] {
  val underlying: JavaLambdaAsyncClient

  override def addLayerVersionPermission(
      addLayerVersionPermissionRequest: AddLayerVersionPermissionRequest
  ): Future[AddLayerVersionPermissionResponse] =
    underlying.addLayerVersionPermission(addLayerVersionPermissionRequest).toScala

  override def addPermission(addPermissionRequest: AddPermissionRequest): Future[AddPermissionResponse] =
    underlying.addPermission(addPermissionRequest).toScala

  override def createAlias(createAliasRequest: CreateAliasRequest): Future[CreateAliasResponse] =
    underlying.createAlias(createAliasRequest).toScala

  override def createEventSourceMapping(
      createEventSourceMappingRequest: CreateEventSourceMappingRequest
  ): Future[CreateEventSourceMappingResponse] =
    underlying.createEventSourceMapping(createEventSourceMappingRequest).toScala

  override def createFunction(createFunctionRequest: CreateFunctionRequest): Future[CreateFunctionResponse] =
    underlying.createFunction(createFunctionRequest).toScala

  override def deleteAlias(deleteAliasRequest: DeleteAliasRequest): Future[DeleteAliasResponse] =
    underlying.deleteAlias(deleteAliasRequest).toScala

  override def deleteEventSourceMapping(
      deleteEventSourceMappingRequest: DeleteEventSourceMappingRequest
  ): Future[DeleteEventSourceMappingResponse] =
    underlying.deleteEventSourceMapping(deleteEventSourceMappingRequest).toScala

  override def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): Future[DeleteFunctionResponse] =
    underlying.deleteFunction(deleteFunctionRequest).toScala

  override def deleteFunctionConcurrency(
      deleteFunctionConcurrencyRequest: DeleteFunctionConcurrencyRequest
  ): Future[DeleteFunctionConcurrencyResponse] =
    underlying.deleteFunctionConcurrency(deleteFunctionConcurrencyRequest).toScala

  override def deleteFunctionEventInvokeConfig(
      deleteFunctionEventInvokeConfigRequest: DeleteFunctionEventInvokeConfigRequest
  ): Future[DeleteFunctionEventInvokeConfigResponse] =
    underlying.deleteFunctionEventInvokeConfig(deleteFunctionEventInvokeConfigRequest).toScala

  override def deleteLayerVersion(
      deleteLayerVersionRequest: DeleteLayerVersionRequest
  ): Future[DeleteLayerVersionResponse] =
    underlying.deleteLayerVersion(deleteLayerVersionRequest).toScala

  override def deleteProvisionedConcurrencyConfig(
      deleteProvisionedConcurrencyConfigRequest: DeleteProvisionedConcurrencyConfigRequest
  ): Future[DeleteProvisionedConcurrencyConfigResponse] =
    underlying.deleteProvisionedConcurrencyConfig(deleteProvisionedConcurrencyConfigRequest).toScala

  override def getAccountSettings(
      getAccountSettingsRequest: GetAccountSettingsRequest
  ): Future[GetAccountSettingsResponse] =
    underlying.getAccountSettings(getAccountSettingsRequest).toScala

  override def getAccountSettings(): Future[GetAccountSettingsResponse] =
    underlying.getAccountSettings().toScala

  override def getAlias(getAliasRequest: GetAliasRequest): Future[GetAliasResponse] =
    underlying.getAlias(getAliasRequest).toScala

  override def getEventSourceMapping(
      getEventSourceMappingRequest: GetEventSourceMappingRequest
  ): Future[GetEventSourceMappingResponse] =
    underlying.getEventSourceMapping(getEventSourceMappingRequest).toScala

  override def getFunction(getFunctionRequest: GetFunctionRequest): Future[GetFunctionResponse] =
    underlying.getFunction(getFunctionRequest).toScala

  override def getFunctionConcurrency(
      getFunctionConcurrencyRequest: GetFunctionConcurrencyRequest
  ): Future[GetFunctionConcurrencyResponse] =
    underlying.getFunctionConcurrency(getFunctionConcurrencyRequest).toScala

  override def getFunctionConfiguration(
      getFunctionConfigurationRequest: GetFunctionConfigurationRequest
  ): Future[GetFunctionConfigurationResponse] =
    underlying.getFunctionConfiguration(getFunctionConfigurationRequest).toScala

  override def getFunctionEventInvokeConfig(
      getFunctionEventInvokeConfigRequest: GetFunctionEventInvokeConfigRequest
  ): Future[GetFunctionEventInvokeConfigResponse] =
    underlying.getFunctionEventInvokeConfig(getFunctionEventInvokeConfigRequest).toScala

  override def getLayerVersion(getLayerVersionRequest: GetLayerVersionRequest): Future[GetLayerVersionResponse] =
    underlying.getLayerVersion(getLayerVersionRequest).toScala

  override def getLayerVersionByArn(
      getLayerVersionByArnRequest: GetLayerVersionByArnRequest
  ): Future[GetLayerVersionByArnResponse] =
    underlying.getLayerVersionByArn(getLayerVersionByArnRequest).toScala

  override def getLayerVersionPolicy(
      getLayerVersionPolicyRequest: GetLayerVersionPolicyRequest
  ): Future[GetLayerVersionPolicyResponse] =
    underlying.getLayerVersionPolicy(getLayerVersionPolicyRequest).toScala

  override def getPolicy(getPolicyRequest: GetPolicyRequest): Future[GetPolicyResponse] =
    underlying.getPolicy(getPolicyRequest).toScala

  override def getProvisionedConcurrencyConfig(
      getProvisionedConcurrencyConfigRequest: GetProvisionedConcurrencyConfigRequest
  ): Future[GetProvisionedConcurrencyConfigResponse] =
    underlying.getProvisionedConcurrencyConfig(getProvisionedConcurrencyConfigRequest).toScala

  override def invoke(invokeRequest: InvokeRequest): Future[InvokeResponse] =
    underlying.invoke(invokeRequest).toScala

  override def listAliases(listAliasesRequest: ListAliasesRequest): Future[ListAliasesResponse] =
    underlying.listAliases(listAliasesRequest).toScala

  def listAliasesPaginator(listAliasesRequest: ListAliasesRequest): ListAliasesPublisher =
    underlying.listAliasesPaginator(listAliasesRequest)

  override def listEventSourceMappings(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest
  ): Future[ListEventSourceMappingsResponse] =
    underlying.listEventSourceMappings(listEventSourceMappingsRequest).toScala

  override def listEventSourceMappings(): Future[ListEventSourceMappingsResponse] =
    underlying.listEventSourceMappings().toScala

  def listEventSourceMappingsPaginator(): ListEventSourceMappingsPublisher =
    underlying.listEventSourceMappingsPaginator()

  def listEventSourceMappingsPaginator(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest
  ): ListEventSourceMappingsPublisher =
    underlying.listEventSourceMappingsPaginator(listEventSourceMappingsRequest)

  override def listFunctionEventInvokeConfigs(
      listFunctionEventInvokeConfigsRequest: ListFunctionEventInvokeConfigsRequest
  ): Future[ListFunctionEventInvokeConfigsResponse] =
    underlying.listFunctionEventInvokeConfigs(listFunctionEventInvokeConfigsRequest).toScala

  def listFunctionEventInvokeConfigsPaginator(
      listFunctionEventInvokeConfigsRequest: ListFunctionEventInvokeConfigsRequest
  ): ListFunctionEventInvokeConfigsPublisher =
    underlying.listFunctionEventInvokeConfigsPaginator(listFunctionEventInvokeConfigsRequest)

  override def listFunctions(listFunctionsRequest: ListFunctionsRequest): Future[ListFunctionsResponse] =
    underlying.listFunctions(listFunctionsRequest).toScala

  override def listFunctions(): Future[ListFunctionsResponse] =
    underlying.listFunctions().toScala

  def listFunctionsPaginator(): ListFunctionsPublisher =
    underlying.listFunctionsPaginator()

  def listFunctionsPaginator(listFunctionsRequest: ListFunctionsRequest): ListFunctionsPublisher =
    underlying.listFunctionsPaginator(listFunctionsRequest)

  override def listLayerVersions(
      listLayerVersionsRequest: ListLayerVersionsRequest
  ): Future[ListLayerVersionsResponse] =
    underlying.listLayerVersions(listLayerVersionsRequest).toScala

  def listLayerVersionsPaginator(listLayerVersionsRequest: ListLayerVersionsRequest): ListLayerVersionsPublisher =
    underlying.listLayerVersionsPaginator(listLayerVersionsRequest)

  override def listLayers(listLayersRequest: ListLayersRequest): Future[ListLayersResponse] =
    underlying.listLayers(listLayersRequest).toScala

  override def listLayers(): Future[ListLayersResponse] =
    underlying.listLayers().toScala

  def listLayersPaginator(): ListLayersPublisher =
    underlying.listLayersPaginator()

  def listLayersPaginator(listLayersRequest: ListLayersRequest): ListLayersPublisher =
    underlying.listLayersPaginator(listLayersRequest)

  override def listProvisionedConcurrencyConfigs(
      listProvisionedConcurrencyConfigsRequest: ListProvisionedConcurrencyConfigsRequest
  ): Future[ListProvisionedConcurrencyConfigsResponse] =
    underlying.listProvisionedConcurrencyConfigs(listProvisionedConcurrencyConfigsRequest).toScala

  def listProvisionedConcurrencyConfigsPaginator(
      listProvisionedConcurrencyConfigsRequest: ListProvisionedConcurrencyConfigsRequest
  ): ListProvisionedConcurrencyConfigsPublisher =
    underlying.listProvisionedConcurrencyConfigsPaginator(listProvisionedConcurrencyConfigsRequest)

  override def listTags(listTagsRequest: ListTagsRequest): Future[ListTagsResponse] =
    underlying.listTags(listTagsRequest).toScala

  override def listVersionsByFunction(
      listVersionsByFunctionRequest: ListVersionsByFunctionRequest
  ): Future[ListVersionsByFunctionResponse] =
    underlying.listVersionsByFunction(listVersionsByFunctionRequest).toScala

  def listVersionsByFunctionPaginator(
      listVersionsByFunctionRequest: ListVersionsByFunctionRequest
  ): ListVersionsByFunctionPublisher =
    underlying.listVersionsByFunctionPaginator(listVersionsByFunctionRequest)

  override def publishLayerVersion(
      publishLayerVersionRequest: PublishLayerVersionRequest
  ): Future[PublishLayerVersionResponse] =
    underlying.publishLayerVersion(publishLayerVersionRequest).toScala

  override def publishVersion(publishVersionRequest: PublishVersionRequest): Future[PublishVersionResponse] =
    underlying.publishVersion(publishVersionRequest).toScala

  override def putFunctionConcurrency(
      putFunctionConcurrencyRequest: PutFunctionConcurrencyRequest
  ): Future[PutFunctionConcurrencyResponse] =
    underlying.putFunctionConcurrency(putFunctionConcurrencyRequest).toScala

  override def putFunctionEventInvokeConfig(
      putFunctionEventInvokeConfigRequest: PutFunctionEventInvokeConfigRequest
  ): Future[PutFunctionEventInvokeConfigResponse] =
    underlying.putFunctionEventInvokeConfig(putFunctionEventInvokeConfigRequest).toScala

  override def putProvisionedConcurrencyConfig(
      putProvisionedConcurrencyConfigRequest: PutProvisionedConcurrencyConfigRequest
  ): Future[PutProvisionedConcurrencyConfigResponse] =
    underlying.putProvisionedConcurrencyConfig(putProvisionedConcurrencyConfigRequest).toScala

  override def removeLayerVersionPermission(
      removeLayerVersionPermissionRequest: RemoveLayerVersionPermissionRequest
  ): Future[RemoveLayerVersionPermissionResponse] =
    underlying.removeLayerVersionPermission(removeLayerVersionPermissionRequest).toScala

  override def removePermission(removePermissionRequest: RemovePermissionRequest): Future[RemovePermissionResponse] =
    underlying.removePermission(removePermissionRequest).toScala

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toScala

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toScala

  override def updateAlias(updateAliasRequest: UpdateAliasRequest): Future[UpdateAliasResponse] =
    underlying.updateAlias(updateAliasRequest).toScala

  override def updateEventSourceMapping(
      updateEventSourceMappingRequest: UpdateEventSourceMappingRequest
  ): Future[UpdateEventSourceMappingResponse] =
    underlying.updateEventSourceMapping(updateEventSourceMappingRequest).toScala

  override def updateFunctionCode(
      updateFunctionCodeRequest: UpdateFunctionCodeRequest
  ): Future[UpdateFunctionCodeResponse] =
    underlying.updateFunctionCode(updateFunctionCodeRequest).toScala

  override def updateFunctionConfiguration(
      updateFunctionConfigurationRequest: UpdateFunctionConfigurationRequest
  ): Future[UpdateFunctionConfigurationResponse] =
    underlying.updateFunctionConfiguration(updateFunctionConfigurationRequest).toScala

  override def updateFunctionEventInvokeConfig(
      updateFunctionEventInvokeConfigRequest: UpdateFunctionEventInvokeConfigRequest
  ): Future[UpdateFunctionEventInvokeConfigResponse] =
    underlying.updateFunctionEventInvokeConfig(updateFunctionEventInvokeConfigRequest).toScala

}
