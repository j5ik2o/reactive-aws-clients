// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.monix

import software.amazon.awssdk.services.elasticbeanstalk.model._
import com.github.j5ik2o.reactive.aws.elasticbeanstalk.{ ElasticBeanstalkAsyncClient, ElasticBeanstalkClient }
import monix.eval.Task
import monix.reactive.Observable

object ElasticBeanstalkMonixClient {

  def apply(asyncClient: ElasticBeanstalkAsyncClient): ElasticBeanstalkMonixClient =
    new ElasticBeanstalkMonixClient {
      override val underlying: ElasticBeanstalkAsyncClient = asyncClient
    }

}

trait ElasticBeanstalkMonixClient extends ElasticBeanstalkClient[Task] {

  val underlying: ElasticBeanstalkAsyncClient

  override def abortEnvironmentUpdate(
      abortEnvironmentUpdateRequest: AbortEnvironmentUpdateRequest
  ): Task[AbortEnvironmentUpdateResponse] =
    Task.deferFuture {
      underlying.abortEnvironmentUpdate(abortEnvironmentUpdateRequest)
    }

  override def applyEnvironmentManagedAction(
      applyEnvironmentManagedActionRequest: ApplyEnvironmentManagedActionRequest
  ): Task[ApplyEnvironmentManagedActionResponse] =
    Task.deferFuture {
      underlying.applyEnvironmentManagedAction(applyEnvironmentManagedActionRequest)
    }

  override def associateEnvironmentOperationsRole(
      associateEnvironmentOperationsRoleRequest: AssociateEnvironmentOperationsRoleRequest
  ): Task[AssociateEnvironmentOperationsRoleResponse] =
    Task.deferFuture {
      underlying.associateEnvironmentOperationsRole(associateEnvironmentOperationsRoleRequest)
    }

  override def checkDNSAvailability(
      checkDnsAvailabilityRequest: CheckDnsAvailabilityRequest
  ): Task[CheckDnsAvailabilityResponse] =
    Task.deferFuture {
      underlying.checkDNSAvailability(checkDnsAvailabilityRequest)
    }

  override def composeEnvironments(
      composeEnvironmentsRequest: ComposeEnvironmentsRequest
  ): Task[ComposeEnvironmentsResponse] =
    Task.deferFuture {
      underlying.composeEnvironments(composeEnvironmentsRequest)
    }

  override def createApplication(createApplicationRequest: CreateApplicationRequest): Task[CreateApplicationResponse] =
    Task.deferFuture {
      underlying.createApplication(createApplicationRequest)
    }

  override def createApplicationVersion(
      createApplicationVersionRequest: CreateApplicationVersionRequest
  ): Task[CreateApplicationVersionResponse] =
    Task.deferFuture {
      underlying.createApplicationVersion(createApplicationVersionRequest)
    }

  override def createConfigurationTemplate(
      createConfigurationTemplateRequest: CreateConfigurationTemplateRequest
  ): Task[CreateConfigurationTemplateResponse] =
    Task.deferFuture {
      underlying.createConfigurationTemplate(createConfigurationTemplateRequest)
    }

  override def createEnvironment(createEnvironmentRequest: CreateEnvironmentRequest): Task[CreateEnvironmentResponse] =
    Task.deferFuture {
      underlying.createEnvironment(createEnvironmentRequest)
    }

  override def createPlatformVersion(
      createPlatformVersionRequest: CreatePlatformVersionRequest
  ): Task[CreatePlatformVersionResponse] =
    Task.deferFuture {
      underlying.createPlatformVersion(createPlatformVersionRequest)
    }

  override def createStorageLocation(
      createStorageLocationRequest: CreateStorageLocationRequest
  ): Task[CreateStorageLocationResponse] =
    Task.deferFuture {
      underlying.createStorageLocation(createStorageLocationRequest)
    }

  override def createStorageLocation(): Task[CreateStorageLocationResponse] =
    Task.deferFuture {
      underlying.createStorageLocation()
    }

