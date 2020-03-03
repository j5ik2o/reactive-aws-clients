// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.monix

import software.amazon.awssdk.services.ecs.model._
import com.github.j5ik2o.reactive.aws.ecs.{ EcsAsyncClient, EcsClient }
import monix.eval.Task
import monix.reactive.Observable

object EcsMonixClient {

  def apply(asyncClient: EcsAsyncClient): EcsMonixClient = new EcsMonixClient {
    override val underlying: EcsAsyncClient = asyncClient
  }

}

trait EcsMonixClient extends EcsClient[Task] {

  val underlying: EcsAsyncClient

  override def createCapacityProvider(
      createCapacityProviderRequest: CreateCapacityProviderRequest
  ): Task[CreateCapacityProviderResponse] =
    Task.deferFuture {
      underlying.createCapacityProvider(createCapacityProviderRequest)
    }

  override def createCluster(createClusterRequest: CreateClusterRequest): Task[CreateClusterResponse] =
    Task.deferFuture {
      underlying.createCluster(createClusterRequest)
    }

  override def createCluster(): Task[CreateClusterResponse] =
    Task.deferFuture {
      underlying.createCluster()
    }

  override def createService(createServiceRequest: CreateServiceRequest): Task[CreateServiceResponse] =
    Task.deferFuture {
      underlying.createService(createServiceRequest)
    }

  override def createTaskSet(createTaskSetRequest: CreateTaskSetRequest): Task[CreateTaskSetResponse] =
    Task.deferFuture {
      underlying.createTaskSet(createTaskSetRequest)
    }

  override def deleteAccountSetting(
      deleteAccountSettingRequest: DeleteAccountSettingRequest
  ): Task[DeleteAccountSettingResponse] =
    Task.deferFuture {
      underlying.deleteAccountSetting(deleteAccountSettingRequest)
    }

  override def deleteAttributes(deleteAttributesRequest: DeleteAttributesRequest): Task[DeleteAttributesResponse] =
    Task.deferFuture {
      underlying.deleteAttributes(deleteAttributesRequest)
    }

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Task[DeleteClusterResponse] =
    Task.deferFuture {
      underlying.deleteCluster(deleteClusterRequest)
    }

  override def deleteService(deleteServiceRequest: DeleteServiceRequest): Task[DeleteServiceResponse] =
    Task.deferFuture {
      underlying.deleteService(deleteServiceRequest)
    }

  override def deleteTaskSet(deleteTaskSetRequest: DeleteTaskSetRequest): Task[DeleteTaskSetResponse] =
    Task.deferFuture {
      underlying.deleteTaskSet(deleteTaskSetRequest)
    }

  override def deregisterContainerInstance(
      deregisterContainerInstanceRequest: DeregisterContainerInstanceRequest
  ): Task[DeregisterContainerInstanceResponse] =
    Task.deferFuture {
      underlying.deregisterContainerInstance(deregisterContainerInstanceRequest)
    }

  override def deregisterTaskDefinition(
      deregisterTaskDefinitionRequest: DeregisterTaskDefinitionRequest
  ): Task[DeregisterTaskDefinitionResponse] =
    Task.deferFuture {
      underlying.deregisterTaskDefinition(deregisterTaskDefinitionRequest)
    }

  override def describeCapacityProviders(
      describeCapacityProvidersRequest: DescribeCapacityProvidersRequest
  ): Task[DescribeCapacityProvidersResponse] =
    Task.deferFuture {
      underlying.describeCapacityProviders(describeCapacityProvidersRequest)
    }

  override def describeClusters(describeClustersRequest: DescribeClustersRequest): Task[DescribeClustersResponse] =
    Task.deferFuture {
      underlying.describeClusters(describeClustersRequest)
    }

  override def describeClusters(): Task[DescribeClustersResponse] =
    Task.deferFuture {
      underlying.describeClusters()
    }

  override def describeContainerInstances(
      describeContainerInstancesRequest: DescribeContainerInstancesRequest
  ): Task[DescribeContainerInstancesResponse] =
    Task.deferFuture {
      underlying.describeContainerInstances(describeContainerInstancesRequest)
    }

