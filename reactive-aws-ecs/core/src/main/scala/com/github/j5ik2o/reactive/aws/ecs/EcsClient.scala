// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs

import software.amazon.awssdk.services.ecs.model._

trait EcsClient[M[_]] {

  def createCapacityProvider(
      createCapacityProviderRequest: CreateCapacityProviderRequest
  ): M[CreateCapacityProviderResponse]

  def createCluster(createClusterRequest: CreateClusterRequest): M[CreateClusterResponse]

  def createCluster(): M[CreateClusterResponse]

  def createService(createServiceRequest: CreateServiceRequest): M[CreateServiceResponse]

  def createTaskSet(createTaskSetRequest: CreateTaskSetRequest): M[CreateTaskSetResponse]

  def deleteAccountSetting(deleteAccountSettingRequest: DeleteAccountSettingRequest): M[DeleteAccountSettingResponse]

  def deleteAttributes(deleteAttributesRequest: DeleteAttributesRequest): M[DeleteAttributesResponse]

  def deleteCluster(deleteClusterRequest: DeleteClusterRequest): M[DeleteClusterResponse]

  def deleteService(deleteServiceRequest: DeleteServiceRequest): M[DeleteServiceResponse]

  def deleteTaskSet(deleteTaskSetRequest: DeleteTaskSetRequest): M[DeleteTaskSetResponse]

  def deregisterContainerInstance(
      deregisterContainerInstanceRequest: DeregisterContainerInstanceRequest
  ): M[DeregisterContainerInstanceResponse]

  def deregisterTaskDefinition(
      deregisterTaskDefinitionRequest: DeregisterTaskDefinitionRequest
  ): M[DeregisterTaskDefinitionResponse]

  def describeCapacityProviders(
      describeCapacityProvidersRequest: DescribeCapacityProvidersRequest
  ): M[DescribeCapacityProvidersResponse]

  def describeClusters(describeClustersRequest: DescribeClustersRequest): M[DescribeClustersResponse]

  def describeClusters(): M[DescribeClustersResponse]

  def describeContainerInstances(
      describeContainerInstancesRequest: DescribeContainerInstancesRequest
  ): M[DescribeContainerInstancesResponse]

  def describeServices(describeServicesRequest: DescribeServicesRequest): M[DescribeServicesResponse]

  def describeTaskDefinition(
      describeTaskDefinitionRequest: DescribeTaskDefinitionRequest
  ): M[DescribeTaskDefinitionResponse]

  def describeTaskSets(describeTaskSetsRequest: DescribeTaskSetsRequest): M[DescribeTaskSetsResponse]

  def describeTasks(describeTasksRequest: DescribeTasksRequest): M[DescribeTasksResponse]

  def discoverPollEndpoint(discoverPollEndpointRequest: DiscoverPollEndpointRequest): M[DiscoverPollEndpointResponse]

  def listAccountSettings(listAccountSettingsRequest: ListAccountSettingsRequest): M[ListAccountSettingsResponse]

  def listAccountSettings(): M[ListAccountSettingsResponse]

  def listAttributes(listAttributesRequest: ListAttributesRequest): M[ListAttributesResponse]

  def listClusters(listClustersRequest: ListClustersRequest): M[ListClustersResponse]

  def listClusters(): M[ListClustersResponse]

  def listContainerInstances(
      listContainerInstancesRequest: ListContainerInstancesRequest
  ): M[ListContainerInstancesResponse]

  def listContainerInstances(): M[ListContainerInstancesResponse]

  def listServices(listServicesRequest: ListServicesRequest): M[ListServicesResponse]

  def listServices(): M[ListServicesResponse]

  def listTagsForResource(listTagsForResourceRequest: ListTagsForResourceRequest): M[ListTagsForResourceResponse]

  def listTaskDefinitionFamilies(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest
  ): M[ListTaskDefinitionFamiliesResponse]

  def listTaskDefinitionFamilies(): M[ListTaskDefinitionFamiliesResponse]

  def listTaskDefinitions(listTaskDefinitionsRequest: ListTaskDefinitionsRequest): M[ListTaskDefinitionsResponse]

  def listTaskDefinitions(): M[ListTaskDefinitionsResponse]

  def listTasks(listTasksRequest: ListTasksRequest): M[ListTasksResponse]

  def listTasks(): M[ListTasksResponse]

  def putAccountSetting(putAccountSettingRequest: PutAccountSettingRequest): M[PutAccountSettingResponse]

  def putAccountSettingDefault(
      putAccountSettingDefaultRequest: PutAccountSettingDefaultRequest
  ): M[PutAccountSettingDefaultResponse]

  def putAttributes(putAttributesRequest: PutAttributesRequest): M[PutAttributesResponse]

  def putClusterCapacityProviders(
      putClusterCapacityProvidersRequest: PutClusterCapacityProvidersRequest
  ): M[PutClusterCapacityProvidersResponse]

  def registerContainerInstance(
      registerContainerInstanceRequest: RegisterContainerInstanceRequest
  ): M[RegisterContainerInstanceResponse]

  def registerTaskDefinition(
      registerTaskDefinitionRequest: RegisterTaskDefinitionRequest
  ): M[RegisterTaskDefinitionResponse]

  def runTask(runTaskRequest: RunTaskRequest): M[RunTaskResponse]

  def startTask(startTaskRequest: StartTaskRequest): M[StartTaskResponse]

  def stopTask(stopTaskRequest: StopTaskRequest): M[StopTaskResponse]

  def submitAttachmentStateChanges(
      submitAttachmentStateChangesRequest: SubmitAttachmentStateChangesRequest
  ): M[SubmitAttachmentStateChangesResponse]

  def submitContainerStateChange(
      submitContainerStateChangeRequest: SubmitContainerStateChangeRequest
  ): M[SubmitContainerStateChangeResponse]

  def submitTaskStateChange(
      submitTaskStateChangeRequest: SubmitTaskStateChangeRequest
  ): M[SubmitTaskStateChangeResponse]

  def tagResource(tagResourceRequest: TagResourceRequest): M[TagResourceResponse]

  def untagResource(untagResourceRequest: UntagResourceRequest): M[UntagResourceResponse]

  def updateClusterSettings(
      updateClusterSettingsRequest: UpdateClusterSettingsRequest
  ): M[UpdateClusterSettingsResponse]

  def updateContainerAgent(updateContainerAgentRequest: UpdateContainerAgentRequest): M[UpdateContainerAgentResponse]

  def updateContainerInstancesState(
      updateContainerInstancesStateRequest: UpdateContainerInstancesStateRequest
  ): M[UpdateContainerInstancesStateResponse]

  def updateService(updateServiceRequest: UpdateServiceRequest): M[UpdateServiceResponse]

  def updateServicePrimaryTaskSet(
      updateServicePrimaryTaskSetRequest: UpdateServicePrimaryTaskSetRequest
  ): M[UpdateServicePrimaryTaskSetResponse]

  def updateTaskSet(updateTaskSetRequest: UpdateTaskSetRequest): M[UpdateTaskSetResponse]

}