  override def deleteApplication(deleteApplicationRequest: DeleteApplicationRequest): Task[DeleteApplicationResponse] =
    Task.deferFuture {
      underlying.deleteApplication(deleteApplicationRequest)
    }

  override def deleteApplicationVersion(
      deleteApplicationVersionRequest: DeleteApplicationVersionRequest
  ): Task[DeleteApplicationVersionResponse] =
    Task.deferFuture {
      underlying.deleteApplicationVersion(deleteApplicationVersionRequest)
    }

  override def deleteConfigurationTemplate(
      deleteConfigurationTemplateRequest: DeleteConfigurationTemplateRequest
  ): Task[DeleteConfigurationTemplateResponse] =
    Task.deferFuture {
      underlying.deleteConfigurationTemplate(deleteConfigurationTemplateRequest)
    }

  override def deleteEnvironmentConfiguration(
      deleteEnvironmentConfigurationRequest: DeleteEnvironmentConfigurationRequest
  ): Task[DeleteEnvironmentConfigurationResponse] =
    Task.deferFuture {
      underlying.deleteEnvironmentConfiguration(deleteEnvironmentConfigurationRequest)
    }

  override def deletePlatformVersion(
      deletePlatformVersionRequest: DeletePlatformVersionRequest
  ): Task[DeletePlatformVersionResponse] =
    Task.deferFuture {
      underlying.deletePlatformVersion(deletePlatformVersionRequest)
    }

  override def describeAccountAttributes(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest
  ): Task[DescribeAccountAttributesResponse] =
    Task.deferFuture {
      underlying.describeAccountAttributes(describeAccountAttributesRequest)
    }

  override def describeAccountAttributes(): Task[DescribeAccountAttributesResponse] =
    Task.deferFuture {
      underlying.describeAccountAttributes()
    }

  override def describeApplicationVersions(
      describeApplicationVersionsRequest: DescribeApplicationVersionsRequest
  ): Task[DescribeApplicationVersionsResponse] =
    Task.deferFuture {
      underlying.describeApplicationVersions(describeApplicationVersionsRequest)
    }

  override def describeApplicationVersions(): Task[DescribeApplicationVersionsResponse] =
    Task.deferFuture {
      underlying.describeApplicationVersions()
    }

  override def describeApplications(
      describeApplicationsRequest: DescribeApplicationsRequest
  ): Task[DescribeApplicationsResponse] =
    Task.deferFuture {
      underlying.describeApplications(describeApplicationsRequest)
    }

  override def describeApplications(): Task[DescribeApplicationsResponse] =
    Task.deferFuture {
      underlying.describeApplications()
    }

  override def describeConfigurationOptions(
      describeConfigurationOptionsRequest: DescribeConfigurationOptionsRequest
  ): Task[DescribeConfigurationOptionsResponse] =
    Task.deferFuture {
      underlying.describeConfigurationOptions(describeConfigurationOptionsRequest)
    }

  override def describeConfigurationSettings(
      describeConfigurationSettingsRequest: DescribeConfigurationSettingsRequest
  ): Task[DescribeConfigurationSettingsResponse] =
    Task.deferFuture {
      underlying.describeConfigurationSettings(describeConfigurationSettingsRequest)
    }

  override def describeEnvironmentHealth(
      describeEnvironmentHealthRequest: DescribeEnvironmentHealthRequest
  ): Task[DescribeEnvironmentHealthResponse] =
    Task.deferFuture {
      underlying.describeEnvironmentHealth(describeEnvironmentHealthRequest)
    }

  override def describeEnvironmentManagedActionHistory(
      describeEnvironmentManagedActionHistoryRequest: DescribeEnvironmentManagedActionHistoryRequest
  ): Task[DescribeEnvironmentManagedActionHistoryResponse] =
    Task.deferFuture {
      underlying.describeEnvironmentManagedActionHistory(describeEnvironmentManagedActionHistoryRequest)
    }

