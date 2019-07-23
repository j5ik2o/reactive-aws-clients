// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync

import software.amazon.awssdk.services.appsync.model._

trait AppSyncClient[M[_]] {

  def createApiKey(createApiKeyRequest: CreateApiKeyRequest): M[CreateApiKeyResponse]

  def createDataSource(createDataSourceRequest: CreateDataSourceRequest): M[CreateDataSourceResponse]

  def createFunction(createFunctionRequest: CreateFunctionRequest): M[CreateFunctionResponse]

  def createGraphqlApi(createGraphqlApiRequest: CreateGraphqlApiRequest): M[CreateGraphqlApiResponse]

  def createResolver(createResolverRequest: CreateResolverRequest): M[CreateResolverResponse]

  def createType(createTypeRequest: CreateTypeRequest): M[CreateTypeResponse]

  def deleteApiKey(deleteApiKeyRequest: DeleteApiKeyRequest): M[DeleteApiKeyResponse]

  def deleteDataSource(deleteDataSourceRequest: DeleteDataSourceRequest): M[DeleteDataSourceResponse]

  def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): M[DeleteFunctionResponse]

  def deleteGraphqlApi(deleteGraphqlApiRequest: DeleteGraphqlApiRequest): M[DeleteGraphqlApiResponse]

  def deleteResolver(deleteResolverRequest: DeleteResolverRequest): M[DeleteResolverResponse]

  def deleteType(deleteTypeRequest: DeleteTypeRequest): M[DeleteTypeResponse]

  def getDataSource(getDataSourceRequest: GetDataSourceRequest): M[GetDataSourceResponse]

  def getFunction(getFunctionRequest: GetFunctionRequest): M[GetFunctionResponse]

  def getGraphqlApi(getGraphqlApiRequest: GetGraphqlApiRequest): M[GetGraphqlApiResponse]

  def getIntrospectionSchema(
      getIntrospectionSchemaRequest: GetIntrospectionSchemaRequest
  ): M[GetIntrospectionSchemaResponse]

  def getResolver(getResolverRequest: GetResolverRequest): M[GetResolverResponse]

  def getSchemaCreationStatus(
      getSchemaCreationStatusRequest: GetSchemaCreationStatusRequest
  ): M[GetSchemaCreationStatusResponse]

  def getType(getTypeRequest: GetTypeRequest): M[GetTypeResponse]

  def listApiKeys(listApiKeysRequest: ListApiKeysRequest): M[ListApiKeysResponse]

  def listDataSources(listDataSourcesRequest: ListDataSourcesRequest): M[ListDataSourcesResponse]

  def listFunctions(listFunctionsRequest: ListFunctionsRequest): M[ListFunctionsResponse]

  def listGraphqlApis(listGraphqlApisRequest: ListGraphqlApisRequest): M[ListGraphqlApisResponse]

  def listGraphqlApis(): M[ListGraphqlApisResponse]

  def listResolvers(listResolversRequest: ListResolversRequest): M[ListResolversResponse]

  def listResolversByFunction(
      listResolversByFunctionRequest: ListResolversByFunctionRequest
  ): M[ListResolversByFunctionResponse]

  def listTagsForResource(listTagsForResourceRequest: ListTagsForResourceRequest): M[ListTagsForResourceResponse]

  def listTypes(listTypesRequest: ListTypesRequest): M[ListTypesResponse]

  def startSchemaCreation(startSchemaCreationRequest: StartSchemaCreationRequest): M[StartSchemaCreationResponse]

  def tagResource(tagResourceRequest: TagResourceRequest): M[TagResourceResponse]

  def untagResource(untagResourceRequest: UntagResourceRequest): M[UntagResourceResponse]

  def updateApiKey(updateApiKeyRequest: UpdateApiKeyRequest): M[UpdateApiKeyResponse]

  def updateDataSource(updateDataSourceRequest: UpdateDataSourceRequest): M[UpdateDataSourceResponse]

  def updateFunction(updateFunctionRequest: UpdateFunctionRequest): M[UpdateFunctionResponse]

  def updateGraphqlApi(updateGraphqlApiRequest: UpdateGraphqlApiRequest): M[UpdateGraphqlApiResponse]

  def updateResolver(updateResolverRequest: UpdateResolverRequest): M[UpdateResolverResponse]

  def updateType(updateTypeRequest: UpdateTypeRequest): M[UpdateTypeResponse]

}
