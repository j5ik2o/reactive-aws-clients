// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.ecs.{ EcsAsyncClient, EcsClient }
import software.amazon.awssdk.services.ecs.model._
import software.amazon.awssdk.services.ecs.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object EcsCatsIOClient {

  def apply(asyncClient: EcsAsyncClient)(implicit ec: ExecutionContext): EcsCatsIOClient =
    new EcsCatsIOClient {
      override val executionContext: ExecutionContext = ec
      override val underlying: EcsAsyncClient         = asyncClient
    }

}

trait EcsCatsIOClient extends EcsClient[IO] {

  val underlying: EcsAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def createCapacityProvider(
      createCapacityProviderRequest: CreateCapacityProviderRequest
  ): IO[CreateCapacityProviderResponse] =
    IO.fromFuture {
      IO(underlying.createCapacityProvider(createCapacityProviderRequest))
    }

  override def createCluster(createClusterRequest: CreateClusterRequest): IO[CreateClusterResponse] =
    IO.fromFuture {
      IO(underlying.createCluster(createClusterRequest))
    }

  override def createCluster(): IO[CreateClusterResponse] =
    IO.fromFuture {
      IO(underlying.createCluster())
    }

  override def createService(createServiceRequest: CreateServiceRequest): IO[CreateServiceResponse] =
    IO.fromFuture {
      IO(underlying.createService(createServiceRequest))
    }

  override def createTaskSet(createTaskSetRequest: CreateTaskSetRequest): IO[CreateTaskSetResponse] =
    IO.fromFuture {
      IO(underlying.createTaskSet(createTaskSetRequest))
    }

  override def deleteAccountSetting(
      deleteAccountSettingRequest: DeleteAccountSettingRequest
  ): IO[DeleteAccountSettingResponse] =
    IO.fromFuture {
      IO(underlying.deleteAccountSetting(deleteAccountSettingRequest))
    }

  override def deleteAttributes(deleteAttributesRequest: DeleteAttributesRequest): IO[DeleteAttributesResponse] =
    IO.fromFuture {
      IO(underlying.deleteAttributes(deleteAttributesRequest))
    }