  override def describeEnvironmentManagedActions(
      describeEnvironmentManagedActionsRequest: DescribeEnvironmentManagedActionsRequest
  ): Task[DescribeEnvironmentManagedActionsResponse] =
    Task.deferFuture {
      underlying.describeEnvironmentManagedActions(describeEnvironmentManagedActionsRequest)
    }

  override def describeEnvironmentResources(
      describeEnvironmentResourcesRequest: DescribeEnvironmentResourcesRequest
  ): Task[DescribeEnvironmentResourcesResponse] =
    Task.deferFuture {
      underlying.describeEnvironmentResources(describeEnvironmentResourcesRequest)
    }

  override def describeEnvironments(
      describeEnvironmentsRequest: DescribeEnvironmentsRequest
  ): Task[DescribeEnvironmentsResponse] =
    Task.deferFuture {
      underlying.describeEnvironments(describeEnvironmentsRequest)
    }

  override def describeEnvironments(): Task[DescribeEnvironmentsResponse] =
    Task.deferFuture {
      underlying.describeEnvironments()
    }

  override def describeEvents(describeEventsRequest: DescribeEventsRequest): Task[DescribeEventsResponse] =
    Task.deferFuture {
      underlying.describeEvents(describeEventsRequest)
    }

  override def describeEvents(): Task[DescribeEventsResponse] =
    Task.deferFuture {
      underlying.describeEvents()
    }

  def describeEventsPaginator(): Observable[DescribeEventsResponse] =
    Observable.fromReactivePublisher(underlying.describeEventsPaginator())

  def describeEventsPaginator(describeEventsRequest: DescribeEventsRequest): Observable[DescribeEventsResponse] =
    Observable.fromReactivePublisher(underlying.describeEventsPaginator(describeEventsRequest))

  override def describeInstancesHealth(
      describeInstancesHealthRequest: DescribeInstancesHealthRequest
  ): Task[DescribeInstancesHealthResponse] =
    Task.deferFuture {
      underlying.describeInstancesHealth(describeInstancesHealthRequest)
    }

  override def describePlatformVersion(
      describePlatformVersionRequest: DescribePlatformVersionRequest
  ): Task[DescribePlatformVersionResponse] =
    Task.deferFuture {
      underlying.describePlatformVersion(describePlatformVersionRequest)
    }

  override def disassociateEnvironmentOperationsRole(
      disassociateEnvironmentOperationsRoleRequest: DisassociateEnvironmentOperationsRoleRequest
  ): Task[DisassociateEnvironmentOperationsRoleResponse] =
    Task.deferFuture {
      underlying.disassociateEnvironmentOperationsRole(disassociateEnvironmentOperationsRoleRequest)
    }

  override def listAvailableSolutionStacks(
      listAvailableSolutionStacksRequest: ListAvailableSolutionStacksRequest
  ): Task[ListAvailableSolutionStacksResponse] =
    Task.deferFuture {
      underlying.listAvailableSolutionStacks(listAvailableSolutionStacksRequest)
    }

  override def listAvailableSolutionStacks(): Task[ListAvailableSolutionStacksResponse] =
    Task.deferFuture {
      underlying.listAvailableSolutionStacks()
    }

  override def listPlatformBranches(
      listPlatformBranchesRequest: ListPlatformBranchesRequest
  ): Task[ListPlatformBranchesResponse] =
    Task.deferFuture {
      underlying.listPlatformBranches(listPlatformBranchesRequest)
    }

  def listPlatformBranchesPaginator(
      listPlatformBranchesRequest: ListPlatformBranchesRequest
  ): Observable[ListPlatformBranchesResponse] =
    Observable.fromReactivePublisher(underlying.listPlatformBranchesPaginator(listPlatformBranchesRequest))

  override def listPlatformVersions(
      listPlatformVersionsRequest: ListPlatformVersionsRequest
  ): Task[ListPlatformVersionsResponse] =
    Task.deferFuture {
      underlying.listPlatformVersions(listPlatformVersionsRequest)
    }

