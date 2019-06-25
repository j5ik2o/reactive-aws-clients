// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.ecs.EcsAsyncClient
import software.amazon.awssdk.services.ecs.model._

object EcsAkkaClient {

  def apply(asyncClient: EcsAsyncClient): EcsAkkaClient = new EcsAkkaClient {
    override val underlying: EcsAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait EcsAkkaClient {

  import EcsAkkaClient._

  val underlying: EcsAsyncClient

  def createClusterSource(
      createClusterRequest: CreateClusterRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateClusterResponse, NotUsed] =
    Source.single(createClusterRequest).via(createClusterFlow(parallelism))

  def createClusterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateClusterRequest, CreateClusterResponse, NotUsed] =
    Flow[CreateClusterRequest].mapAsync(parallelism) { createClusterRequest =>
      underlying.createCluster(createClusterRequest)
    }

  def createClusterSource(): Source[CreateClusterResponse, NotUsed] =
    Source.fromFuture(underlying.createCluster())

  def createServiceSource(
      createServiceRequest: CreateServiceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateServiceResponse, NotUsed] =
    Source.single(createServiceRequest).via(createServiceFlow(parallelism))

  def createServiceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateServiceRequest, CreateServiceResponse, NotUsed] =
    Flow[CreateServiceRequest].mapAsync(parallelism) { createServiceRequest =>
      underlying.createService(createServiceRequest)
    }

  def createTaskSetSource(
      createTaskSetRequest: CreateTaskSetRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateTaskSetResponse, NotUsed] =
    Source.single(createTaskSetRequest).via(createTaskSetFlow(parallelism))

