// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.lambda.{ LambdaAsyncClient, LambdaClient }
import software.amazon.awssdk.services.lambda.model._
import software.amazon.awssdk.services.lambda.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object LambdaCatsIOClient {

  def apply(asyncClient: LambdaAsyncClient): LambdaCatsIOClient = new LambdaCatsIOClient {
    override val underlying: LambdaAsyncClient = asyncClient
  }

}

trait LambdaCatsIOClient extends LambdaClient[IO] {

  val underlying: LambdaAsyncClient

  override def addLayerVersionPermission(
      addLayerVersionPermissionRequest: AddLayerVersionPermissionRequest
  ): IO[AddLayerVersionPermissionResponse] =
    IO.fromFuture {
      IO(underlying.addLayerVersionPermission(addLayerVersionPermissionRequest))
    }

  override def addPermission(addPermissionRequest: AddPermissionRequest): IO[AddPermissionResponse] =
    IO.fromFuture {
      IO(underlying.addPermission(addPermissionRequest))
    }

  override def createAlias(createAliasRequest: CreateAliasRequest): IO[CreateAliasResponse] =
    IO.fromFuture {
      IO(underlying.createAlias(createAliasRequest))
    }

  override def createEventSourceMapping(
      createEventSourceMappingRequest: CreateEventSourceMappingRequest
  ): IO[CreateEventSourceMappingResponse] =
    IO.fromFuture {
      IO(underlying.createEventSourceMapping(createEventSourceMappingRequest))
    }

  override def createFunction(createFunctionRequest: CreateFunctionRequest): IO[CreateFunctionResponse] =
    IO.fromFuture {
      IO(underlying.createFunction(createFunctionRequest))
    }

  override def deleteAlias(deleteAliasRequest: DeleteAliasRequest): IO[DeleteAliasResponse] =
    IO.fromFuture {
      IO(underlying.deleteAlias(deleteAliasRequest))
    }

  override def deleteEventSourceMapping(
      deleteEventSourceMappingRequest: DeleteEventSourceMappingRequest
  ): IO[DeleteEventSourceMappingResponse] =
    IO.fromFuture {
      IO(underlying.deleteEventSourceMapping(deleteEventSourceMappingRequest))
    }

  override def deleteFunction(deleteFunctionRequest: DeleteFunctionRequest): IO[DeleteFunctionResponse] =
    IO.fromFuture {
      IO(underlying.deleteFunction(deleteFunctionRequest))
    }

  override def deleteFunctionConcurrency(
      deleteFunctionConcurrencyRequest: DeleteFunctionConcurrencyRequest
  ): IO[DeleteFunctionConcurrencyResponse] =
    IO.fromFuture {
      IO(underlying.deleteFunctionConcurrency(deleteFunctionConcurrencyRequest))
    }

  override def deleteLayerVersion(
      deleteLayerVersionRequest: DeleteLayerVersionRequest
  ): IO[DeleteLayerVersionResponse] =
    IO.fromFuture {
      IO(underlying.deleteLayerVersion(deleteLayerVersionRequest))
    }

  override def getAccountSettings(
      getAccountSettingsRequest: GetAccountSettingsRequest
  ): IO[GetAccountSettingsResponse] =
    IO.fromFuture {
      IO(underlying.getAccountSettings(getAccountSettingsRequest))
    }

  override def getAccountSettings(): IO[GetAccountSettingsResponse] =
    IO.fromFuture {
      IO(underlying.getAccountSettings())
    }

  override def getAlias(getAliasRequest: GetAliasRequest): IO[GetAliasResponse] =
    IO.fromFuture {
      IO(underlying.getAlias(getAliasRequest))
    }

  override def getEventSourceMapping(
      getEventSourceMappingRequest: GetEventSourceMappingRequest
  ): IO[GetEventSourceMappingResponse] =
    IO.fromFuture {
      IO(underlying.getEventSourceMapping(getEventSourceMappingRequest))
    }

  override def getFunction(getFunctionRequest: GetFunctionRequest): IO[GetFunctionResponse] =
    IO.fromFuture {
      IO(underlying.getFunction(getFunctionRequest))
    }