  override def deleteCapacityProvider(
      deleteCapacityProviderRequest: DeleteCapacityProviderRequest
  ): IO[DeleteCapacityProviderResponse] =
    IO.fromFuture {
      IO(underlying.deleteCapacityProvider(deleteCapacityProviderRequest))
    }

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): IO[DeleteClusterResponse] =
    IO.fromFuture {
      IO(underlying.deleteCluster(deleteClusterRequest))
    }

  override def deleteService(deleteServiceRequest: DeleteServiceRequest): IO[DeleteServiceResponse] =
    IO.fromFuture {
      IO(underlying.deleteService(deleteServiceRequest))
    }

  override def deleteTaskSet(deleteTaskSetRequest: DeleteTaskSetRequest): IO[DeleteTaskSetResponse] =
    IO.fromFuture {
      IO(underlying.deleteTaskSet(deleteTaskSetRequest))
    }

  override def deregisterContainerInstance(
      deregisterContainerInstanceRequest: DeregisterContainerInstanceRequest
  ): IO[DeregisterContainerInstanceResponse] =
    IO.fromFuture {
      IO(underlying.deregisterContainerInstance(deregisterContainerInstanceRequest))
    }

  override def deregisterTaskDefinition(
      deregisterTaskDefinitionRequest: DeregisterTaskDefinitionRequest
  ): IO[DeregisterTaskDefinitionResponse] =
    IO.fromFuture {
      IO(underlying.deregisterTaskDefinition(deregisterTaskDefinitionRequest))
    }

  override def describeCapacityProviders(
      describeCapacityProvidersRequest: DescribeCapacityProvidersRequest
  ): IO[DescribeCapacityProvidersResponse] =
    IO.fromFuture {
      IO(underlying.describeCapacityProviders(describeCapacityProvidersRequest))
    }

  override def describeClusters(describeClustersRequest: DescribeClustersRequest): IO[DescribeClustersResponse] =
    IO.fromFuture {
      IO(underlying.describeClusters(describeClustersRequest))
    }

  override def describeClusters(): IO[DescribeClustersResponse] =
    IO.fromFuture {
      IO(underlying.describeClusters())
    }

  override def describeContainerInstances(
      describeContainerInstancesRequest: DescribeContainerInstancesRequest
  ): IO[DescribeContainerInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeContainerInstances(describeContainerInstancesRequest))
    }

  override def describeServices(describeServicesRequest: DescribeServicesRequest): IO[DescribeServicesResponse] =
    IO.fromFuture {
      IO(underlying.describeServices(describeServicesRequest))
    }

  override def describeTaskDefinition(
      describeTaskDefinitionRequest: DescribeTaskDefinitionRequest
  ): IO[DescribeTaskDefinitionResponse] =
    IO.fromFuture {
      IO(underlying.describeTaskDefinition(describeTaskDefinitionRequest))
    }

  override def describeTaskSets(describeTaskSetsRequest: DescribeTaskSetsRequest): IO[DescribeTaskSetsResponse] =
    IO.fromFuture {
      IO(underlying.describeTaskSets(describeTaskSetsRequest))
    }

  override def describeTasks(describeTasksRequest: DescribeTasksRequest): IO[DescribeTasksResponse] =
    IO.fromFuture {
      IO(underlying.describeTasks(describeTasksRequest))
    }

  override def discoverPollEndpoint(
      discoverPollEndpointRequest: DiscoverPollEndpointRequest
  ): IO[DiscoverPollEndpointResponse] =
    IO.fromFuture {
      IO(underlying.discoverPollEndpoint(discoverPollEndpointRequest))
    }

  override def listAccountSettings(
      listAccountSettingsRequest: ListAccountSettingsRequest
  ): IO[ListAccountSettingsResponse] =
    IO.fromFuture {
      IO(underlying.listAccountSettings(listAccountSettingsRequest))
    }

  override def listAccountSettings(): IO[ListAccountSettingsResponse] =
    IO.fromFuture {
      IO(underlying.listAccountSettings())
    }

  def listAccountSettingsPaginator(): ListAccountSettingsPublisher =
    underlying.listAccountSettingsPaginator()

  def listAccountSettingsPaginator(
      listAccountSettingsRequest: ListAccountSettingsRequest
  ): ListAccountSettingsPublisher =
    underlying.listAccountSettingsPaginator(listAccountSettingsRequest)

  override def listAttributes(listAttributesRequest: ListAttributesRequest): IO[ListAttributesResponse] =
    IO.fromFuture {
      IO(underlying.listAttributes(listAttributesRequest))
    }

  def listAttributesPaginator(listAttributesRequest: ListAttributesRequest): ListAttributesPublisher =
    underlying.listAttributesPaginator(listAttributesRequest)

  override def listClusters(listClustersRequest: ListClustersRequest): IO[ListClustersResponse] =
    IO.fromFuture {
      IO(underlying.listClusters(listClustersRequest))
    }

  override def listClusters(): IO[ListClustersResponse] =
    IO.fromFuture {
      IO(underlying.listClusters())
    }

  def listClustersPaginator(): ListClustersPublisher =
    underlying.listClustersPaginator()

  def listClustersPaginator(listClustersRequest: ListClustersRequest): ListClustersPublisher =
    underlying.listClustersPaginator(listClustersRequest)

  override def listContainerInstances(
      listContainerInstancesRequest: ListContainerInstancesRequest
  ): IO[ListContainerInstancesResponse] =
    IO.fromFuture {
      IO(underlying.listContainerInstances(listContainerInstancesRequest))
    }

  override def listContainerInstances(): IO[ListContainerInstancesResponse] =
    IO.fromFuture {
      IO(underlying.listContainerInstances())
    }

  def listContainerInstancesPaginator(): ListContainerInstancesPublisher =
    underlying.listContainerInstancesPaginator()

  def listContainerInstancesPaginator(
      listContainerInstancesRequest: ListContainerInstancesRequest
  ): ListContainerInstancesPublisher =
    underlying.listContainerInstancesPaginator(listContainerInstancesRequest)

  override def listServices(listServicesRequest: ListServicesRequest): IO[ListServicesResponse] =
    IO.fromFuture {
      IO(underlying.listServices(listServicesRequest))
    }

  override def listServices(): IO[ListServicesResponse] =
    IO.fromFuture {
      IO(underlying.listServices())
    }

  def listServicesPaginator(): ListServicesPublisher =
    underlying.listServicesPaginator()

  def listServicesPaginator(listServicesRequest: ListServicesRequest): ListServicesPublisher =
    underlying.listServicesPaginator(listServicesRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): IO[ListTagsForResourceResponse] =
    IO.fromFuture {
      IO(underlying.listTagsForResource(listTagsForResourceRequest))
    }

  override def listTaskDefinitionFamilies(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest
  ): IO[ListTaskDefinitionFamiliesResponse] =
    IO.fromFuture {
      IO(underlying.listTaskDefinitionFamilies(listTaskDefinitionFamiliesRequest))
    }

  override def listTaskDefinitionFamilies(): IO[ListTaskDefinitionFamiliesResponse] =
    IO.fromFuture {
      IO(underlying.listTaskDefinitionFamilies())
    }

  def listTaskDefinitionFamiliesPaginator(): ListTaskDefinitionFamiliesPublisher =
    underlying.listTaskDefinitionFamiliesPaginator()

  def listTaskDefinitionFamiliesPaginator(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest
  ): ListTaskDefinitionFamiliesPublisher =
    underlying.listTaskDefinitionFamiliesPaginator(listTaskDefinitionFamiliesRequest)

  override def listTaskDefinitions(
      listTaskDefinitionsRequest: ListTaskDefinitionsRequest
  ): IO[ListTaskDefinitionsResponse] =
    IO.fromFuture {
      IO(underlying.listTaskDefinitions(listTaskDefinitionsRequest))
    }

  override def listTaskDefinitions(): IO[ListTaskDefinitionsResponse] =
    IO.fromFuture {
      IO(underlying.listTaskDefinitions())
    }

  def listTaskDefinitionsPaginator(): ListTaskDefinitionsPublisher =
    underlying.listTaskDefinitionsPaginator()

  def listTaskDefinitionsPaginator(
      listTaskDefinitionsRequest: ListTaskDefinitionsRequest
  ): ListTaskDefinitionsPublisher =
    underlying.listTaskDefinitionsPaginator(listTaskDefinitionsRequest)

  override def listTasks(listTasksRequest: ListTasksRequest): IO[ListTasksResponse] =
    IO.fromFuture {
      IO(underlying.listTasks(listTasksRequest))
    }

  override def listTasks(): IO[ListTasksResponse] =
    IO.fromFuture {
      IO(underlying.listTasks())
    }

  def listTasksPaginator(): ListTasksPublisher =
    underlying.listTasksPaginator()

  def listTasksPaginator(listTasksRequest: ListTasksRequest): ListTasksPublisher =
    underlying.listTasksPaginator(listTasksRequest)

  override def putAccountSetting(putAccountSettingRequest: PutAccountSettingRequest): IO[PutAccountSettingResponse] =
    IO.fromFuture {
      IO(underlying.putAccountSetting(putAccountSettingRequest))
    }

  override def putAccountSettingDefault(
      putAccountSettingDefaultRequest: PutAccountSettingDefaultRequest
  ): IO[PutAccountSettingDefaultResponse] =
    IO.fromFuture {
      IO(underlying.putAccountSettingDefault(putAccountSettingDefaultRequest))
    }

  override def putAttributes(putAttributesRequest: PutAttributesRequest): IO[PutAttributesResponse] =
    IO.fromFuture {
      IO(underlying.putAttributes(putAttributesRequest))
    }

  override def putClusterCapacityProviders(
      putClusterCapacityProvidersRequest: PutClusterCapacityProvidersRequest
  ): IO[PutClusterCapacityProvidersResponse] =
    IO.fromFuture {
      IO(underlying.putClusterCapacityProviders(putClusterCapacityProvidersRequest))
    }

  override def registerContainerInstance(
      registerContainerInstanceRequest: RegisterContainerInstanceRequest
  ): IO[RegisterContainerInstanceResponse] =
    IO.fromFuture {
      IO(underlying.registerContainerInstance(registerContainerInstanceRequest))
    }

  override def registerTaskDefinition(
      registerTaskDefinitionRequest: RegisterTaskDefinitionRequest
  ): IO[RegisterTaskDefinitionResponse] =
    IO.fromFuture {
      IO(underlying.registerTaskDefinition(registerTaskDefinitionRequest))
    }

  override def runTask(runTaskRequest: RunTaskRequest): IO[RunTaskResponse] =
    IO.fromFuture {
      IO(underlying.runTask(runTaskRequest))
    }

  override def startTask(startTaskRequest: StartTaskRequest): IO[StartTaskResponse] =
    IO.fromFuture {
      IO(underlying.startTask(startTaskRequest))
    }

  override def stopTask(stopTaskRequest: StopTaskRequest): IO[StopTaskResponse] =
    IO.fromFuture {
      IO(underlying.stopTask(stopTaskRequest))
    }

  override def submitAttachmentStateChanges(
      submitAttachmentStateChangesRequest: SubmitAttachmentStateChangesRequest
  ): IO[SubmitAttachmentStateChangesResponse] =
    IO.fromFuture {
      IO(underlying.submitAttachmentStateChanges(submitAttachmentStateChangesRequest))
    }

  override def submitContainerStateChange(
      submitContainerStateChangeRequest: SubmitContainerStateChangeRequest
  ): IO[SubmitContainerStateChangeResponse] =
    IO.fromFuture {
      IO(underlying.submitContainerStateChange(submitContainerStateChangeRequest))
    }

  override def submitTaskStateChange(
      submitTaskStateChangeRequest: SubmitTaskStateChangeRequest
  ): IO[SubmitTaskStateChangeResponse] =
    IO.fromFuture {
      IO(underlying.submitTaskStateChange(submitTaskStateChangeRequest))
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): IO[TagResourceResponse] =
    IO.fromFuture {
      IO(underlying.tagResource(tagResourceRequest))
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): IO[UntagResourceResponse] =
    IO.fromFuture {
      IO(underlying.untagResource(untagResourceRequest))
    }

  override def updateClusterSettings(
      updateClusterSettingsRequest: UpdateClusterSettingsRequest
  ): IO[UpdateClusterSettingsResponse] =
    IO.fromFuture {
      IO(underlying.updateClusterSettings(updateClusterSettingsRequest))
    }

  override def updateContainerAgent(
      updateContainerAgentRequest: UpdateContainerAgentRequest
  ): IO[UpdateContainerAgentResponse] =
    IO.fromFuture {
      IO(underlying.updateContainerAgent(updateContainerAgentRequest))
    }

  override def updateContainerInstancesState(
      updateContainerInstancesStateRequest: UpdateContainerInstancesStateRequest
  ): IO[UpdateContainerInstancesStateResponse] =
    IO.fromFuture {
      IO(underlying.updateContainerInstancesState(updateContainerInstancesStateRequest))
    }

  override def updateService(updateServiceRequest: UpdateServiceRequest): IO[UpdateServiceResponse] =
    IO.fromFuture {
      IO(underlying.updateService(updateServiceRequest))
    }

  override def updateServicePrimaryTaskSet(
      updateServicePrimaryTaskSetRequest: UpdateServicePrimaryTaskSetRequest
  ): IO[UpdateServicePrimaryTaskSetResponse] =
    IO.fromFuture {
      IO(underlying.updateServicePrimaryTaskSet(updateServicePrimaryTaskSetRequest))
    }

  override def updateTaskSet(updateTaskSetRequest: UpdateTaskSetRequest): IO[UpdateTaskSetResponse] =
    IO.fromFuture {
      IO(underlying.updateTaskSet(updateTaskSetRequest))
    }

}