  override def listPlatformVersions(): Task[ListPlatformVersionsResponse] =
    Task.deferFuture {
      underlying.listPlatformVersions()
    }

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Task[ListTagsForResourceResponse] =
    Task.deferFuture {
      underlying.listTagsForResource(listTagsForResourceRequest)
    }

  override def rebuildEnvironment(
      rebuildEnvironmentRequest: RebuildEnvironmentRequest
  ): Task[RebuildEnvironmentResponse] =
    Task.deferFuture {
      underlying.rebuildEnvironment(rebuildEnvironmentRequest)
    }

  override def requestEnvironmentInfo(
      requestEnvironmentInfoRequest: RequestEnvironmentInfoRequest
  ): Task[RequestEnvironmentInfoResponse] =
    Task.deferFuture {
      underlying.requestEnvironmentInfo(requestEnvironmentInfoRequest)
    }

  override def restartAppServer(restartAppServerRequest: RestartAppServerRequest): Task[RestartAppServerResponse] =
    Task.deferFuture {
      underlying.restartAppServer(restartAppServerRequest)
    }

  override def retrieveEnvironmentInfo(
      retrieveEnvironmentInfoRequest: RetrieveEnvironmentInfoRequest
  ): Task[RetrieveEnvironmentInfoResponse] =
    Task.deferFuture {
      underlying.retrieveEnvironmentInfo(retrieveEnvironmentInfoRequest)
    }

  override def swapEnvironmentCNAMEs(
      swapEnvironmentCnamEsRequest: SwapEnvironmentCnamEsRequest
  ): Task[SwapEnvironmentCnamEsResponse] =
    Task.deferFuture {
      underlying.swapEnvironmentCNAMEs(swapEnvironmentCnamEsRequest)
    }

  override def terminateEnvironment(
      terminateEnvironmentRequest: TerminateEnvironmentRequest
  ): Task[TerminateEnvironmentResponse] =
    Task.deferFuture {
      underlying.terminateEnvironment(terminateEnvironmentRequest)
    }

  override def updateApplication(updateApplicationRequest: UpdateApplicationRequest): Task[UpdateApplicationResponse] =
    Task.deferFuture {
      underlying.updateApplication(updateApplicationRequest)
    }

  override def updateApplicationResourceLifecycle(
      updateApplicationResourceLifecycleRequest: UpdateApplicationResourceLifecycleRequest
  ): Task[UpdateApplicationResourceLifecycleResponse] =
    Task.deferFuture {
      underlying.updateApplicationResourceLifecycle(updateApplicationResourceLifecycleRequest)
    }

  override def updateApplicationVersion(
      updateApplicationVersionRequest: UpdateApplicationVersionRequest
  ): Task[UpdateApplicationVersionResponse] =
    Task.deferFuture {
      underlying.updateApplicationVersion(updateApplicationVersionRequest)
    }

  override def updateConfigurationTemplate(
      updateConfigurationTemplateRequest: UpdateConfigurationTemplateRequest
  ): Task[UpdateConfigurationTemplateResponse] =
    Task.deferFuture {
      underlying.updateConfigurationTemplate(updateConfigurationTemplateRequest)
    }

  override def updateEnvironment(updateEnvironmentRequest: UpdateEnvironmentRequest): Task[UpdateEnvironmentResponse] =
    Task.deferFuture {
      underlying.updateEnvironment(updateEnvironmentRequest)
    }

  override def updateTagsForResource(
      updateTagsForResourceRequest: UpdateTagsForResourceRequest
  ): Task[UpdateTagsForResourceResponse] =
    Task.deferFuture {
      underlying.updateTagsForResource(updateTagsForResourceRequest)
    }

  override def validateConfigurationSettings(
      validateConfigurationSettingsRequest: ValidateConfigurationSettingsRequest
  ): Task[ValidateConfigurationSettingsResponse] =
    Task.deferFuture {
      underlying.validateConfigurationSettings(validateConfigurationSettingsRequest)
    }

}