  override def describeServices(describeServicesRequest: DescribeServicesRequest): Task[DescribeServicesResponse] =
    Task.deferFuture {
      underlying.describeServices(describeServicesRequest)
    }

  override def describeTaskDefinition(
      describeTaskDefinitionRequest: DescribeTaskDefinitionRequest
  ): Task[DescribeTaskDefinitionResponse] =
    Task.deferFuture {
      underlying.describeTaskDefinition(describeTaskDefinitionRequest)
    }

  override def describeTaskSets(describeTaskSetsRequest: DescribeTaskSetsRequest): Task[DescribeTaskSetsResponse] =
    Task.deferFuture {
      underlying.describeTaskSets(describeTaskSetsRequest)
    }

  override def describeTasks(describeTasksRequest: DescribeTasksRequest): Task[DescribeTasksResponse] =
    Task.deferFuture {
      underlying.describeTasks(describeTasksRequest)
    }

  override def discoverPollEndpoint(
      discoverPollEndpointRequest: DiscoverPollEndpointRequest
  ): Task[DiscoverPollEndpointResponse] =
    Task.deferFuture {
      underlying.discoverPollEndpoint(discoverPollEndpointRequest)
    }

  override def listAccountSettings(
      listAccountSettingsRequest: ListAccountSettingsRequest
  ): Task[ListAccountSettingsResponse] =
    Task.deferFuture {
      underlying.listAccountSettings(listAccountSettingsRequest)
    }

  override def listAccountSettings(): Task[ListAccountSettingsResponse] =
    Task.deferFuture {
      underlying.listAccountSettings()
    }

  def listAccountSettingsPaginator(): Observable[ListAccountSettingsResponse] =
    Observable.fromReactivePublisher(underlying.listAccountSettingsPaginator())

  def listAccountSettingsPaginator(
      listAccountSettingsRequest: ListAccountSettingsRequest
  ): Observable[ListAccountSettingsResponse] =
    Observable.fromReactivePublisher(underlying.listAccountSettingsPaginator(listAccountSettingsRequest))

  override def listAttributes(listAttributesRequest: ListAttributesRequest): Task[ListAttributesResponse] =
    Task.deferFuture {
      underlying.listAttributes(listAttributesRequest)
    }

  def listAttributesPaginator(listAttributesRequest: ListAttributesRequest): Observable[ListAttributesResponse] =
    Observable.fromReactivePublisher(underlying.listAttributesPaginator(listAttributesRequest))

  override def listClusters(listClustersRequest: ListClustersRequest): Task[ListClustersResponse] =
    Task.deferFuture {
      underlying.listClusters(listClustersRequest)
    }

  override def listClusters(): Task[ListClustersResponse] =
    Task.deferFuture {
      underlying.listClusters()
    }

  def listClustersPaginator(): Observable[ListClustersResponse] =
    Observable.fromReactivePublisher(underlying.listClustersPaginator())

  def listClustersPaginator(listClustersRequest: ListClustersRequest): Observable[ListClustersResponse] =
    Observable.fromReactivePublisher(underlying.listClustersPaginator(listClustersRequest))

  override def listContainerInstances(
      listContainerInstancesRequest: ListContainerInstancesRequest
  ): Task[ListContainerInstancesResponse] =
    Task.deferFuture {
      underlying.listContainerInstances(listContainerInstancesRequest)
    }

  override def listContainerInstances(): Task[ListContainerInstancesResponse] =
    Task.deferFuture {
      underlying.listContainerInstances()
    }

  def listContainerInstancesPaginator(): Observable[ListContainerInstancesResponse] =
    Observable.fromReactivePublisher(underlying.listContainerInstancesPaginator())

  def listContainerInstancesPaginator(
      listContainerInstancesRequest: ListContainerInstancesRequest
  ): Observable[ListContainerInstancesResponse] =
    Observable.fromReactivePublisher(underlying.listContainerInstancesPaginator(listContainerInstancesRequest))

