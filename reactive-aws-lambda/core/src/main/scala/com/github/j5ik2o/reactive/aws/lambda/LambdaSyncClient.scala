// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.lambda.model._
import software.amazon.awssdk.services.lambda.paginators._
import software.amazon.awssdk.services.lambda.{ LambdaClient => JavaLambdaSyncClient }

object LambdaSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaLambdaSyncClient): LambdaSyncClient =
    new LambdaSyncClient {
      override val underlying: JavaLambdaSyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/lambda/LambdaClient.html */
trait LambdaSyncClient extends LambdaClient[Either[Throwable, ?]] {
  val underlying: JavaLambdaSyncClient

  import LambdaSyncClient._

  override def addLayerVersionPermission(
      addLayerVersionPermissionRequest: AddLayerVersionPermissionRequest
  ): Either[Throwable, AddLayerVersionPermissionResponse] =
    underlying.addLayerVersionPermission(addLayerVersionPermissionRequest).toEither

  override def addPermission(addPermissionRequest: AddPermissionRequest): Either[Throwable, AddPermissionResponse] =
    underlying.addPermission(addPermissionRequest).toEither

  override def createAlias(createAliasRequest: CreateAliasRequest): Either[Throwable, CreateAliasResponse] =
    underlying.createAlias(createAliasRequest).toEither

  override def createEventSourceMapping(
      createEventSourceMappingRequest: CreateEventSourceMappingRequest
  ): Either[Throwable, CreateEventSourceMappingResponse] =
    underlying.createEventSourceMapping(createEventSourceMappingRequest).toEither

  override def createFunction(createFunctionRequest: CreateFunctionRequest): Either[Throwable, CreateFunctionResponse] =
    underlying.createFunction(createFunctionRequest).toEither

  override def deleteAlias(deleteAliasRequest: DeleteAliasRequest): Either[Throwable, DeleteAliasResponse] =
    underlying.deleteAlias(deleteAliasRequest).toEither

  override def deleteEventSourceMapping(
      deleteEventSourceMappingRequest: DeleteEventSourceMappingRequest
  ): Either[Throwable, DeleteEventSourceMappingResponse] =
    underlying.deleteEventSourceMapping(deleteEventSourceMappingRequest).toEither

  override def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): Either[Throwable, DeleteFunctionResponse] =
    underlying.deleteFunction(deleteFunctionRequest).toEither

  override def deleteFunctionConcurrency(
      deleteFunctionConcurrencyRequest: DeleteFunctionConcurrencyRequest
  ): Either[Throwable, DeleteFunctionConcurrencyResponse] =
    underlying.deleteFunctionConcurrency(deleteFunctionConcurrencyRequest).toEither

  override def deleteFunctionEventInvokeConfig(
      deleteFunctionEventInvokeConfigRequest: DeleteFunctionEventInvokeConfigRequest
  ): Either[Throwable, DeleteFunctionEventInvokeConfigResponse] =
    underlying.deleteFunctionEventInvokeConfig(deleteFunctionEventInvokeConfigRequest).toEither

  override def deleteLayerVersion(
      deleteLayerVersionRequest: DeleteLayerVersionRequest
  ): Either[Throwable, DeleteLayerVersionResponse] =
    underlying.deleteLayerVersion(deleteLayerVersionRequest).toEither

  override def deleteProvisionedConcurrencyConfig(
      deleteProvisionedConcurrencyConfigRequest: DeleteProvisionedConcurrencyConfigRequest
  ): Either[Throwable, DeleteProvisionedConcurrencyConfigResponse] =
    underlying.deleteProvisionedConcurrencyConfig(deleteProvisionedConcurrencyConfigRequest).toEither

  override def getAccountSettings(): Either[Throwable, GetAccountSettingsResponse] =
    underlying.getAccountSettings().toEither

  override def getAccountSettings(
      getAccountSettingsRequest: GetAccountSettingsRequest
  ): Either[Throwable, GetAccountSettingsResponse] =
    underlying.getAccountSettings(getAccountSettingsRequest).toEither

  override def getAlias(getAliasRequest: GetAliasRequest): Either[Throwable, GetAliasResponse] =
    underlying.getAlias(getAliasRequest).toEither

  override def getEventSourceMapping(
      getEventSourceMappingRequest: GetEventSourceMappingRequest
  ): Either[Throwable, GetEventSourceMappingResponse] =
    underlying.getEventSourceMapping(getEventSourceMappingRequest).toEither

  override def getFunction(getFunctionRequest: GetFunctionRequest): Either[Throwable, GetFunctionResponse] =
    underlying.getFunction(getFunctionRequest).toEither

  override def getFunctionConcurrency(
      getFunctionConcurrencyRequest: GetFunctionConcurrencyRequest
  ): Either[Throwable, GetFunctionConcurrencyResponse] =
    underlying.getFunctionConcurrency(getFunctionConcurrencyRequest).toEither

  override def getFunctionConfiguration(
      getFunctionConfigurationRequest: GetFunctionConfigurationRequest
  ): Either[Throwable, GetFunctionConfigurationResponse] =
    underlying.getFunctionConfiguration(getFunctionConfigurationRequest).toEither

  override def getFunctionEventInvokeConfig(
      getFunctionEventInvokeConfigRequest: GetFunctionEventInvokeConfigRequest
  ): Either[Throwable, GetFunctionEventInvokeConfigResponse] =
    underlying.getFunctionEventInvokeConfig(getFunctionEventInvokeConfigRequest).toEither

  override def getLayerVersion(
      getLayerVersionRequest: GetLayerVersionRequest
  ): Either[Throwable, GetLayerVersionResponse] =
    underlying.getLayerVersion(getLayerVersionRequest).toEither

  override def getLayerVersionByArn(
      getLayerVersionByArnRequest: GetLayerVersionByArnRequest
  ): Either[Throwable, GetLayerVersionByArnResponse] =
    underlying.getLayerVersionByArn(getLayerVersionByArnRequest).toEither

  override def getLayerVersionPolicy(
      getLayerVersionPolicyRequest: GetLayerVersionPolicyRequest
  ): Either[Throwable, GetLayerVersionPolicyResponse] =
    underlying.getLayerVersionPolicy(getLayerVersionPolicyRequest).toEither

  override def getPolicy(getPolicyRequest: GetPolicyRequest): Either[Throwable, GetPolicyResponse] =
    underlying.getPolicy(getPolicyRequest).toEither

  override def getProvisionedConcurrencyConfig(
      getProvisionedConcurrencyConfigRequest: GetProvisionedConcurrencyConfigRequest
  ): Either[Throwable, GetProvisionedConcurrencyConfigResponse] =
    underlying.getProvisionedConcurrencyConfig(getProvisionedConcurrencyConfigRequest).toEither

  override def invoke(invokeRequest: InvokeRequest): Either[Throwable, InvokeResponse] =
    underlying.invoke(invokeRequest).toEither

  override def listAliases(listAliasesRequest: ListAliasesRequest): Either[Throwable, ListAliasesResponse] =
    underlying.listAliases(listAliasesRequest).toEither

  def listAliasesPaginator(listAliasesRequest: ListAliasesRequest): ListAliasesIterable =
    underlying.listAliasesPaginator(listAliasesRequest)

  override def listEventSourceMappings(): Either[Throwable, ListEventSourceMappingsResponse] =
    underlying.listEventSourceMappings().toEither

  override def listEventSourceMappings(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest
  ): Either[Throwable, ListEventSourceMappingsResponse] =
    underlying.listEventSourceMappings(listEventSourceMappingsRequest).toEither

  def listEventSourceMappingsPaginator(): ListEventSourceMappingsIterable =
    underlying.listEventSourceMappingsPaginator()

  def listEventSourceMappingsPaginator(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest
  ): ListEventSourceMappingsIterable =
    underlying.listEventSourceMappingsPaginator(listEventSourceMappingsRequest)

  override def listFunctionEventInvokeConfigs(
      listFunctionEventInvokeConfigsRequest: ListFunctionEventInvokeConfigsRequest
  ): Either[Throwable, ListFunctionEventInvokeConfigsResponse] =
    underlying.listFunctionEventInvokeConfigs(listFunctionEventInvokeConfigsRequest).toEither

  def listFunctionEventInvokeConfigsPaginator(
      listFunctionEventInvokeConfigsRequest: ListFunctionEventInvokeConfigsRequest
  ): ListFunctionEventInvokeConfigsIterable =
    underlying.listFunctionEventInvokeConfigsPaginator(listFunctionEventInvokeConfigsRequest)

  override def listFunctions(): Either[Throwable, ListFunctionsResponse] =
    underlying.listFunctions().toEither

  override def listFunctions(listFunctionsRequest: ListFunctionsRequest): Either[Throwable, ListFunctionsResponse] =
    underlying.listFunctions(listFunctionsRequest).toEither

  def listFunctionsPaginator(): ListFunctionsIterable =
    underlying.listFunctionsPaginator()

  def listFunctionsPaginator(listFunctionsRequest: ListFunctionsRequest): ListFunctionsIterable =
    underlying.listFunctionsPaginator(listFunctionsRequest)

  override def listLayerVersions(
      listLayerVersionsRequest: ListLayerVersionsRequest
  ): Either[Throwable, ListLayerVersionsResponse] =
    underlying.listLayerVersions(listLayerVersionsRequest).toEither

  def listLayerVersionsPaginator(listLayerVersionsRequest: ListLayerVersionsRequest): ListLayerVersionsIterable =
    underlying.listLayerVersionsPaginator(listLayerVersionsRequest)

  override def listLayers(): Either[Throwable, ListLayersResponse] =
    underlying.listLayers().toEither

  override def listLayers(listLayersRequest: ListLayersRequest): Either[Throwable, ListLayersResponse] =
    underlying.listLayers(listLayersRequest).toEither

  def listLayersPaginator(): ListLayersIterable =
    underlying.listLayersPaginator()

  def listLayersPaginator(listLayersRequest: ListLayersRequest): ListLayersIterable =
    underlying.listLayersPaginator(listLayersRequest)

  override def listProvisionedConcurrencyConfigs(
      listProvisionedConcurrencyConfigsRequest: ListProvisionedConcurrencyConfigsRequest
  ): Either[Throwable, ListProvisionedConcurrencyConfigsResponse] =
    underlying.listProvisionedConcurrencyConfigs(listProvisionedConcurrencyConfigsRequest).toEither

  def listProvisionedConcurrencyConfigsPaginator(
      listProvisionedConcurrencyConfigsRequest: ListProvisionedConcurrencyConfigsRequest
  ): ListProvisionedConcurrencyConfigsIterable =
    underlying.listProvisionedConcurrencyConfigsPaginator(listProvisionedConcurrencyConfigsRequest)

  override def listTags(listTagsRequest: ListTagsRequest): Either[Throwable, ListTagsResponse] =
    underlying.listTags(listTagsRequest).toEither

  override def listVersionsByFunction(
      listVersionsByFunctionRequest: ListVersionsByFunctionRequest
  ): Either[Throwable, ListVersionsByFunctionResponse] =
    underlying.listVersionsByFunction(listVersionsByFunctionRequest).toEither

  def listVersionsByFunctionPaginator(
      listVersionsByFunctionRequest: ListVersionsByFunctionRequest
  ): ListVersionsByFunctionIterable =
    underlying.listVersionsByFunctionPaginator(listVersionsByFunctionRequest)

  override def publishLayerVersion(
      publishLayerVersionRequest: PublishLayerVersionRequest
  ): Either[Throwable, PublishLayerVersionResponse] =
    underlying.publishLayerVersion(publishLayerVersionRequest).toEither

  override def publishVersion(publishVersionRequest: PublishVersionRequest): Either[Throwable, PublishVersionResponse] =
    underlying.publishVersion(publishVersionRequest).toEither

  override def putFunctionConcurrency(
      putFunctionConcurrencyRequest: PutFunctionConcurrencyRequest
  ): Either[Throwable, PutFunctionConcurrencyResponse] =
    underlying.putFunctionConcurrency(putFunctionConcurrencyRequest).toEither

  override def putFunctionEventInvokeConfig(
      putFunctionEventInvokeConfigRequest: PutFunctionEventInvokeConfigRequest
  ): Either[Throwable, PutFunctionEventInvokeConfigResponse] =
    underlying.putFunctionEventInvokeConfig(putFunctionEventInvokeConfigRequest).toEither

  override def putProvisionedConcurrencyConfig(
      putProvisionedConcurrencyConfigRequest: PutProvisionedConcurrencyConfigRequest
  ): Either[Throwable, PutProvisionedConcurrencyConfigResponse] =
    underlying.putProvisionedConcurrencyConfig(putProvisionedConcurrencyConfigRequest).toEither

  override def removeLayerVersionPermission(
      removeLayerVersionPermissionRequest: RemoveLayerVersionPermissionRequest
  ): Either[Throwable, RemoveLayerVersionPermissionResponse] =
    underlying.removeLayerVersionPermission(removeLayerVersionPermissionRequest).toEither

  override def removePermission(
      removePermissionRequest: RemovePermissionRequest
  ): Either[Throwable, RemovePermissionResponse] =
    underlying.removePermission(removePermissionRequest).toEither

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toEither

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toEither

  override def updateAlias(updateAliasRequest: UpdateAliasRequest): Either[Throwable, UpdateAliasResponse] =
    underlying.updateAlias(updateAliasRequest).toEither

  override def updateEventSourceMapping(
      updateEventSourceMappingRequest: UpdateEventSourceMappingRequest
  ): Either[Throwable, UpdateEventSourceMappingResponse] =
    underlying.updateEventSourceMapping(updateEventSourceMappingRequest).toEither

  override def updateFunctionCode(
      updateFunctionCodeRequest: UpdateFunctionCodeRequest
  ): Either[Throwable, UpdateFunctionCodeResponse] =
    underlying.updateFunctionCode(updateFunctionCodeRequest).toEither

  override def updateFunctionConfiguration(
      updateFunctionConfigurationRequest: UpdateFunctionConfigurationRequest
  ): Either[Throwable, UpdateFunctionConfigurationResponse] =
    underlying.updateFunctionConfiguration(updateFunctionConfigurationRequest).toEither

  override def updateFunctionEventInvokeConfig(
      updateFunctionEventInvokeConfigRequest: UpdateFunctionEventInvokeConfigRequest
  ): Either[Throwable, UpdateFunctionEventInvokeConfigResponse] =
    underlying.updateFunctionEventInvokeConfig(updateFunctionEventInvokeConfigRequest).toEither

}
