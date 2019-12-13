// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.ecs.model._
import software.amazon.awssdk.services.ecs.paginators._
import software.amazon.awssdk.services.ecs.{ EcsClient => JavaEcsSyncClient }

object EcsSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaEcsSyncClient): EcsSyncClient =
    new EcsSyncClient {
      override val underlying: JavaEcsSyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/ecs/EcsClient.html
  */
trait EcsSyncClient extends EcsClient[Either[Throwable, ?]] {
  val underlying: JavaEcsSyncClient

  import EcsSyncClient._

  override def createCapacityProvider(
      createCapacityProviderRequest: CreateCapacityProviderRequest
  ): Either[Throwable, CreateCapacityProviderResponse] =
    underlying.createCapacityProvider(createCapacityProviderRequest).toEither

  override def createCluster(): Either[Throwable, CreateClusterResponse] =
    underlying.createCluster().toEither

  override def createCluster(createClusterRequest: CreateClusterRequest): Either[Throwable, CreateClusterResponse] =
    underlying.createCluster(createClusterRequest).toEither

  override def createService(createServiceRequest: CreateServiceRequest): Either[Throwable, CreateServiceResponse] =
    underlying.createService(createServiceRequest).toEither

  override def createTaskSet(createTaskSetRequest: CreateTaskSetRequest): Either[Throwable, CreateTaskSetResponse] =
    underlying.createTaskSet(createTaskSetRequest).toEither

  override def deleteAccountSetting(
      deleteAccountSettingRequest: DeleteAccountSettingRequest
  ): Either[Throwable, DeleteAccountSettingResponse] =
    underlying.deleteAccountSetting(deleteAccountSettingRequest).toEither

  override def deleteAttributes(
      deleteAttributesRequest: DeleteAttributesRequest
  ): Either[Throwable, DeleteAttributesResponse] =
    underlying.deleteAttributes(deleteAttributesRequest).toEither

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Either[Throwable, DeleteClusterResponse] =
    underlying.deleteCluster(deleteClusterRequest).toEither

  override def deleteService(deleteServiceRequest: DeleteServiceRequest): Either[Throwable, DeleteServiceResponse] =
    underlying.deleteService(deleteServiceRequest).toEither

  override def deleteTaskSet(deleteTaskSetRequest: DeleteTaskSetRequest): Either[Throwable, DeleteTaskSetResponse] =
    underlying.deleteTaskSet(deleteTaskSetRequest).toEither

  override def deregisterContainerInstance(
      deregisterContainerInstanceRequest: DeregisterContainerInstanceRequest
  ): Either[Throwable, DeregisterContainerInstanceResponse] =
    underlying.deregisterContainerInstance(deregisterContainerInstanceRequest).toEither

  override def deregisterTaskDefinition(
      deregisterTaskDefinitionRequest: DeregisterTaskDefinitionRequest
  ): Either[Throwable, DeregisterTaskDefinitionResponse] =
    underlying.deregisterTaskDefinition(deregisterTaskDefinitionRequest).toEither

  override def describeCapacityProviders(
      describeCapacityProvidersRequest: DescribeCapacityProvidersRequest
  ): Either[Throwable, DescribeCapacityProvidersResponse] =
    underlying.describeCapacityProviders(describeCapacityProvidersRequest).toEither

  override def describeClusters(): Either[Throwable, DescribeClustersResponse] =
    underlying.describeClusters().toEither

  override def describeClusters(
      describeClustersRequest: DescribeClustersRequest
  ): Either[Throwable, DescribeClustersResponse] =
    underlying.describeClusters(describeClustersRequest).toEither

  override def describeContainerInstances(
      describeContainerInstancesRequest: DescribeContainerInstancesRequest
  ): Either[Throwable, DescribeContainerInstancesResponse] =
    underlying.describeContainerInstances(describeContainerInstancesRequest).toEither

  override def describeServices(
      describeServicesRequest: DescribeServicesRequest
  ): Either[Throwable, DescribeServicesResponse] =
    underlying.describeServices(describeServicesRequest).toEither

  override def describeTaskDefinition(
      describeTaskDefinitionRequest: DescribeTaskDefinitionRequest
  ): Either[Throwable, DescribeTaskDefinitionResponse] =
    underlying.describeTaskDefinition(describeTaskDefinitionRequest).toEither

  override def describeTaskSets(
      describeTaskSetsRequest: DescribeTaskSetsRequest
  ): Either[Throwable, DescribeTaskSetsResponse] =
    underlying.describeTaskSets(describeTaskSetsRequest).toEither

  override def describeTasks(describeTasksRequest: DescribeTasksRequest): Either[Throwable, DescribeTasksResponse] =
    underlying.describeTasks(describeTasksRequest).toEither

  override def discoverPollEndpoint(
      discoverPollEndpointRequest: DiscoverPollEndpointRequest
  ): Either[Throwable, DiscoverPollEndpointResponse] =
    underlying.discoverPollEndpoint(discoverPollEndpointRequest).toEither

  override def listAccountSettings(): Either[Throwable, ListAccountSettingsResponse] =
    underlying.listAccountSettings().toEither

  override def listAccountSettings(
      listAccountSettingsRequest: ListAccountSettingsRequest
  ): Either[Throwable, ListAccountSettingsResponse] =
    underlying.listAccountSettings(listAccountSettingsRequest).toEither

  override def listAttributes(listAttributesRequest: ListAttributesRequest): Either[Throwable, ListAttributesResponse] =
    underlying.listAttributes(listAttributesRequest).toEither

  def listAttributesPaginator(listAttributesRequest: ListAttributesRequest): ListAttributesIterable =
    underlying.listAttributesPaginator(listAttributesRequest)

  override def listClusters(): Either[Throwable, ListClustersResponse] =
    underlying.listClusters().toEither

  override def listClusters(listClustersRequest: ListClustersRequest): Either[Throwable, ListClustersResponse] =
    underlying.listClusters(listClustersRequest).toEither

  def listClustersPaginator(): ListClustersIterable =
    underlying.listClustersPaginator()

  def listClustersPaginator(listClustersRequest: ListClustersRequest): ListClustersIterable =
    underlying.listClustersPaginator(listClustersRequest)

  override def listContainerInstances(): Either[Throwable, ListContainerInstancesResponse] =
    underlying.listContainerInstances().toEither

  override def listContainerInstances(
      listContainerInstancesRequest: ListContainerInstancesRequest
  ): Either[Throwable, ListContainerInstancesResponse] =
    underlying.listContainerInstances(listContainerInstancesRequest).toEither

  def listContainerInstancesPaginator(): ListContainerInstancesIterable =
    underlying.listContainerInstancesPaginator()

  def listContainerInstancesPaginator(
      listContainerInstancesRequest: ListContainerInstancesRequest
  ): ListContainerInstancesIterable =
    underlying.listContainerInstancesPaginator(listContainerInstancesRequest)

  override def listServices(): Either[Throwable, ListServicesResponse] =
    underlying.listServices().toEither

  override def listServices(listServicesRequest: ListServicesRequest): Either[Throwable, ListServicesResponse] =
    underlying.listServices(listServicesRequest).toEither

  def listServicesPaginator(): ListServicesIterable =
    underlying.listServicesPaginator()

  def listServicesPaginator(listServicesRequest: ListServicesRequest): ListServicesIterable =
    underlying.listServicesPaginator(listServicesRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Either[Throwable, ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toEither

  override def listTaskDefinitionFamilies(): Either[Throwable, ListTaskDefinitionFamiliesResponse] =
    underlying.listTaskDefinitionFamilies().toEither

  override def listTaskDefinitionFamilies(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest
  ): Either[Throwable, ListTaskDefinitionFamiliesResponse] =
    underlying.listTaskDefinitionFamilies(listTaskDefinitionFamiliesRequest).toEither

  def listTaskDefinitionFamiliesPaginator(): ListTaskDefinitionFamiliesIterable =
    underlying.listTaskDefinitionFamiliesPaginator()

  def listTaskDefinitionFamiliesPaginator(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest
  ): ListTaskDefinitionFamiliesIterable =
    underlying.listTaskDefinitionFamiliesPaginator(listTaskDefinitionFamiliesRequest)

  override def listTaskDefinitions(): Either[Throwable, ListTaskDefinitionsResponse] =
    underlying.listTaskDefinitions().toEither

  override def listTaskDefinitions(
      listTaskDefinitionsRequest: ListTaskDefinitionsRequest
  ): Either[Throwable, ListTaskDefinitionsResponse] =
    underlying.listTaskDefinitions(listTaskDefinitionsRequest).toEither

  def listTaskDefinitionsPaginator(): ListTaskDefinitionsIterable =
    underlying.listTaskDefinitionsPaginator()

  def listTaskDefinitionsPaginator(
      listTaskDefinitionsRequest: ListTaskDefinitionsRequest
  ): ListTaskDefinitionsIterable =
    underlying.listTaskDefinitionsPaginator(listTaskDefinitionsRequest)

  override def listTasks(): Either[Throwable, ListTasksResponse] =
    underlying.listTasks().toEither

  override def listTasks(listTasksRequest: ListTasksRequest): Either[Throwable, ListTasksResponse] =
    underlying.listTasks(listTasksRequest).toEither

  def listTasksPaginator(): ListTasksIterable =
    underlying.listTasksPaginator()

  def listTasksPaginator(listTasksRequest: ListTasksRequest): ListTasksIterable =
    underlying.listTasksPaginator(listTasksRequest)

  override def putAccountSetting(
      putAccountSettingRequest: PutAccountSettingRequest
  ): Either[Throwable, PutAccountSettingResponse] =
    underlying.putAccountSetting(putAccountSettingRequest).toEither

  override def putAccountSettingDefault(
      putAccountSettingDefaultRequest: PutAccountSettingDefaultRequest
  ): Either[Throwable, PutAccountSettingDefaultResponse] =
    underlying.putAccountSettingDefault(putAccountSettingDefaultRequest).toEither

  override def putAttributes(putAttributesRequest: PutAttributesRequest): Either[Throwable, PutAttributesResponse] =
    underlying.putAttributes(putAttributesRequest).toEither

  override def putClusterCapacityProviders(
      putClusterCapacityProvidersRequest: PutClusterCapacityProvidersRequest
  ): Either[Throwable, PutClusterCapacityProvidersResponse] =
    underlying.putClusterCapacityProviders(putClusterCapacityProvidersRequest).toEither

  override def registerContainerInstance(
      registerContainerInstanceRequest: RegisterContainerInstanceRequest
  ): Either[Throwable, RegisterContainerInstanceResponse] =
    underlying.registerContainerInstance(registerContainerInstanceRequest).toEither

  override def registerTaskDefinition(
      registerTaskDefinitionRequest: RegisterTaskDefinitionRequest
  ): Either[Throwable, RegisterTaskDefinitionResponse] =
    underlying.registerTaskDefinition(registerTaskDefinitionRequest).toEither

  override def runTask(runTaskRequest: RunTaskRequest): Either[Throwable, RunTaskResponse] =
    underlying.runTask(runTaskRequest).toEither

  override def startTask(startTaskRequest: StartTaskRequest): Either[Throwable, StartTaskResponse] =
    underlying.startTask(startTaskRequest).toEither

  override def stopTask(stopTaskRequest: StopTaskRequest): Either[Throwable, StopTaskResponse] =
    underlying.stopTask(stopTaskRequest).toEither

  override def submitAttachmentStateChanges(
      submitAttachmentStateChangesRequest: SubmitAttachmentStateChangesRequest
  ): Either[Throwable, SubmitAttachmentStateChangesResponse] =
    underlying.submitAttachmentStateChanges(submitAttachmentStateChangesRequest).toEither

  override def submitContainerStateChange(
      submitContainerStateChangeRequest: SubmitContainerStateChangeRequest
  ): Either[Throwable, SubmitContainerStateChangeResponse] =
    underlying.submitContainerStateChange(submitContainerStateChangeRequest).toEither

  override def submitTaskStateChange(
      submitTaskStateChangeRequest: SubmitTaskStateChangeRequest
  ): Either[Throwable, SubmitTaskStateChangeResponse] =
    underlying.submitTaskStateChange(submitTaskStateChangeRequest).toEither

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toEither

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toEither

  override def updateClusterSettings(
      updateClusterSettingsRequest: UpdateClusterSettingsRequest
  ): Either[Throwable, UpdateClusterSettingsResponse] =
    underlying.updateClusterSettings(updateClusterSettingsRequest).toEither

  override def updateContainerAgent(
      updateContainerAgentRequest: UpdateContainerAgentRequest
  ): Either[Throwable, UpdateContainerAgentResponse] =
    underlying.updateContainerAgent(updateContainerAgentRequest).toEither

  override def updateContainerInstancesState(
      updateContainerInstancesStateRequest: UpdateContainerInstancesStateRequest
  ): Either[Throwable, UpdateContainerInstancesStateResponse] =
    underlying.updateContainerInstancesState(updateContainerInstancesStateRequest).toEither

  override def updateService(updateServiceRequest: UpdateServiceRequest): Either[Throwable, UpdateServiceResponse] =
    underlying.updateService(updateServiceRequest).toEither

  override def updateServicePrimaryTaskSet(
      updateServicePrimaryTaskSetRequest: UpdateServicePrimaryTaskSetRequest
  ): Either[Throwable, UpdateServicePrimaryTaskSetResponse] =
    underlying.updateServicePrimaryTaskSet(updateServicePrimaryTaskSetRequest).toEither

  override def updateTaskSet(updateTaskSetRequest: UpdateTaskSetRequest): Either[Throwable, UpdateTaskSetResponse] =
    underlying.updateTaskSet(updateTaskSetRequest).toEither

}
