// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda

import software.amazon.awssdk.services.lambda.model._

trait LambdaClient[M[_]] {

  def addLayerVersionPermission(
      addLayerVersionPermissionRequest: AddLayerVersionPermissionRequest
  ): M[AddLayerVersionPermissionResponse]

  def addPermission(addPermissionRequest: AddPermissionRequest): M[AddPermissionResponse]

  def createAlias(createAliasRequest: CreateAliasRequest): M[CreateAliasResponse]

  def createEventSourceMapping(
      createEventSourceMappingRequest: CreateEventSourceMappingRequest
  ): M[CreateEventSourceMappingResponse]

  def createFunction(createFunctionRequest: CreateFunctionRequest): M[CreateFunctionResponse]

  def deleteAlias(deleteAliasRequest: DeleteAliasRequest): M[DeleteAliasResponse]

  def deleteEventSourceMapping(
      deleteEventSourceMappingRequest: DeleteEventSourceMappingRequest
  ): M[DeleteEventSourceMappingResponse]

  def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): M[DeleteFunctionResponse]

  def deleteFunctionConcurrency(
      deleteFunctionConcurrencyRequest: DeleteFunctionConcurrencyRequest
  ): M[DeleteFunctionConcurrencyResponse]

  def deleteFunctionEventInvokeConfig(
      deleteFunctionEventInvokeConfigRequest: DeleteFunctionEventInvokeConfigRequest
  ): M[DeleteFunctionEventInvokeConfigResponse]

  def deleteLayerVersion(deleteLayerVersionRequest: DeleteLayerVersionRequest): M[DeleteLayerVersionResponse]

  def deleteProvisionedConcurrencyConfig(
      deleteProvisionedConcurrencyConfigRequest: DeleteProvisionedConcurrencyConfigRequest
  ): M[DeleteProvisionedConcurrencyConfigResponse]

  def getAccountSettings(getAccountSettingsRequest: GetAccountSettingsRequest): M[GetAccountSettingsResponse]

  def getAccountSettings(): M[GetAccountSettingsResponse]

  def getAlias(getAliasRequest: GetAliasRequest): M[GetAliasResponse]

  def getEventSourceMapping(
      getEventSourceMappingRequest: GetEventSourceMappingRequest
  ): M[GetEventSourceMappingResponse]

  def getFunction(getFunctionRequest: GetFunctionRequest): M[GetFunctionResponse]

  def getFunctionConcurrency(
      getFunctionConcurrencyRequest: GetFunctionConcurrencyRequest
  ): M[GetFunctionConcurrencyResponse]

  def getFunctionConfiguration(
      getFunctionConfigurationRequest: GetFunctionConfigurationRequest
  ): M[GetFunctionConfigurationResponse]

  def getFunctionEventInvokeConfig(
      getFunctionEventInvokeConfigRequest: GetFunctionEventInvokeConfigRequest
  ): M[GetFunctionEventInvokeConfigResponse]

  def getLayerVersion(getLayerVersionRequest: GetLayerVersionRequest): M[GetLayerVersionResponse]

  def getLayerVersionByArn(getLayerVersionByArnRequest: GetLayerVersionByArnRequest): M[GetLayerVersionByArnResponse]

  def getLayerVersionPolicy(
      getLayerVersionPolicyRequest: GetLayerVersionPolicyRequest
  ): M[GetLayerVersionPolicyResponse]

  def getPolicy(getPolicyRequest: GetPolicyRequest): M[GetPolicyResponse]

  def getProvisionedConcurrencyConfig(
      getProvisionedConcurrencyConfigRequest: GetProvisionedConcurrencyConfigRequest
  ): M[GetProvisionedConcurrencyConfigResponse]

  def invoke(invokeRequest: InvokeRequest): M[InvokeResponse]

  def listAliases(listAliasesRequest: ListAliasesRequest): M[ListAliasesResponse]

  def listEventSourceMappings(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest
  ): M[ListEventSourceMappingsResponse]

  def listEventSourceMappings(): M[ListEventSourceMappingsResponse]

  def listFunctionEventInvokeConfigs(
      listFunctionEventInvokeConfigsRequest: ListFunctionEventInvokeConfigsRequest
  ): M[ListFunctionEventInvokeConfigsResponse]

  def listFunctions(listFunctionsRequest: ListFunctionsRequest): M[ListFunctionsResponse]

  def listFunctions(): M[ListFunctionsResponse]

  def listLayerVersions(listLayerVersionsRequest: ListLayerVersionsRequest): M[ListLayerVersionsResponse]

  def listLayers(listLayersRequest: ListLayersRequest): M[ListLayersResponse]

  def listLayers(): M[ListLayersResponse]

  def listProvisionedConcurrencyConfigs(
      listProvisionedConcurrencyConfigsRequest: ListProvisionedConcurrencyConfigsRequest
  ): M[ListProvisionedConcurrencyConfigsResponse]

  def listTags(listTagsRequest: ListTagsRequest): M[ListTagsResponse]

  def listVersionsByFunction(
      listVersionsByFunctionRequest: ListVersionsByFunctionRequest
  ): M[ListVersionsByFunctionResponse]

  def publishLayerVersion(publishLayerVersionRequest: PublishLayerVersionRequest): M[PublishLayerVersionResponse]

  def publishVersion(publishVersionRequest: PublishVersionRequest): M[PublishVersionResponse]

  def putFunctionConcurrency(
      putFunctionConcurrencyRequest: PutFunctionConcurrencyRequest
  ): M[PutFunctionConcurrencyResponse]

  def putFunctionEventInvokeConfig(
      putFunctionEventInvokeConfigRequest: PutFunctionEventInvokeConfigRequest
  ): M[PutFunctionEventInvokeConfigResponse]

  def putProvisionedConcurrencyConfig(
      putProvisionedConcurrencyConfigRequest: PutProvisionedConcurrencyConfigRequest
  ): M[PutProvisionedConcurrencyConfigResponse]

  def removeLayerVersionPermission(
      removeLayerVersionPermissionRequest: RemoveLayerVersionPermissionRequest
  ): M[RemoveLayerVersionPermissionResponse]

  def removePermission(removePermissionRequest: RemovePermissionRequest): M[RemovePermissionResponse]

  def tagResource(tagResourceRequest: TagResourceRequest): M[TagResourceResponse]

  def untagResource(untagResourceRequest: UntagResourceRequest): M[UntagResourceResponse]

  def updateAlias(updateAliasRequest: UpdateAliasRequest): M[UpdateAliasResponse]

  def updateEventSourceMapping(
      updateEventSourceMappingRequest: UpdateEventSourceMappingRequest
  ): M[UpdateEventSourceMappingResponse]

  def updateFunctionCode(updateFunctionCodeRequest: UpdateFunctionCodeRequest): M[UpdateFunctionCodeResponse]

  def updateFunctionConfiguration(
      updateFunctionConfigurationRequest: UpdateFunctionConfigurationRequest
  ): M[UpdateFunctionConfigurationResponse]

  def updateFunctionEventInvokeConfig(
      updateFunctionEventInvokeConfigRequest: UpdateFunctionEventInvokeConfigRequest
  ): M[UpdateFunctionEventInvokeConfigResponse]

}
