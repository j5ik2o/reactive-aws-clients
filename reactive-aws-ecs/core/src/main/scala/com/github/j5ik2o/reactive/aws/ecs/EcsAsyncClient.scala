// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs

import software.amazon.awssdk.services.ecs.model._
import software.amazon.awssdk.services.ecs.paginators._
import software.amazon.awssdk.services.ecs.{ EcsAsyncClient => JavaEcsAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object EcsAsyncClient {

  def apply(javaClient: JavaEcsAsyncClient): EcsAsyncClient =
    new EcsAsyncClient {
      override val underlying: JavaEcsAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/ecs/EcsAsyncClient.html */
trait EcsAsyncClient extends EcsClient[Future] {
  val underlying: JavaEcsAsyncClient

  override def createCapacityProvider(
      createCapacityProviderRequest: CreateCapacityProviderRequest
  ): Future[CreateCapacityProviderResponse] =
    underlying.createCapacityProvider(createCapacityProviderRequest).toScala

  override def createCluster(createClusterRequest: CreateClusterRequest): Future[CreateClusterResponse] =
    underlying.createCluster(createClusterRequest).toScala

  override def createCluster(): Future[CreateClusterResponse] =
    underlying.createCluster().toScala

  override def createService(createServiceRequest: CreateServiceRequest): Future[CreateServiceResponse] =
    underlying.createService(createServiceRequest).toScala

  override def createTaskSet(createTaskSetRequest: CreateTaskSetRequest): Future[CreateTaskSetResponse] =
    underlying.createTaskSet(createTaskSetRequest).toScala

  override def deleteAccountSetting(
      deleteAccountSettingRequest: DeleteAccountSettingRequest
  ): Future[DeleteAccountSettingResponse] =
    underlying.deleteAccountSetting(deleteAccountSettingRequest).toScala

  override def deleteAttributes(deleteAttributesRequest: DeleteAttributesRequest): Future[DeleteAttributesResponse] =
    underlying.deleteAttributes(deleteAttributesRequest).toScala

  override def deleteCapacityProvider(
      deleteCapacityProviderRequest: DeleteCapacityProviderRequest
  ): Future[DeleteCapacityProviderResponse] =
    underlying.deleteCapacityProvider(deleteCapacityProviderRequest).toScala

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Future[DeleteClusterResponse] =
    underlying.deleteCluster(deleteClusterRequest).toScala

  override def deleteService(deleteServiceRequest: DeleteServiceRequest): Future[DeleteServiceResponse] =
    underlying.deleteService(deleteServiceRequest).toScala

  override def deleteTaskSet(deleteTaskSetRequest: DeleteTaskSetRequest): Future[DeleteTaskSetResponse] =
    underlying.deleteTaskSet(deleteTaskSetRequest).toScala

  override def deregisterContainerInstance(
      deregisterContainerInstanceRequest: DeregisterContainerInstanceRequest
  ): Future[DeregisterContainerInstanceResponse] =
    underlying.deregisterContainerInstance(deregisterContainerInstanceRequest).toScala

  override def deregisterTaskDefinition(
      deregisterTaskDefinitionRequest: DeregisterTaskDefinitionRequest
  ): Future[DeregisterTaskDefinitionResponse] =
    underlying.deregisterTaskDefinition(deregisterTaskDefinitionRequest).toScala

  override def describeCapacityProviders(
      describeCapacityProvidersRequest: DescribeCapacityProvidersRequest
  ): Future[DescribeCapacityProvidersResponse] =
    underlying.describeCapacityProviders(describeCapacityProvidersRequest).toScala

  override def describeClusters(describeClustersRequest: DescribeClustersRequest): Future[DescribeClustersResponse] =
    underlying.describeClusters(describeClustersRequest).toScala

  override def describeClusters(): Future[DescribeClustersResponse] =
    underlying.describeClusters().toScala

  override def describeContainerInstances(
      describeContainerInstancesRequest: DescribeContainerInstancesRequest
  ): Future[DescribeContainerInstancesResponse] =
    underlying.describeContainerInstances(describeContainerInstancesRequest).toScala

  override def describeServices(describeServicesRequest: DescribeServicesRequest): Future[DescribeServicesResponse] =
    underlying.describeServices(describeServicesRequest).toScala

  override def describeTaskDefinition(
      describeTaskDefinitionRequest: DescribeTaskDefinitionRequest
  ): Future[DescribeTaskDefinitionResponse] =
    underlying.describeTaskDefinition(describeTaskDefinitionRequest).toScala

  override def describeTaskSets(describeTaskSetsRequest: DescribeTaskSetsRequest): Future[DescribeTaskSetsResponse] =
    underlying.describeTaskSets(describeTaskSetsRequest).toScala

  override def describeTasks(describeTasksRequest: DescribeTasksRequest): Future[DescribeTasksResponse] =
    underlying.describeTasks(describeTasksRequest).toScala

  override def discoverPollEndpoint(
      discoverPollEndpointRequest: DiscoverPollEndpointRequest
  ): Future[DiscoverPollEndpointResponse] =
    underlying.discoverPollEndpoint(discoverPollEndpointRequest).toScala

  override def listAccountSettings(
      listAccountSettingsRequest: ListAccountSettingsRequest
  ): Future[ListAccountSettingsResponse] =
    underlying.listAccountSettings(listAccountSettingsRequest).toScala

  override def listAccountSettings(): Future[ListAccountSettingsResponse] =
    underlying.listAccountSettings().toScala

  def listAccountSettingsPaginator(): ListAccountSettingsPublisher =
    underlying.listAccountSettingsPaginator()

  def listAccountSettingsPaginator(
      listAccountSettingsRequest: ListAccountSettingsRequest
  ): ListAccountSettingsPublisher =
    underlying.listAccountSettingsPaginator(listAccountSettingsRequest)

  override def listAttributes(listAttributesRequest: ListAttributesRequest): Future[ListAttributesResponse] =
    underlying.listAttributes(listAttributesRequest).toScala

  def listAttributesPaginator(listAttributesRequest: ListAttributesRequest): ListAttributesPublisher =
    underlying.listAttributesPaginator(listAttributesRequest)

  override def listClusters(listClustersRequest: ListClustersRequest): Future[ListClustersResponse] =
    underlying.listClusters(listClustersRequest).toScala

  override def listClusters(): Future[ListClustersResponse] =
    underlying.listClusters().toScala

  def listClustersPaginator(): ListClustersPublisher =
    underlying.listClustersPaginator()

  def listClustersPaginator(listClustersRequest: ListClustersRequest): ListClustersPublisher =
    underlying.listClustersPaginator(listClustersRequest)

  override def listContainerInstances(
      listContainerInstancesRequest: ListContainerInstancesRequest
  ): Future[ListContainerInstancesResponse] =
    underlying.listContainerInstances(listContainerInstancesRequest).toScala

  override def listContainerInstances(): Future[ListContainerInstancesResponse] =
    underlying.listContainerInstances().toScala

  def listContainerInstancesPaginator(): ListContainerInstancesPublisher =
    underlying.listContainerInstancesPaginator()

  def listContainerInstancesPaginator(
      listContainerInstancesRequest: ListContainerInstancesRequest
  ): ListContainerInstancesPublisher =
    underlying.listContainerInstancesPaginator(listContainerInstancesRequest)

  override def listServices(listServicesRequest: ListServicesRequest): Future[ListServicesResponse] =
    underlying.listServices(listServicesRequest).toScala

  override def listServices(): Future[ListServicesResponse] =
    underlying.listServices().toScala

  def listServicesPaginator(): ListServicesPublisher =
    underlying.listServicesPaginator()

  def listServicesPaginator(listServicesRequest: ListServicesRequest): ListServicesPublisher =
    underlying.listServicesPaginator(listServicesRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Future[ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toScala

  override def listTaskDefinitionFamilies(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest
  ): Future[ListTaskDefinitionFamiliesResponse] =
    underlying.listTaskDefinitionFamilies(listTaskDefinitionFamiliesRequest).toScala

  override def listTaskDefinitionFamilies(): Future[ListTaskDefinitionFamiliesResponse] =
    underlying.listTaskDefinitionFamilies().toScala

  def listTaskDefinitionFamiliesPaginator(): ListTaskDefinitionFamiliesPublisher =
    underlying.listTaskDefinitionFamiliesPaginator()

  def listTaskDefinitionFamiliesPaginator(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest
  ): ListTaskDefinitionFamiliesPublisher =
    underlying.listTaskDefinitionFamiliesPaginator(listTaskDefinitionFamiliesRequest)

  override def listTaskDefinitions(
      listTaskDefinitionsRequest: ListTaskDefinitionsRequest
  ): Future[ListTaskDefinitionsResponse] =
    underlying.listTaskDefinitions(listTaskDefinitionsRequest).toScala

  override def listTaskDefinitions(): Future[ListTaskDefinitionsResponse] =
    underlying.listTaskDefinitions().toScala

  def listTaskDefinitionsPaginator(): ListTaskDefinitionsPublisher =
    underlying.listTaskDefinitionsPaginator()

  def listTaskDefinitionsPaginator(
      listTaskDefinitionsRequest: ListTaskDefinitionsRequest
  ): ListTaskDefinitionsPublisher =
    underlying.listTaskDefinitionsPaginator(listTaskDefinitionsRequest)

  override def listTasks(listTasksRequest: ListTasksRequest): Future[ListTasksResponse] =
    underlying.listTasks(listTasksRequest).toScala

  override def listTasks(): Future[ListTasksResponse] =
    underlying.listTasks().toScala

  def listTasksPaginator(): ListTasksPublisher =
    underlying.listTasksPaginator()

  def listTasksPaginator(listTasksRequest: ListTasksRequest): ListTasksPublisher =
    underlying.listTasksPaginator(listTasksRequest)

  override def putAccountSetting(
      putAccountSettingRequest: PutAccountSettingRequest
  ): Future[PutAccountSettingResponse] =
    underlying.putAccountSetting(putAccountSettingRequest).toScala

  override def putAccountSettingDefault(
      putAccountSettingDefaultRequest: PutAccountSettingDefaultRequest
  ): Future[PutAccountSettingDefaultResponse] =
    underlying.putAccountSettingDefault(putAccountSettingDefaultRequest).toScala

  override def putAttributes(putAttributesRequest: PutAttributesRequest): Future[PutAttributesResponse] =
    underlying.putAttributes(putAttributesRequest).toScala

  override def putClusterCapacityProviders(
      putClusterCapacityProvidersRequest: PutClusterCapacityProvidersRequest
  ): Future[PutClusterCapacityProvidersResponse] =
    underlying.putClusterCapacityProviders(putClusterCapacityProvidersRequest).toScala

  override def registerContainerInstance(
      registerContainerInstanceRequest: RegisterContainerInstanceRequest
  ): Future[RegisterContainerInstanceResponse] =
    underlying.registerContainerInstance(registerContainerInstanceRequest).toScala

  override def registerTaskDefinition(
      registerTaskDefinitionRequest: RegisterTaskDefinitionRequest
  ): Future[RegisterTaskDefinitionResponse] =
    underlying.registerTaskDefinition(registerTaskDefinitionRequest).toScala

  override def runTask(runTaskRequest: RunTaskRequest): Future[RunTaskResponse] =
    underlying.runTask(runTaskRequest).toScala

  override def startTask(startTaskRequest: StartTaskRequest): Future[StartTaskResponse] =
    underlying.startTask(startTaskRequest).toScala

  override def stopTask(stopTaskRequest: StopTaskRequest): Future[StopTaskResponse] =
    underlying.stopTask(stopTaskRequest).toScala

  override def submitAttachmentStateChanges(
      submitAttachmentStateChangesRequest: SubmitAttachmentStateChangesRequest
  ): Future[SubmitAttachmentStateChangesResponse] =
    underlying.submitAttachmentStateChanges(submitAttachmentStateChangesRequest).toScala

  override def submitContainerStateChange(
      submitContainerStateChangeRequest: SubmitContainerStateChangeRequest
  ): Future[SubmitContainerStateChangeResponse] =
    underlying.submitContainerStateChange(submitContainerStateChangeRequest).toScala

  override def submitTaskStateChange(
      submitTaskStateChangeRequest: SubmitTaskStateChangeRequest
  ): Future[SubmitTaskStateChangeResponse] =
    underlying.submitTaskStateChange(submitTaskStateChangeRequest).toScala

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toScala

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toScala

  override def updateClusterSettings(
      updateClusterSettingsRequest: UpdateClusterSettingsRequest
  ): Future[UpdateClusterSettingsResponse] =
    underlying.updateClusterSettings(updateClusterSettingsRequest).toScala

  override def updateContainerAgent(
      updateContainerAgentRequest: UpdateContainerAgentRequest
  ): Future[UpdateContainerAgentResponse] =
    underlying.updateContainerAgent(updateContainerAgentRequest).toScala

  override def updateContainerInstancesState(
      updateContainerInstancesStateRequest: UpdateContainerInstancesStateRequest
  ): Future[UpdateContainerInstancesStateResponse] =
    underlying.updateContainerInstancesState(updateContainerInstancesStateRequest).toScala

  override def updateService(updateServiceRequest: UpdateServiceRequest): Future[UpdateServiceResponse] =
    underlying.updateService(updateServiceRequest).toScala

  override def updateServicePrimaryTaskSet(
      updateServicePrimaryTaskSetRequest: UpdateServicePrimaryTaskSetRequest
  ): Future[UpdateServicePrimaryTaskSetResponse] =
    underlying.updateServicePrimaryTaskSet(updateServicePrimaryTaskSetRequest).toScala

  override def updateTaskSet(updateTaskSetRequest: UpdateTaskSetRequest): Future[UpdateTaskSetResponse] =
    underlying.updateTaskSet(updateTaskSetRequest).toScala

}