  override def listServices(listServicesRequest: ListServicesRequest): Task[ListServicesResponse] =
    Task.deferFuture {
      underlying.listServices(listServicesRequest)
    }

  override def listServices(): Task[ListServicesResponse] =
    Task.deferFuture {
      underlying.listServices()
    }

  def listServicesPaginator(): Observable[ListServicesResponse] =
    Observable.fromReactivePublisher(underlying.listServicesPaginator())

  def listServicesPaginator(listServicesRequest: ListServicesRequest): Observable[ListServicesResponse] =
    Observable.fromReactivePublisher(underlying.listServicesPaginator(listServicesRequest))

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Task[ListTagsForResourceResponse] =
    Task.deferFuture {
      underlying.listTagsForResource(listTagsForResourceRequest)
    }

  override def listTaskDefinitionFamilies(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest
  ): Task[ListTaskDefinitionFamiliesResponse] =
    Task.deferFuture {
      underlying.listTaskDefinitionFamilies(listTaskDefinitionFamiliesRequest)
    }

  override def listTaskDefinitionFamilies(): Task[ListTaskDefinitionFamiliesResponse] =
    Task.deferFuture {
      underlying.listTaskDefinitionFamilies()
    }

  def listTaskDefinitionFamiliesPaginator(): Observable[ListTaskDefinitionFamiliesResponse] =
    Observable.fromReactivePublisher(underlying.listTaskDefinitionFamiliesPaginator())

  def listTaskDefinitionFamiliesPaginator(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest
  ): Observable[ListTaskDefinitionFamiliesResponse] =
    Observable.fromReactivePublisher(underlying.listTaskDefinitionFamiliesPaginator(listTaskDefinitionFamiliesRequest))

  override def listTaskDefinitions(
      listTaskDefinitionsRequest: ListTaskDefinitionsRequest
  ): Task[ListTaskDefinitionsResponse] =
    Task.deferFuture {
      underlying.listTaskDefinitions(listTaskDefinitionsRequest)
    }

  override def listTaskDefinitions(): Task[ListTaskDefinitionsResponse] =
    Task.deferFuture {
      underlying.listTaskDefinitions()
    }

  def listTaskDefinitionsPaginator(): Observable[ListTaskDefinitionsResponse] =
    Observable.fromReactivePublisher(underlying.listTaskDefinitionsPaginator())

  def listTaskDefinitionsPaginator(
      listTaskDefinitionsRequest: ListTaskDefinitionsRequest
  ): Observable[ListTaskDefinitionsResponse] =
    Observable.fromReactivePublisher(underlying.listTaskDefinitionsPaginator(listTaskDefinitionsRequest))

  override def listTasks(listTasksRequest: ListTasksRequest): Task[ListTasksResponse] =
    Task.deferFuture {
      underlying.listTasks(listTasksRequest)
    }

  override def listTasks(): Task[ListTasksResponse] =
    Task.deferFuture {
      underlying.listTasks()
    }

  def listTasksPaginator(): Observable[ListTasksResponse] =
    Observable.fromReactivePublisher(underlying.listTasksPaginator())

  def listTasksPaginator(listTasksRequest: ListTasksRequest): Observable[ListTasksResponse] =
    Observable.fromReactivePublisher(underlying.listTasksPaginator(listTasksRequest))

  override def putAccountSetting(putAccountSettingRequest: PutAccountSettingRequest): Task[PutAccountSettingResponse] =
    Task.deferFuture {
      underlying.putAccountSetting(putAccountSettingRequest)
    }

  override def putAccountSettingDefault(
      putAccountSettingDefaultRequest: PutAccountSettingDefaultRequest
  ): Task[PutAccountSettingDefaultResponse] =
    Task.deferFuture {
      underlying.putAccountSettingDefault(putAccountSettingDefaultRequest)
    }

  override def putAttributes(putAttributesRequest: PutAttributesRequest): Task[PutAttributesResponse] =
    Task.deferFuture {
      underlying.putAttributes(putAttributesRequest)
    }