  override def getFunctionConfiguration(
      getFunctionConfigurationRequest: GetFunctionConfigurationRequest
  ): IO[GetFunctionConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.getFunctionConfiguration(getFunctionConfigurationRequest))
    }

  override def getLayerVersion(getLayerVersionRequest: GetLayerVersionRequest): IO[GetLayerVersionResponse] =
    IO.fromFuture {
      IO(underlying.getLayerVersion(getLayerVersionRequest))
    }

  override def getLayerVersionPolicy(
      getLayerVersionPolicyRequest: GetLayerVersionPolicyRequest
  ): IO[GetLayerVersionPolicyResponse] =
    IO.fromFuture {
      IO(underlying.getLayerVersionPolicy(getLayerVersionPolicyRequest))
    }

  override def getPolicy(getPolicyRequest: GetPolicyRequest): IO[GetPolicyResponse] =
    IO.fromFuture {
      IO(underlying.getPolicy(getPolicyRequest))
    }

  override def invoke(invokeRequest: InvokeRequest): IO[InvokeResponse] =
    IO.fromFuture {
      IO(underlying.invoke(invokeRequest))
    }

  override def listAliases(listAliasesRequest: ListAliasesRequest): IO[ListAliasesResponse] =
    IO.fromFuture {
      IO(underlying.listAliases(listAliasesRequest))
    }

  override def listEventSourceMappings(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest
  ): IO[ListEventSourceMappingsResponse] =
    IO.fromFuture {
      IO(underlying.listEventSourceMappings(listEventSourceMappingsRequest))
    }

  override def listEventSourceMappings(): IO[ListEventSourceMappingsResponse] =
    IO.fromFuture {
      IO(underlying.listEventSourceMappings())
    }

  def listEventSourceMappingsPaginator(): ListEventSourceMappingsPublisher =
    underlying.listEventSourceMappingsPaginator()

  def listEventSourceMappingsPaginator(
      listEventSourceMappingsRequest: ListEventSourceMappingsRequest
  ): ListEventSourceMappingsPublisher =
    underlying.listEventSourceMappingsPaginator(listEventSourceMappingsRequest)

  override def listFunctions(listFunctionsRequest: ListFunctionsRequest): IO[ListFunctionsResponse] =
    IO.fromFuture {
      IO(underlying.listFunctions(listFunctionsRequest))
    }

  override def listFunctions(): IO[ListFunctionsResponse] =
    IO.fromFuture {
      IO(underlying.listFunctions())
    }

  def listFunctionsPaginator(): ListFunctionsPublisher =
    underlying.listFunctionsPaginator()

  def listFunctionsPaginator(listFunctionsRequest: ListFunctionsRequest): ListFunctionsPublisher =
    underlying.listFunctionsPaginator(listFunctionsRequest)

  override def listLayerVersions(listLayerVersionsRequest: ListLayerVersionsRequest): IO[ListLayerVersionsResponse] =
    IO.fromFuture {
      IO(underlying.listLayerVersions(listLayerVersionsRequest))
    }

  override def listLayers(listLayersRequest: ListLayersRequest): IO[ListLayersResponse] =
    IO.fromFuture {
      IO(underlying.listLayers(listLayersRequest))
    }

  override def listLayers(): IO[ListLayersResponse] =
    IO.fromFuture {
      IO(underlying.listLayers())
    }

  override def listTags(listTagsRequest: ListTagsRequest): IO[ListTagsResponse] =
    IO.fromFuture {
      IO(underlying.listTags(listTagsRequest))
    }

  override def listVersionsByFunction(
      listVersionsByFunctionRequest: ListVersionsByFunctionRequest
  ): IO[ListVersionsByFunctionResponse] =
    IO.fromFuture {
      IO(underlying.listVersionsByFunction(listVersionsByFunctionRequest))
    }

  override def publishLayerVersion(
      publishLayerVersionRequest: PublishLayerVersionRequest
  ): IO[PublishLayerVersionResponse] =
    IO.fromFuture {
      IO(underlying.publishLayerVersion(publishLayerVersionRequest))
    }

  override def publishVersion(publishVersionRequest: PublishVersionRequest): IO[PublishVersionResponse] =
    IO.fromFuture {
      IO(underlying.publishVersion(publishVersionRequest))
    }

  override def putFunctionConcurrency(
      putFunctionConcurrencyRequest: PutFunctionConcurrencyRequest
  ): IO[PutFunctionConcurrencyResponse] =
    IO.fromFuture {
      IO(underlying.putFunctionConcurrency(putFunctionConcurrencyRequest))
    }

  override def removeLayerVersionPermission(
      removeLayerVersionPermissionRequest: RemoveLayerVersionPermissionRequest
  ): IO[RemoveLayerVersionPermissionResponse] =
    IO.fromFuture {
      IO(underlying.removeLayerVersionPermission(removeLayerVersionPermissionRequest))
    }

  override def removePermission(removePermissionRequest: RemovePermissionRequest): IO[RemovePermissionResponse] =
    IO.fromFuture {
      IO(underlying.removePermission(removePermissionRequest))
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): IO[TagResourceResponse] =
    IO.fromFuture {
      IO(underlying.tagResource(tagResourceRequest))
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): IO[UntagResourceResponse] =
    IO.fromFuture {
      IO(underlying.untagResource(untagResourceRequest))
    }

  override def updateAlias(updateAliasRequest: UpdateAliasRequest): IO[UpdateAliasResponse] =
    IO.fromFuture {
      IO(underlying.updateAlias(updateAliasRequest))
    }

  override def updateEventSourceMapping(
      updateEventSourceMappingRequest: UpdateEventSourceMappingRequest
  ): IO[UpdateEventSourceMappingResponse] =
    IO.fromFuture {
      IO(underlying.updateEventSourceMapping(updateEventSourceMappingRequest))
    }

  override def updateFunctionCode(
      updateFunctionCodeRequest: UpdateFunctionCodeRequest
  ): IO[UpdateFunctionCodeResponse] =
    IO.fromFuture {
      IO(underlying.updateFunctionCode(updateFunctionCodeRequest))
    }

  override def updateFunctionConfiguration(
      updateFunctionConfigurationRequest: UpdateFunctionConfigurationRequest
  ): IO[UpdateFunctionConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.updateFunctionConfiguration(updateFunctionConfigurationRequest))
    }

}
