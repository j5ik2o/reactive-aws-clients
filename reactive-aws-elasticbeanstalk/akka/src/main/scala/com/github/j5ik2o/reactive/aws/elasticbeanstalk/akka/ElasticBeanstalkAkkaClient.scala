// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.elasticbeanstalk.ElasticBeanstalkAsyncClient
import software.amazon.awssdk.services.elasticbeanstalk.model._

object ElasticBeanstalkAkkaClient {

  def apply(asyncClient: ElasticBeanstalkAsyncClient): ElasticBeanstalkAkkaClient = new ElasticBeanstalkAkkaClient {
    override val underlying: ElasticBeanstalkAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait ElasticBeanstalkAkkaClient {

  import ElasticBeanstalkAkkaClient._

  val underlying: ElasticBeanstalkAsyncClient

  def abortEnvironmentUpdateSource(
      abortEnvironmentUpdateRequest: AbortEnvironmentUpdateRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AbortEnvironmentUpdateResponse, NotUsed] =
    Source.single(abortEnvironmentUpdateRequest).via(abortEnvironmentUpdateFlow(parallelism))

  def abortEnvironmentUpdateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AbortEnvironmentUpdateRequest, AbortEnvironmentUpdateResponse, NotUsed] =
    Flow[AbortEnvironmentUpdateRequest].mapAsync(parallelism) { abortEnvironmentUpdateRequest =>
      underlying.abortEnvironmentUpdate(abortEnvironmentUpdateRequest)
    }

  def applyEnvironmentManagedActionSource(
      applyEnvironmentManagedActionRequest: ApplyEnvironmentManagedActionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ApplyEnvironmentManagedActionResponse, NotUsed] =
    Source.single(applyEnvironmentManagedActionRequest).via(applyEnvironmentManagedActionFlow(parallelism))

  def applyEnvironmentManagedActionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ApplyEnvironmentManagedActionRequest, ApplyEnvironmentManagedActionResponse, NotUsed] =
    Flow[ApplyEnvironmentManagedActionRequest].mapAsync(parallelism) { applyEnvironmentManagedActionRequest =>
      underlying.applyEnvironmentManagedAction(applyEnvironmentManagedActionRequest)
    }

  def checkDNSAvailabilitySource(
      checkDnsAvailabilityRequest: CheckDnsAvailabilityRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CheckDnsAvailabilityResponse, NotUsed] =
    Source.single(checkDnsAvailabilityRequest).via(checkDNSAvailabilityFlow(parallelism))