  override def putClusterCapacityProviders(
      putClusterCapacityProvidersRequest: PutClusterCapacityProvidersRequest
  ): Task[PutClusterCapacityProvidersResponse] =
    Task.deferFuture {
      underlying.putClusterCapacityProviders(putClusterCapacityProvidersRequest)
    }

  override def registerContainerInstance(
      registerContainerInstanceRequest: RegisterContainerInstanceRequest
  ): Task[RegisterContainerInstanceResponse] =
    Task.deferFuture {
      underlying.registerContainerInstance(registerContainerInstanceRequest)
    }

  override def registerTaskDefinition(
      registerTaskDefinitionRequest: RegisterTaskDefinitionRequest
  ): Task[RegisterTaskDefinitionResponse] =
    Task.deferFuture {
      underlying.registerTaskDefinition(registerTaskDefinitionRequest)
    }

  override def runTask(runTaskRequest: RunTaskRequest): Task[RunTaskResponse] =
    Task.deferFuture {
      underlying.runTask(runTaskRequest)
    }

  override def startTask(startTaskRequest: StartTaskRequest): Task[StartTaskResponse] =
    Task.deferFuture {
      underlying.startTask(startTaskRequest)
    }

  override def stopTask(stopTaskRequest: StopTaskRequest): Task[StopTaskResponse] =
    Task.deferFuture {
      underlying.stopTask(stopTaskRequest)
    }

  override def submitAttachmentStateChanges(
      submitAttachmentStateChangesRequest: SubmitAttachmentStateChangesRequest
  ): Task[SubmitAttachmentStateChangesResponse] =
    Task.deferFuture {
      underlying.submitAttachmentStateChanges(submitAttachmentStateChangesRequest)
    }

  override def submitContainerStateChange(
      submitContainerStateChangeRequest: SubmitContainerStateChangeRequest
  ): Task[SubmitContainerStateChangeResponse] =
    Task.deferFuture {
      underlying.submitContainerStateChange(submitContainerStateChangeRequest)
    }

  override def submitTaskStateChange(
      submitTaskStateChangeRequest: SubmitTaskStateChangeRequest
  ): Task[SubmitTaskStateChangeResponse] =
    Task.deferFuture {
      underlying.submitTaskStateChange(submitTaskStateChangeRequest)
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): Task[TagResourceResponse] =
    Task.deferFuture {
      underlying.tagResource(tagResourceRequest)
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Task[UntagResourceResponse] =
    Task.deferFuture {
      underlying.untagResource(untagResourceRequest)
    }

  override def updateClusterSettings(
      updateClusterSettingsRequest: UpdateClusterSettingsRequest
  ): Task[UpdateClusterSettingsResponse] =
    Task.deferFuture {
      underlying.updateClusterSettings(updateClusterSettingsRequest)
    }

  override def updateContainerAgent(
      updateContainerAgentRequest: UpdateContainerAgentRequest
  ): Task[UpdateContainerAgentResponse] =
    Task.deferFuture {
      underlying.updateContainerAgent(updateContainerAgentRequest)
    }

  override def updateContainerInstancesState(
      updateContainerInstancesStateRequest: UpdateContainerInstancesStateRequest
  ): Task[UpdateContainerInstancesStateResponse] =
    Task.deferFuture {
      underlying.updateContainerInstancesState(updateContainerInstancesStateRequest)
    }

  override def updateService(updateServiceRequest: UpdateServiceRequest): Task[UpdateServiceResponse] =
    Task.deferFuture {
      underlying.updateService(updateServiceRequest)
    }

  override def updateServicePrimaryTaskSet(
      updateServicePrimaryTaskSetRequest: UpdateServicePrimaryTaskSetRequest
  ): Task[UpdateServicePrimaryTaskSetResponse] =
    Task.deferFuture {
      underlying.updateServicePrimaryTaskSet(updateServicePrimaryTaskSetRequest)
    }

  override def updateTaskSet(updateTaskSetRequest: UpdateTaskSetRequest): Task[UpdateTaskSetResponse] =
    Task.deferFuture {
      underlying.updateTaskSet(updateTaskSetRequest)
    }

}