  def createTaskSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateTaskSetRequest, CreateTaskSetResponse, NotUsed] =
    Flow[CreateTaskSetRequest].mapAsync(parallelism) { createTaskSetRequest =>
      underlying.createTaskSet(createTaskSetRequest)
    }

  def deleteAccountSettingSource(
      deleteAccountSettingRequest: DeleteAccountSettingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteAccountSettingResponse, NotUsed] =
    Source.single(deleteAccountSettingRequest).via(deleteAccountSettingFlow(parallelism))

  def deleteAccountSettingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteAccountSettingRequest, DeleteAccountSettingResponse, NotUsed] =
    Flow[DeleteAccountSettingRequest].mapAsync(parallelism) { deleteAccountSettingRequest =>
      underlying.deleteAccountSetting(deleteAccountSettingRequest)
    }

  def deleteAttributesSource(
      deleteAttributesRequest: DeleteAttributesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteAttributesResponse, NotUsed] =
    Source.single(deleteAttributesRequest).via(deleteAttributesFlow(parallelism))

  def deleteAttributesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteAttributesRequest, DeleteAttributesResponse, NotUsed] =
    Flow[DeleteAttributesRequest].mapAsync(parallelism) { deleteAttributesRequest =>
      underlying.deleteAttributes(deleteAttributesRequest)
    }

  def deleteClusterSource(
      deleteClusterRequest: DeleteClusterRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteClusterResponse, NotUsed] =
    Source.single(deleteClusterRequest).via(deleteClusterFlow(parallelism))

  def deleteClusterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteClusterRequest, DeleteClusterResponse, NotUsed] =
    Flow[DeleteClusterRequest].mapAsync(parallelism) { deleteClusterRequest =>
      underlying.deleteCluster(deleteClusterRequest)
    }

  def deleteServiceSource(
      deleteServiceRequest: DeleteServiceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteServiceResponse, NotUsed] =
    Source.single(deleteServiceRequest).via(deleteServiceFlow(parallelism))

  def deleteServiceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteServiceRequest, DeleteServiceResponse, NotUsed] =
    Flow[DeleteServiceRequest].mapAsync(parallelism) { deleteServiceRequest =>
      underlying.deleteService(deleteServiceRequest)
    }

  def deleteTaskSetSource(
      deleteTaskSetRequest: DeleteTaskSetRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteTaskSetResponse, NotUsed] =
    Source.single(deleteTaskSetRequest).via(deleteTaskSetFlow(parallelism))

  def deleteTaskSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteTaskSetRequest, DeleteTaskSetResponse, NotUsed] =
    Flow[DeleteTaskSetRequest].mapAsync(parallelism) { deleteTaskSetRequest =>
      underlying.deleteTaskSet(deleteTaskSetRequest)
    }

  def deregisterContainerInstanceSource(
      deregisterContainerInstanceRequest: DeregisterContainerInstanceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeregisterContainerInstanceResponse, NotUsed] =
    Source.single(deregisterContainerInstanceRequest).via(deregisterContainerInstanceFlow(parallelism))

  def deregisterContainerInstanceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeregisterContainerInstanceRequest, DeregisterContainerInstanceResponse, NotUsed] =
    Flow[DeregisterContainerInstanceRequest].mapAsync(parallelism) { deregisterContainerInstanceRequest =>
      underlying.deregisterContainerInstance(deregisterContainerInstanceRequest)
    }

  def deregisterTaskDefinitionSource(
      deregisterTaskDefinitionRequest: DeregisterTaskDefinitionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeregisterTaskDefinitionResponse, NotUsed] =
    Source.single(deregisterTaskDefinitionRequest).via(deregisterTaskDefinitionFlow(parallelism))

  def deregisterTaskDefinitionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeregisterTaskDefinitionRequest, DeregisterTaskDefinitionResponse, NotUsed] =
    Flow[DeregisterTaskDefinitionRequest].mapAsync(parallelism) { deregisterTaskDefinitionRequest =>
      underlying.deregisterTaskDefinition(deregisterTaskDefinitionRequest)
    }

  def describeClustersSource(
      describeClustersRequest: DescribeClustersRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeClustersResponse, NotUsed] =
    Source.single(describeClustersRequest).via(describeClustersFlow(parallelism))

  def describeClustersFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeClustersRequest, DescribeClustersResponse, NotUsed] =
    Flow[DescribeClustersRequest].mapAsync(parallelism) { describeClustersRequest =>
      underlying.describeClusters(describeClustersRequest)
    }

  def describeClustersSource(): Source[DescribeClustersResponse, NotUsed] =
    Source.fromFuture(underlying.describeClusters())

  def describeContainerInstancesSource(
      describeContainerInstancesRequest: DescribeContainerInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeContainerInstancesResponse, NotUsed] =
    Source.single(describeContainerInstancesRequest).via(describeContainerInstancesFlow(parallelism))

  def describeContainerInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeContainerInstancesRequest, DescribeContainerInstancesResponse, NotUsed] =
    Flow[DescribeContainerInstancesRequest].mapAsync(parallelism) { describeContainerInstancesRequest =>
      underlying.describeContainerInstances(describeContainerInstancesRequest)
    }

  def describeServicesSource(
      describeServicesRequest: DescribeServicesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeServicesResponse, NotUsed] =
    Source.single(describeServicesRequest).via(describeServicesFlow(parallelism))

  def describeServicesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeServicesRequest, DescribeServicesResponse, NotUsed] =
    Flow[DescribeServicesRequest].mapAsync(parallelism) { describeServicesRequest =>
      underlying.describeServices(describeServicesRequest)
    }

  def describeTaskDefinitionSource(
      describeTaskDefinitionRequest: DescribeTaskDefinitionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTaskDefinitionResponse, NotUsed] =
    Source.single(describeTaskDefinitionRequest).via(describeTaskDefinitionFlow(parallelism))

  def describeTaskDefinitionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTaskDefinitionRequest, DescribeTaskDefinitionResponse, NotUsed] =
    Flow[DescribeTaskDefinitionRequest].mapAsync(parallelism) { describeTaskDefinitionRequest =>
      underlying.describeTaskDefinition(describeTaskDefinitionRequest)
    }

  def describeTaskSetsSource(
      describeTaskSetsRequest: DescribeTaskSetsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTaskSetsResponse, NotUsed] =
    Source.single(describeTaskSetsRequest).via(describeTaskSetsFlow(parallelism))

  def describeTaskSetsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTaskSetsRequest, DescribeTaskSetsResponse, NotUsed] =
    Flow[DescribeTaskSetsRequest].mapAsync(parallelism) { describeTaskSetsRequest =>
      underlying.describeTaskSets(describeTaskSetsRequest)
    }

  def describeTasksSource(
      describeTasksRequest: DescribeTasksRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTasksResponse, NotUsed] =
    Source.single(describeTasksRequest).via(describeTasksFlow(parallelism))

  def describeTasksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTasksRequest, DescribeTasksResponse, NotUsed] =
    Flow[DescribeTasksRequest].mapAsync(parallelism) { describeTasksRequest =>
      underlying.describeTasks(describeTasksRequest)
    }

  def discoverPollEndpointSource(
      discoverPollEndpointRequest: DiscoverPollEndpointRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DiscoverPollEndpointResponse, NotUsed] =
    Source.single(discoverPollEndpointRequest).via(discoverPollEndpointFlow(parallelism))

  def discoverPollEndpointFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DiscoverPollEndpointRequest, DiscoverPollEndpointResponse, NotUsed] =
    Flow[DiscoverPollEndpointRequest].mapAsync(parallelism) { discoverPollEndpointRequest =>
      underlying.discoverPollEndpoint(discoverPollEndpointRequest)
    }

  def listAccountSettingsSource(
      listAccountSettingsRequest: ListAccountSettingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListAccountSettingsResponse, NotUsed] =
    Source.single(listAccountSettingsRequest).via(listAccountSettingsFlow(parallelism))

  def listAccountSettingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListAccountSettingsRequest, ListAccountSettingsResponse, NotUsed] =
    Flow[ListAccountSettingsRequest].mapAsync(parallelism) { listAccountSettingsRequest =>
      underlying.listAccountSettings(listAccountSettingsRequest)
    }

  def listAccountSettingsSource(): Source[ListAccountSettingsResponse, NotUsed] =
    Source.fromFuture(underlying.listAccountSettings())

  def listAttributesSource(
      listAttributesRequest: ListAttributesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListAttributesResponse, NotUsed] =
    Source.single(listAttributesRequest).via(listAttributesFlow(parallelism))

  def listAttributesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListAttributesRequest, ListAttributesResponse, NotUsed] =
    Flow[ListAttributesRequest].mapAsync(parallelism) { listAttributesRequest =>
      underlying.listAttributes(listAttributesRequest)
    }

  def listClustersSource(
      listClustersRequest: ListClustersRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListClustersResponse, NotUsed] =
    Source.single(listClustersRequest).via(listClustersFlow(parallelism))

  def listClustersFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListClustersRequest, ListClustersResponse, NotUsed] =
    Flow[ListClustersRequest].mapAsync(parallelism) { listClustersRequest =>
      underlying.listClusters(listClustersRequest)
    }

  def listClustersSource(): Source[ListClustersResponse, NotUsed] =
    Source.fromFuture(underlying.listClusters())

  def listClustersPaginatorSource: Source[ListClustersResponse, NotUsed] =
    Source.fromPublisher(underlying.listClustersPaginator())

  def listClustersPaginatorFlow: Flow[ListClustersRequest, ListClustersResponse, NotUsed] =
    Flow[ListClustersRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listClustersPaginator(request))
    }

  def listContainerInstancesSource(
      listContainerInstancesRequest: ListContainerInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListContainerInstancesResponse, NotUsed] =
    Source.single(listContainerInstancesRequest).via(listContainerInstancesFlow(parallelism))

  def listContainerInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListContainerInstancesRequest, ListContainerInstancesResponse, NotUsed] =
    Flow[ListContainerInstancesRequest].mapAsync(parallelism) { listContainerInstancesRequest =>
      underlying.listContainerInstances(listContainerInstancesRequest)
    }

  def listContainerInstancesSource(): Source[ListContainerInstancesResponse, NotUsed] =
    Source.fromFuture(underlying.listContainerInstances())

  def listContainerInstancesPaginatorSource: Source[ListContainerInstancesResponse, NotUsed] =
    Source.fromPublisher(underlying.listContainerInstancesPaginator())

  def listContainerInstancesPaginatorFlow
      : Flow[ListContainerInstancesRequest, ListContainerInstancesResponse, NotUsed] =
    Flow[ListContainerInstancesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listContainerInstancesPaginator(request))
    }

  def listServicesSource(
      listServicesRequest: ListServicesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListServicesResponse, NotUsed] =
    Source.single(listServicesRequest).via(listServicesFlow(parallelism))

  def listServicesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListServicesRequest, ListServicesResponse, NotUsed] =
    Flow[ListServicesRequest].mapAsync(parallelism) { listServicesRequest =>
      underlying.listServices(listServicesRequest)
    }

  def listServicesSource(): Source[ListServicesResponse, NotUsed] =
    Source.fromFuture(underlying.listServices())

  def listServicesPaginatorSource: Source[ListServicesResponse, NotUsed] =
    Source.fromPublisher(underlying.listServicesPaginator())

  def listServicesPaginatorFlow: Flow[ListServicesRequest, ListServicesResponse, NotUsed] =
    Flow[ListServicesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listServicesPaginator(request))
    }

  def listTagsForResourceSource(
      listTagsForResourceRequest: ListTagsForResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTagsForResourceResponse, NotUsed] =
    Source.single(listTagsForResourceRequest).via(listTagsForResourceFlow(parallelism))

  def listTagsForResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTagsForResourceRequest, ListTagsForResourceResponse, NotUsed] =
    Flow[ListTagsForResourceRequest].mapAsync(parallelism) { listTagsForResourceRequest =>
      underlying.listTagsForResource(listTagsForResourceRequest)
    }

  def listTaskDefinitionFamiliesSource(
      listTaskDefinitionFamiliesRequest: ListTaskDefinitionFamiliesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTaskDefinitionFamiliesResponse, NotUsed] =
    Source.single(listTaskDefinitionFamiliesRequest).via(listTaskDefinitionFamiliesFlow(parallelism))

  def listTaskDefinitionFamiliesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTaskDefinitionFamiliesRequest, ListTaskDefinitionFamiliesResponse, NotUsed] =
    Flow[ListTaskDefinitionFamiliesRequest].mapAsync(parallelism) { listTaskDefinitionFamiliesRequest =>
      underlying.listTaskDefinitionFamilies(listTaskDefinitionFamiliesRequest)
    }

  def listTaskDefinitionFamiliesSource(): Source[ListTaskDefinitionFamiliesResponse, NotUsed] =
    Source.fromFuture(underlying.listTaskDefinitionFamilies())

  def listTaskDefinitionFamiliesPaginatorSource: Source[ListTaskDefinitionFamiliesResponse, NotUsed] =
    Source.fromPublisher(underlying.listTaskDefinitionFamiliesPaginator())

  def listTaskDefinitionFamiliesPaginatorFlow
      : Flow[ListTaskDefinitionFamiliesRequest, ListTaskDefinitionFamiliesResponse, NotUsed] =
    Flow[ListTaskDefinitionFamiliesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listTaskDefinitionFamiliesPaginator(request))
    }

  def listTaskDefinitionsSource(
      listTaskDefinitionsRequest: ListTaskDefinitionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTaskDefinitionsResponse, NotUsed] =
    Source.single(listTaskDefinitionsRequest).via(listTaskDefinitionsFlow(parallelism))

  def listTaskDefinitionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTaskDefinitionsRequest, ListTaskDefinitionsResponse, NotUsed] =
    Flow[ListTaskDefinitionsRequest].mapAsync(parallelism) { listTaskDefinitionsRequest =>
      underlying.listTaskDefinitions(listTaskDefinitionsRequest)
    }

  def listTaskDefinitionsSource(): Source[ListTaskDefinitionsResponse, NotUsed] =
    Source.fromFuture(underlying.listTaskDefinitions())

  def listTaskDefinitionsPaginatorSource: Source[ListTaskDefinitionsResponse, NotUsed] =
    Source.fromPublisher(underlying.listTaskDefinitionsPaginator())

  def listTaskDefinitionsPaginatorFlow: Flow[ListTaskDefinitionsRequest, ListTaskDefinitionsResponse, NotUsed] =
    Flow[ListTaskDefinitionsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listTaskDefinitionsPaginator(request))
    }

  def listTasksSource(
      listTasksRequest: ListTasksRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTasksResponse, NotUsed] =
    Source.single(listTasksRequest).via(listTasksFlow(parallelism))

  def listTasksFlow(parallelism: Int = DefaultParallelism): Flow[ListTasksRequest, ListTasksResponse, NotUsed] =
    Flow[ListTasksRequest].mapAsync(parallelism) { listTasksRequest =>
      underlying.listTasks(listTasksRequest)
    }

  def listTasksSource(): Source[ListTasksResponse, NotUsed] =
    Source.fromFuture(underlying.listTasks())

  def listTasksPaginatorSource: Source[ListTasksResponse, NotUsed] =
    Source.fromPublisher(underlying.listTasksPaginator())

  def listTasksPaginatorFlow: Flow[ListTasksRequest, ListTasksResponse, NotUsed] =
    Flow[ListTasksRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listTasksPaginator(request))
    }

  def putAccountSettingSource(
      putAccountSettingRequest: PutAccountSettingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutAccountSettingResponse, NotUsed] =
    Source.single(putAccountSettingRequest).via(putAccountSettingFlow(parallelism))

  def putAccountSettingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutAccountSettingRequest, PutAccountSettingResponse, NotUsed] =
    Flow[PutAccountSettingRequest].mapAsync(parallelism) { putAccountSettingRequest =>
      underlying.putAccountSetting(putAccountSettingRequest)
    }

  def putAccountSettingDefaultSource(
      putAccountSettingDefaultRequest: PutAccountSettingDefaultRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutAccountSettingDefaultResponse, NotUsed] =
    Source.single(putAccountSettingDefaultRequest).via(putAccountSettingDefaultFlow(parallelism))

  def putAccountSettingDefaultFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutAccountSettingDefaultRequest, PutAccountSettingDefaultResponse, NotUsed] =
    Flow[PutAccountSettingDefaultRequest].mapAsync(parallelism) { putAccountSettingDefaultRequest =>
      underlying.putAccountSettingDefault(putAccountSettingDefaultRequest)
    }

  def putAttributesSource(
      putAttributesRequest: PutAttributesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutAttributesResponse, NotUsed] =
    Source.single(putAttributesRequest).via(putAttributesFlow(parallelism))

  def putAttributesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutAttributesRequest, PutAttributesResponse, NotUsed] =
    Flow[PutAttributesRequest].mapAsync(parallelism) { putAttributesRequest =>
      underlying.putAttributes(putAttributesRequest)
    }

  def registerContainerInstanceSource(
      registerContainerInstanceRequest: RegisterContainerInstanceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RegisterContainerInstanceResponse, NotUsed] =
    Source.single(registerContainerInstanceRequest).via(registerContainerInstanceFlow(parallelism))

  def registerContainerInstanceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RegisterContainerInstanceRequest, RegisterContainerInstanceResponse, NotUsed] =
    Flow[RegisterContainerInstanceRequest].mapAsync(parallelism) { registerContainerInstanceRequest =>
      underlying.registerContainerInstance(registerContainerInstanceRequest)
    }

  def registerTaskDefinitionSource(
      registerTaskDefinitionRequest: RegisterTaskDefinitionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RegisterTaskDefinitionResponse, NotUsed] =
    Source.single(registerTaskDefinitionRequest).via(registerTaskDefinitionFlow(parallelism))

  def registerTaskDefinitionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RegisterTaskDefinitionRequest, RegisterTaskDefinitionResponse, NotUsed] =
    Flow[RegisterTaskDefinitionRequest].mapAsync(parallelism) { registerTaskDefinitionRequest =>
      underlying.registerTaskDefinition(registerTaskDefinitionRequest)
    }

  def runTaskSource(
      runTaskRequest: RunTaskRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RunTaskResponse, NotUsed] =
    Source.single(runTaskRequest).via(runTaskFlow(parallelism))

  def runTaskFlow(parallelism: Int = DefaultParallelism): Flow[RunTaskRequest, RunTaskResponse, NotUsed] =
    Flow[RunTaskRequest].mapAsync(parallelism) { runTaskRequest =>
      underlying.runTask(runTaskRequest)
    }

  def startTaskSource(
      startTaskRequest: StartTaskRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartTaskResponse, NotUsed] =
    Source.single(startTaskRequest).via(startTaskFlow(parallelism))

  def startTaskFlow(parallelism: Int = DefaultParallelism): Flow[StartTaskRequest, StartTaskResponse, NotUsed] =
    Flow[StartTaskRequest].mapAsync(parallelism) { startTaskRequest =>
      underlying.startTask(startTaskRequest)
    }

  def stopTaskSource(
      stopTaskRequest: StopTaskRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StopTaskResponse, NotUsed] =
    Source.single(stopTaskRequest).via(stopTaskFlow(parallelism))

  def stopTaskFlow(parallelism: Int = DefaultParallelism): Flow[StopTaskRequest, StopTaskResponse, NotUsed] =
    Flow[StopTaskRequest].mapAsync(parallelism) { stopTaskRequest =>
      underlying.stopTask(stopTaskRequest)
    }

  def submitContainerStateChangeSource(
      submitContainerStateChangeRequest: SubmitContainerStateChangeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[SubmitContainerStateChangeResponse, NotUsed] =
    Source.single(submitContainerStateChangeRequest).via(submitContainerStateChangeFlow(parallelism))

  def submitContainerStateChangeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SubmitContainerStateChangeRequest, SubmitContainerStateChangeResponse, NotUsed] =
    Flow[SubmitContainerStateChangeRequest].mapAsync(parallelism) { submitContainerStateChangeRequest =>
      underlying.submitContainerStateChange(submitContainerStateChangeRequest)
    }

  def submitTaskStateChangeSource(
      submitTaskStateChangeRequest: SubmitTaskStateChangeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[SubmitTaskStateChangeResponse, NotUsed] =
    Source.single(submitTaskStateChangeRequest).via(submitTaskStateChangeFlow(parallelism))

  def submitTaskStateChangeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SubmitTaskStateChangeRequest, SubmitTaskStateChangeResponse, NotUsed] =
    Flow[SubmitTaskStateChangeRequest].mapAsync(parallelism) { submitTaskStateChangeRequest =>
      underlying.submitTaskStateChange(submitTaskStateChangeRequest)
    }

  def tagResourceSource(
      tagResourceRequest: TagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TagResourceResponse, NotUsed] =
    Source.single(tagResourceRequest).via(tagResourceFlow(parallelism))

  def tagResourceFlow(parallelism: Int = DefaultParallelism): Flow[TagResourceRequest, TagResourceResponse, NotUsed] =
    Flow[TagResourceRequest].mapAsync(parallelism) { tagResourceRequest =>
      underlying.tagResource(tagResourceRequest)
    }

  def untagResourceSource(
      untagResourceRequest: UntagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UntagResourceResponse, NotUsed] =
    Source.single(untagResourceRequest).via(untagResourceFlow(parallelism))

  def untagResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UntagResourceRequest, UntagResourceResponse, NotUsed] =
    Flow[UntagResourceRequest].mapAsync(parallelism) { untagResourceRequest =>
      underlying.untagResource(untagResourceRequest)
    }

  def updateContainerAgentSource(
      updateContainerAgentRequest: UpdateContainerAgentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateContainerAgentResponse, NotUsed] =
    Source.single(updateContainerAgentRequest).via(updateContainerAgentFlow(parallelism))

  def updateContainerAgentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateContainerAgentRequest, UpdateContainerAgentResponse, NotUsed] =
    Flow[UpdateContainerAgentRequest].mapAsync(parallelism) { updateContainerAgentRequest =>
      underlying.updateContainerAgent(updateContainerAgentRequest)
    }

  def updateContainerInstancesStateSource(
      updateContainerInstancesStateRequest: UpdateContainerInstancesStateRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateContainerInstancesStateResponse, NotUsed] =
    Source.single(updateContainerInstancesStateRequest).via(updateContainerInstancesStateFlow(parallelism))

  def updateContainerInstancesStateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateContainerInstancesStateRequest, UpdateContainerInstancesStateResponse, NotUsed] =
    Flow[UpdateContainerInstancesStateRequest].mapAsync(parallelism) { updateContainerInstancesStateRequest =>
      underlying.updateContainerInstancesState(updateContainerInstancesStateRequest)
    }

  def updateServiceSource(
      updateServiceRequest: UpdateServiceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateServiceResponse, NotUsed] =
    Source.single(updateServiceRequest).via(updateServiceFlow(parallelism))

  def updateServiceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateServiceRequest, UpdateServiceResponse, NotUsed] =
    Flow[UpdateServiceRequest].mapAsync(parallelism) { updateServiceRequest =>
      underlying.updateService(updateServiceRequest)
    }

  def updateServicePrimaryTaskSetSource(
      updateServicePrimaryTaskSetRequest: UpdateServicePrimaryTaskSetRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateServicePrimaryTaskSetResponse, NotUsed] =
    Source.single(updateServicePrimaryTaskSetRequest).via(updateServicePrimaryTaskSetFlow(parallelism))

  def updateServicePrimaryTaskSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateServicePrimaryTaskSetRequest, UpdateServicePrimaryTaskSetResponse, NotUsed] =
    Flow[UpdateServicePrimaryTaskSetRequest].mapAsync(parallelism) { updateServicePrimaryTaskSetRequest =>
      underlying.updateServicePrimaryTaskSet(updateServicePrimaryTaskSetRequest)
    }

  def updateTaskSetSource(
      updateTaskSetRequest: UpdateTaskSetRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateTaskSetResponse, NotUsed] =
    Source.single(updateTaskSetRequest).via(updateTaskSetFlow(parallelism))

  def updateTaskSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateTaskSetRequest, UpdateTaskSetResponse, NotUsed] =
    Flow[UpdateTaskSetRequest].mapAsync(parallelism) { updateTaskSetRequest =>
      underlying.updateTaskSet(updateTaskSetRequest)
    }

}