  def checkDNSAvailabilityFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CheckDnsAvailabilityRequest, CheckDnsAvailabilityResponse, NotUsed] =
    Flow[CheckDnsAvailabilityRequest].mapAsync(parallelism) { checkDnsAvailabilityRequest =>
      underlying.checkDNSAvailability(checkDnsAvailabilityRequest)
    }

  def composeEnvironmentsSource(
      composeEnvironmentsRequest: ComposeEnvironmentsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ComposeEnvironmentsResponse, NotUsed] =
    Source.single(composeEnvironmentsRequest).via(composeEnvironmentsFlow(parallelism))

  def composeEnvironmentsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ComposeEnvironmentsRequest, ComposeEnvironmentsResponse, NotUsed] =
    Flow[ComposeEnvironmentsRequest].mapAsync(parallelism) { composeEnvironmentsRequest =>
      underlying.composeEnvironments(composeEnvironmentsRequest)
    }

  def createApplicationSource(
      createApplicationRequest: CreateApplicationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateApplicationResponse, NotUsed] =
    Source.single(createApplicationRequest).via(createApplicationFlow(parallelism))

  def createApplicationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateApplicationRequest, CreateApplicationResponse, NotUsed] =
    Flow[CreateApplicationRequest].mapAsync(parallelism) { createApplicationRequest =>
      underlying.createApplication(createApplicationRequest)
    }

  def createApplicationVersionSource(
      createApplicationVersionRequest: CreateApplicationVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateApplicationVersionResponse, NotUsed] =
    Source.single(createApplicationVersionRequest).via(createApplicationVersionFlow(parallelism))

  def createApplicationVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateApplicationVersionRequest, CreateApplicationVersionResponse, NotUsed] =
    Flow[CreateApplicationVersionRequest].mapAsync(parallelism) { createApplicationVersionRequest =>
      underlying.createApplicationVersion(createApplicationVersionRequest)
    }

  def createConfigurationTemplateSource(
      createConfigurationTemplateRequest: CreateConfigurationTemplateRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateConfigurationTemplateResponse, NotUsed] =
    Source.single(createConfigurationTemplateRequest).via(createConfigurationTemplateFlow(parallelism))

  def createConfigurationTemplateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse, NotUsed] =
    Flow[CreateConfigurationTemplateRequest].mapAsync(parallelism) { createConfigurationTemplateRequest =>
      underlying.createConfigurationTemplate(createConfigurationTemplateRequest)
    }

  def createEnvironmentSource(
      createEnvironmentRequest: CreateEnvironmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateEnvironmentResponse, NotUsed] =
    Source.single(createEnvironmentRequest).via(createEnvironmentFlow(parallelism))

  def createEnvironmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateEnvironmentRequest, CreateEnvironmentResponse, NotUsed] =
    Flow[CreateEnvironmentRequest].mapAsync(parallelism) { createEnvironmentRequest =>
      underlying.createEnvironment(createEnvironmentRequest)
    }

  def createPlatformVersionSource(
      createPlatformVersionRequest: CreatePlatformVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreatePlatformVersionResponse, NotUsed] =
    Source.single(createPlatformVersionRequest).via(createPlatformVersionFlow(parallelism))

  def createPlatformVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreatePlatformVersionRequest, CreatePlatformVersionResponse, NotUsed] =
    Flow[CreatePlatformVersionRequest].mapAsync(parallelism) { createPlatformVersionRequest =>
      underlying.createPlatformVersion(createPlatformVersionRequest)
    }

  def createStorageLocationSource(
      createStorageLocationRequest: CreateStorageLocationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateStorageLocationResponse, NotUsed] =
    Source.single(createStorageLocationRequest).via(createStorageLocationFlow(parallelism))

  def createStorageLocationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateStorageLocationRequest, CreateStorageLocationResponse, NotUsed] =
    Flow[CreateStorageLocationRequest].mapAsync(parallelism) { createStorageLocationRequest =>
      underlying.createStorageLocation(createStorageLocationRequest)
    }

  def createStorageLocationSource(): Source[CreateStorageLocationResponse, NotUsed] =
    Source.fromFuture(underlying.createStorageLocation())

  def deleteApplicationSource(
      deleteApplicationRequest: DeleteApplicationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteApplicationResponse, NotUsed] =
    Source.single(deleteApplicationRequest).via(deleteApplicationFlow(parallelism))

  def deleteApplicationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteApplicationRequest, DeleteApplicationResponse, NotUsed] =
    Flow[DeleteApplicationRequest].mapAsync(parallelism) { deleteApplicationRequest =>
      underlying.deleteApplication(deleteApplicationRequest)
    }

  def deleteApplicationVersionSource(
      deleteApplicationVersionRequest: DeleteApplicationVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteApplicationVersionResponse, NotUsed] =
    Source.single(deleteApplicationVersionRequest).via(deleteApplicationVersionFlow(parallelism))

  def deleteApplicationVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteApplicationVersionRequest, DeleteApplicationVersionResponse, NotUsed] =
    Flow[DeleteApplicationVersionRequest].mapAsync(parallelism) { deleteApplicationVersionRequest =>
      underlying.deleteApplicationVersion(deleteApplicationVersionRequest)
    }

  def deleteConfigurationTemplateSource(
      deleteConfigurationTemplateRequest: DeleteConfigurationTemplateRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteConfigurationTemplateResponse, NotUsed] =
    Source.single(deleteConfigurationTemplateRequest).via(deleteConfigurationTemplateFlow(parallelism))

  def deleteConfigurationTemplateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteConfigurationTemplateRequest, DeleteConfigurationTemplateResponse, NotUsed] =
    Flow[DeleteConfigurationTemplateRequest].mapAsync(parallelism) { deleteConfigurationTemplateRequest =>
      underlying.deleteConfigurationTemplate(deleteConfigurationTemplateRequest)
    }

  def deleteEnvironmentConfigurationSource(
      deleteEnvironmentConfigurationRequest: DeleteEnvironmentConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteEnvironmentConfigurationResponse, NotUsed] =
    Source.single(deleteEnvironmentConfigurationRequest).via(deleteEnvironmentConfigurationFlow(parallelism))

  def deleteEnvironmentConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteEnvironmentConfigurationRequest, DeleteEnvironmentConfigurationResponse, NotUsed] =
    Flow[DeleteEnvironmentConfigurationRequest].mapAsync(parallelism) { deleteEnvironmentConfigurationRequest =>
      underlying.deleteEnvironmentConfiguration(deleteEnvironmentConfigurationRequest)
    }

  def deletePlatformVersionSource(
      deletePlatformVersionRequest: DeletePlatformVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeletePlatformVersionResponse, NotUsed] =
    Source.single(deletePlatformVersionRequest).via(deletePlatformVersionFlow(parallelism))

  def deletePlatformVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeletePlatformVersionRequest, DeletePlatformVersionResponse, NotUsed] =
    Flow[DeletePlatformVersionRequest].mapAsync(parallelism) { deletePlatformVersionRequest =>
      underlying.deletePlatformVersion(deletePlatformVersionRequest)
    }

  def describeAccountAttributesSource(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeAccountAttributesResponse, NotUsed] =
    Source.single(describeAccountAttributesRequest).via(describeAccountAttributesFlow(parallelism))

  def describeAccountAttributesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAccountAttributesRequest, DescribeAccountAttributesResponse, NotUsed] =
    Flow[DescribeAccountAttributesRequest].mapAsync(parallelism) { describeAccountAttributesRequest =>
      underlying.describeAccountAttributes(describeAccountAttributesRequest)
    }

  def describeAccountAttributesSource(): Source[DescribeAccountAttributesResponse, NotUsed] =
    Source.fromFuture(underlying.describeAccountAttributes())

  def describeApplicationVersionsSource(
      describeApplicationVersionsRequest: DescribeApplicationVersionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeApplicationVersionsResponse, NotUsed] =
    Source.single(describeApplicationVersionsRequest).via(describeApplicationVersionsFlow(parallelism))

  def describeApplicationVersionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeApplicationVersionsRequest, DescribeApplicationVersionsResponse, NotUsed] =
    Flow[DescribeApplicationVersionsRequest].mapAsync(parallelism) { describeApplicationVersionsRequest =>
      underlying.describeApplicationVersions(describeApplicationVersionsRequest)
    }

  def describeApplicationVersionsSource(): Source[DescribeApplicationVersionsResponse, NotUsed] =
    Source.fromFuture(underlying.describeApplicationVersions())

  def describeApplicationsSource(
      describeApplicationsRequest: DescribeApplicationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeApplicationsResponse, NotUsed] =
    Source.single(describeApplicationsRequest).via(describeApplicationsFlow(parallelism))

  def describeApplicationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeApplicationsRequest, DescribeApplicationsResponse, NotUsed] =
    Flow[DescribeApplicationsRequest].mapAsync(parallelism) { describeApplicationsRequest =>
      underlying.describeApplications(describeApplicationsRequest)
    }

  def describeApplicationsSource(): Source[DescribeApplicationsResponse, NotUsed] =
    Source.fromFuture(underlying.describeApplications())

  def describeConfigurationOptionsSource(
      describeConfigurationOptionsRequest: DescribeConfigurationOptionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeConfigurationOptionsResponse, NotUsed] =
    Source.single(describeConfigurationOptionsRequest).via(describeConfigurationOptionsFlow(parallelism))

  def describeConfigurationOptionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeConfigurationOptionsRequest, DescribeConfigurationOptionsResponse, NotUsed] =
    Flow[DescribeConfigurationOptionsRequest].mapAsync(parallelism) { describeConfigurationOptionsRequest =>
      underlying.describeConfigurationOptions(describeConfigurationOptionsRequest)
    }

  def describeConfigurationSettingsSource(
      describeConfigurationSettingsRequest: DescribeConfigurationSettingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeConfigurationSettingsResponse, NotUsed] =
    Source.single(describeConfigurationSettingsRequest).via(describeConfigurationSettingsFlow(parallelism))

  def describeConfigurationSettingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeConfigurationSettingsRequest, DescribeConfigurationSettingsResponse, NotUsed] =
    Flow[DescribeConfigurationSettingsRequest].mapAsync(parallelism) { describeConfigurationSettingsRequest =>
      underlying.describeConfigurationSettings(describeConfigurationSettingsRequest)
    }

  def describeEnvironmentHealthSource(
      describeEnvironmentHealthRequest: DescribeEnvironmentHealthRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeEnvironmentHealthResponse, NotUsed] =
    Source.single(describeEnvironmentHealthRequest).via(describeEnvironmentHealthFlow(parallelism))

  def describeEnvironmentHealthFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEnvironmentHealthRequest, DescribeEnvironmentHealthResponse, NotUsed] =
    Flow[DescribeEnvironmentHealthRequest].mapAsync(parallelism) { describeEnvironmentHealthRequest =>
      underlying.describeEnvironmentHealth(describeEnvironmentHealthRequest)
    }

  def describeEnvironmentManagedActionHistorySource(
      describeEnvironmentManagedActionHistoryRequest: DescribeEnvironmentManagedActionHistoryRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeEnvironmentManagedActionHistoryResponse, NotUsed] =
    Source
      .single(describeEnvironmentManagedActionHistoryRequest).via(
        describeEnvironmentManagedActionHistoryFlow(parallelism)
      )

  def describeEnvironmentManagedActionHistoryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEnvironmentManagedActionHistoryRequest, DescribeEnvironmentManagedActionHistoryResponse, NotUsed] =
    Flow[DescribeEnvironmentManagedActionHistoryRequest].mapAsync(parallelism) {
      describeEnvironmentManagedActionHistoryRequest =>
        underlying.describeEnvironmentManagedActionHistory(describeEnvironmentManagedActionHistoryRequest)
    }

  def describeEnvironmentManagedActionsSource(
      describeEnvironmentManagedActionsRequest: DescribeEnvironmentManagedActionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeEnvironmentManagedActionsResponse, NotUsed] =
    Source.single(describeEnvironmentManagedActionsRequest).via(describeEnvironmentManagedActionsFlow(parallelism))

  def describeEnvironmentManagedActionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEnvironmentManagedActionsRequest, DescribeEnvironmentManagedActionsResponse, NotUsed] =
    Flow[DescribeEnvironmentManagedActionsRequest].mapAsync(parallelism) { describeEnvironmentManagedActionsRequest =>
      underlying.describeEnvironmentManagedActions(describeEnvironmentManagedActionsRequest)
    }

  def describeEnvironmentResourcesSource(
      describeEnvironmentResourcesRequest: DescribeEnvironmentResourcesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeEnvironmentResourcesResponse, NotUsed] =
    Source.single(describeEnvironmentResourcesRequest).via(describeEnvironmentResourcesFlow(parallelism))

  def describeEnvironmentResourcesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEnvironmentResourcesRequest, DescribeEnvironmentResourcesResponse, NotUsed] =
    Flow[DescribeEnvironmentResourcesRequest].mapAsync(parallelism) { describeEnvironmentResourcesRequest =>
      underlying.describeEnvironmentResources(describeEnvironmentResourcesRequest)
    }

  def describeEnvironmentsSource(
      describeEnvironmentsRequest: DescribeEnvironmentsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeEnvironmentsResponse, NotUsed] =
    Source.single(describeEnvironmentsRequest).via(describeEnvironmentsFlow(parallelism))

  def describeEnvironmentsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEnvironmentsRequest, DescribeEnvironmentsResponse, NotUsed] =
    Flow[DescribeEnvironmentsRequest].mapAsync(parallelism) { describeEnvironmentsRequest =>
      underlying.describeEnvironments(describeEnvironmentsRequest)
    }

  def describeEnvironmentsSource(): Source[DescribeEnvironmentsResponse, NotUsed] =
    Source.fromFuture(underlying.describeEnvironments())

  def describeEventsSource(
      describeEventsRequest: DescribeEventsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeEventsResponse, NotUsed] =
    Source.single(describeEventsRequest).via(describeEventsFlow(parallelism))

  def describeEventsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEventsRequest, DescribeEventsResponse, NotUsed] =
    Flow[DescribeEventsRequest].mapAsync(parallelism) { describeEventsRequest =>
      underlying.describeEvents(describeEventsRequest)
    }

  def describeEventsSource(): Source[DescribeEventsResponse, NotUsed] =
    Source.fromFuture(underlying.describeEvents())

  def describeEventsPaginatorSource: Source[DescribeEventsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeEventsPaginator())

  def describeEventsPaginatorFlow: Flow[DescribeEventsRequest, DescribeEventsResponse, NotUsed] =
    Flow[DescribeEventsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeEventsPaginator(request))
    }

  def describeInstancesHealthSource(
      describeInstancesHealthRequest: DescribeInstancesHealthRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeInstancesHealthResponse, NotUsed] =
    Source.single(describeInstancesHealthRequest).via(describeInstancesHealthFlow(parallelism))

  def describeInstancesHealthFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeInstancesHealthRequest, DescribeInstancesHealthResponse, NotUsed] =
    Flow[DescribeInstancesHealthRequest].mapAsync(parallelism) { describeInstancesHealthRequest =>
      underlying.describeInstancesHealth(describeInstancesHealthRequest)
    }

  def describePlatformVersionSource(
      describePlatformVersionRequest: DescribePlatformVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribePlatformVersionResponse, NotUsed] =
    Source.single(describePlatformVersionRequest).via(describePlatformVersionFlow(parallelism))

  def describePlatformVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribePlatformVersionRequest, DescribePlatformVersionResponse, NotUsed] =
    Flow[DescribePlatformVersionRequest].mapAsync(parallelism) { describePlatformVersionRequest =>
      underlying.describePlatformVersion(describePlatformVersionRequest)
    }

  def listAvailableSolutionStacksSource(
      listAvailableSolutionStacksRequest: ListAvailableSolutionStacksRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListAvailableSolutionStacksResponse, NotUsed] =
    Source.single(listAvailableSolutionStacksRequest).via(listAvailableSolutionStacksFlow(parallelism))

  def listAvailableSolutionStacksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListAvailableSolutionStacksRequest, ListAvailableSolutionStacksResponse, NotUsed] =
    Flow[ListAvailableSolutionStacksRequest].mapAsync(parallelism) { listAvailableSolutionStacksRequest =>
      underlying.listAvailableSolutionStacks(listAvailableSolutionStacksRequest)
    }

  def listAvailableSolutionStacksSource(): Source[ListAvailableSolutionStacksResponse, NotUsed] =
    Source.fromFuture(underlying.listAvailableSolutionStacks())

  def listPlatformBranchesSource(
      listPlatformBranchesRequest: ListPlatformBranchesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListPlatformBranchesResponse, NotUsed] =
    Source.single(listPlatformBranchesRequest).via(listPlatformBranchesFlow(parallelism))

  def listPlatformBranchesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListPlatformBranchesRequest, ListPlatformBranchesResponse, NotUsed] =
    Flow[ListPlatformBranchesRequest].mapAsync(parallelism) { listPlatformBranchesRequest =>
      underlying.listPlatformBranches(listPlatformBranchesRequest)
    }

  def listPlatformBranchesPaginatorFlow: Flow[ListPlatformBranchesRequest, ListPlatformBranchesResponse, NotUsed] =
    Flow[ListPlatformBranchesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listPlatformBranchesPaginator(request))
    }

  def listPlatformVersionsSource(
      listPlatformVersionsRequest: ListPlatformVersionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListPlatformVersionsResponse, NotUsed] =
    Source.single(listPlatformVersionsRequest).via(listPlatformVersionsFlow(parallelism))

  def listPlatformVersionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListPlatformVersionsRequest, ListPlatformVersionsResponse, NotUsed] =
    Flow[ListPlatformVersionsRequest].mapAsync(parallelism) { listPlatformVersionsRequest =>
      underlying.listPlatformVersions(listPlatformVersionsRequest)
    }

  def listPlatformVersionsSource(): Source[ListPlatformVersionsResponse, NotUsed] =
    Source.fromFuture(underlying.listPlatformVersions())

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

  def rebuildEnvironmentSource(
      rebuildEnvironmentRequest: RebuildEnvironmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RebuildEnvironmentResponse, NotUsed] =
    Source.single(rebuildEnvironmentRequest).via(rebuildEnvironmentFlow(parallelism))

  def rebuildEnvironmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RebuildEnvironmentRequest, RebuildEnvironmentResponse, NotUsed] =
    Flow[RebuildEnvironmentRequest].mapAsync(parallelism) { rebuildEnvironmentRequest =>
      underlying.rebuildEnvironment(rebuildEnvironmentRequest)
    }

  def requestEnvironmentInfoSource(
      requestEnvironmentInfoRequest: RequestEnvironmentInfoRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RequestEnvironmentInfoResponse, NotUsed] =
    Source.single(requestEnvironmentInfoRequest).via(requestEnvironmentInfoFlow(parallelism))

  def requestEnvironmentInfoFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RequestEnvironmentInfoRequest, RequestEnvironmentInfoResponse, NotUsed] =
    Flow[RequestEnvironmentInfoRequest].mapAsync(parallelism) { requestEnvironmentInfoRequest =>
      underlying.requestEnvironmentInfo(requestEnvironmentInfoRequest)
    }

  def restartAppServerSource(
      restartAppServerRequest: RestartAppServerRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RestartAppServerResponse, NotUsed] =
    Source.single(restartAppServerRequest).via(restartAppServerFlow(parallelism))

  def restartAppServerFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RestartAppServerRequest, RestartAppServerResponse, NotUsed] =
    Flow[RestartAppServerRequest].mapAsync(parallelism) { restartAppServerRequest =>
      underlying.restartAppServer(restartAppServerRequest)
    }

  def retrieveEnvironmentInfoSource(
      retrieveEnvironmentInfoRequest: RetrieveEnvironmentInfoRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RetrieveEnvironmentInfoResponse, NotUsed] =
    Source.single(retrieveEnvironmentInfoRequest).via(retrieveEnvironmentInfoFlow(parallelism))

  def retrieveEnvironmentInfoFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RetrieveEnvironmentInfoRequest, RetrieveEnvironmentInfoResponse, NotUsed] =
    Flow[RetrieveEnvironmentInfoRequest].mapAsync(parallelism) { retrieveEnvironmentInfoRequest =>
      underlying.retrieveEnvironmentInfo(retrieveEnvironmentInfoRequest)
    }

  def swapEnvironmentCNAMEsSource(
      swapEnvironmentCnamEsRequest: SwapEnvironmentCnamEsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[SwapEnvironmentCNAMEsResponse, NotUsed] =
    Source.single(swapEnvironmentCnamEsRequest).via(swapEnvironmentCNAMEsFlow(parallelism))

  def swapEnvironmentCNAMEsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SwapEnvironmentCnamEsRequest, SwapEnvironmentCNAMEsResponse, NotUsed] =
    Flow[SwapEnvironmentCnamEsRequest].mapAsync(parallelism) { swapEnvironmentCnamEsRequest =>
      underlying.swapEnvironmentCNAMEs(swapEnvironmentCnamEsRequest)
    }

  def terminateEnvironmentSource(
      terminateEnvironmentRequest: TerminateEnvironmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TerminateEnvironmentResponse, NotUsed] =
    Source.single(terminateEnvironmentRequest).via(terminateEnvironmentFlow(parallelism))

  def terminateEnvironmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[TerminateEnvironmentRequest, TerminateEnvironmentResponse, NotUsed] =
    Flow[TerminateEnvironmentRequest].mapAsync(parallelism) { terminateEnvironmentRequest =>
      underlying.terminateEnvironment(terminateEnvironmentRequest)
    }

  def updateApplicationSource(
      updateApplicationRequest: UpdateApplicationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateApplicationResponse, NotUsed] =
    Source.single(updateApplicationRequest).via(updateApplicationFlow(parallelism))

  def updateApplicationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateApplicationRequest, UpdateApplicationResponse, NotUsed] =
    Flow[UpdateApplicationRequest].mapAsync(parallelism) { updateApplicationRequest =>
      underlying.updateApplication(updateApplicationRequest)
    }

  def updateApplicationResourceLifecycleSource(
      updateApplicationResourceLifecycleRequest: UpdateApplicationResourceLifecycleRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateApplicationResourceLifecycleResponse, NotUsed] =
    Source.single(updateApplicationResourceLifecycleRequest).via(updateApplicationResourceLifecycleFlow(parallelism))

  def updateApplicationResourceLifecycleFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateApplicationResourceLifecycleRequest, UpdateApplicationResourceLifecycleResponse, NotUsed] =
    Flow[UpdateApplicationResourceLifecycleRequest].mapAsync(parallelism) { updateApplicationResourceLifecycleRequest =>
      underlying.updateApplicationResourceLifecycle(updateApplicationResourceLifecycleRequest)
    }

  def updateApplicationVersionSource(
      updateApplicationVersionRequest: UpdateApplicationVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateApplicationVersionResponse, NotUsed] =
    Source.single(updateApplicationVersionRequest).via(updateApplicationVersionFlow(parallelism))

  def updateApplicationVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateApplicationVersionRequest, UpdateApplicationVersionResponse, NotUsed] =
    Flow[UpdateApplicationVersionRequest].mapAsync(parallelism) { updateApplicationVersionRequest =>
      underlying.updateApplicationVersion(updateApplicationVersionRequest)
    }

  def updateConfigurationTemplateSource(
      updateConfigurationTemplateRequest: UpdateConfigurationTemplateRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateConfigurationTemplateResponse, NotUsed] =
    Source.single(updateConfigurationTemplateRequest).via(updateConfigurationTemplateFlow(parallelism))

  def updateConfigurationTemplateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateConfigurationTemplateRequest, UpdateConfigurationTemplateResponse, NotUsed] =
    Flow[UpdateConfigurationTemplateRequest].mapAsync(parallelism) { updateConfigurationTemplateRequest =>
      underlying.updateConfigurationTemplate(updateConfigurationTemplateRequest)
    }

  def updateEnvironmentSource(
      updateEnvironmentRequest: UpdateEnvironmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateEnvironmentResponse, NotUsed] =
    Source.single(updateEnvironmentRequest).via(updateEnvironmentFlow(parallelism))

  def updateEnvironmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateEnvironmentRequest, UpdateEnvironmentResponse, NotUsed] =
    Flow[UpdateEnvironmentRequest].mapAsync(parallelism) { updateEnvironmentRequest =>
      underlying.updateEnvironment(updateEnvironmentRequest)
    }

  def updateTagsForResourceSource(
      updateTagsForResourceRequest: UpdateTagsForResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateTagsForResourceResponse, NotUsed] =
    Source.single(updateTagsForResourceRequest).via(updateTagsForResourceFlow(parallelism))

  def updateTagsForResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateTagsForResourceRequest, UpdateTagsForResourceResponse, NotUsed] =
    Flow[UpdateTagsForResourceRequest].mapAsync(parallelism) { updateTagsForResourceRequest =>
      underlying.updateTagsForResource(updateTagsForResourceRequest)
    }

  def validateConfigurationSettingsSource(
      validateConfigurationSettingsRequest: ValidateConfigurationSettingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ValidateConfigurationSettingsResponse, NotUsed] =
    Source.single(validateConfigurationSettingsRequest).via(validateConfigurationSettingsFlow(parallelism))

  def validateConfigurationSettingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ValidateConfigurationSettingsRequest, ValidateConfigurationSettingsResponse, NotUsed] =
    Flow[ValidateConfigurationSettingsRequest].mapAsync(parallelism) { validateConfigurationSettingsRequest =>
      underlying.validateConfigurationSettings(validateConfigurationSettingsRequest)
    }

}
