// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.elasticbeanstalk.{ ElasticBeanstalkAsyncClient, ElasticBeanstalkClient }
import software.amazon.awssdk.services.elasticbeanstalk.model._
import software.amazon.awssdk.services.elasticbeanstalk.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object ElasticBeanstalkCatsIOClient {

  def apply(asyncClient: ElasticBeanstalkAsyncClient)(implicit ec: ExecutionContext): ElasticBeanstalkCatsIOClient =
    new ElasticBeanstalkCatsIOClient {
      override val executionContext: ExecutionContext      = ec
      override val underlying: ElasticBeanstalkAsyncClient = asyncClient
    }

}

trait ElasticBeanstalkCatsIOClient extends ElasticBeanstalkClient[IO] {

  val underlying: ElasticBeanstalkAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def abortEnvironmentUpdate(
      abortEnvironmentUpdateRequest: AbortEnvironmentUpdateRequest
  ): IO[AbortEnvironmentUpdateResponse] =
    IO.fromFuture {
      IO(underlying.abortEnvironmentUpdate(abortEnvironmentUpdateRequest))
    }

  override def applyEnvironmentManagedAction(
      applyEnvironmentManagedActionRequest: ApplyEnvironmentManagedActionRequest
  ): IO[ApplyEnvironmentManagedActionResponse] =
    IO.fromFuture {
      IO(underlying.applyEnvironmentManagedAction(applyEnvironmentManagedActionRequest))
    }

  override def associateEnvironmentOperationsRole(
      associateEnvironmentOperationsRoleRequest: AssociateEnvironmentOperationsRoleRequest
  ): IO[AssociateEnvironmentOperationsRoleResponse] =
    IO.fromFuture {
      IO(underlying.associateEnvironmentOperationsRole(associateEnvironmentOperationsRoleRequest))
    }

  override def checkDNSAvailability(
      checkDnsAvailabilityRequest: CheckDnsAvailabilityRequest
  ): IO[CheckDnsAvailabilityResponse] =
    IO.fromFuture {
      IO(underlying.checkDNSAvailability(checkDnsAvailabilityRequest))
    }

  override def composeEnvironments(
      composeEnvironmentsRequest: ComposeEnvironmentsRequest
  ): IO[ComposeEnvironmentsResponse] =
    IO.fromFuture {
      IO(underlying.composeEnvironments(composeEnvironmentsRequest))
    }

  override def createApplication(createApplicationRequest: CreateApplicationRequest): IO[CreateApplicationResponse] =
    IO.fromFuture {
      IO(underlying.createApplication(createApplicationRequest))
    }

  override def createApplicationVersion(
      createApplicationVersionRequest: CreateApplicationVersionRequest
  ): IO[CreateApplicationVersionResponse] =
    IO.fromFuture {
      IO(underlying.createApplicationVersion(createApplicationVersionRequest))
    }

  override def createConfigurationTemplate(
      createConfigurationTemplateRequest: CreateConfigurationTemplateRequest
  ): IO[CreateConfigurationTemplateResponse] =
    IO.fromFuture {
      IO(underlying.createConfigurationTemplate(createConfigurationTemplateRequest))
    }

  override def createEnvironment(createEnvironmentRequest: CreateEnvironmentRequest): IO[CreateEnvironmentResponse] =
    IO.fromFuture {
      IO(underlying.createEnvironment(createEnvironmentRequest))
    }

  override def createPlatformVersion(
      createPlatformVersionRequest: CreatePlatformVersionRequest
  ): IO[CreatePlatformVersionResponse] =
    IO.fromFuture {
      IO(underlying.createPlatformVersion(createPlatformVersionRequest))
    }

  override def createStorageLocation(
      createStorageLocationRequest: CreateStorageLocationRequest
  ): IO[CreateStorageLocationResponse] =
    IO.fromFuture {
      IO(underlying.createStorageLocation(createStorageLocationRequest))
    }

  override def createStorageLocation(): IO[CreateStorageLocationResponse] =
    IO.fromFuture {
      IO(underlying.createStorageLocation())
    }

  override def deleteApplication(deleteApplicationRequest: DeleteApplicationRequest): IO[DeleteApplicationResponse] =
    IO.fromFuture {
      IO(underlying.deleteApplication(deleteApplicationRequest))
    }

  override def deleteApplicationVersion(
      deleteApplicationVersionRequest: DeleteApplicationVersionRequest
  ): IO[DeleteApplicationVersionResponse] =
    IO.fromFuture {
      IO(underlying.deleteApplicationVersion(deleteApplicationVersionRequest))
    }

  override def deleteConfigurationTemplate(
      deleteConfigurationTemplateRequest: DeleteConfigurationTemplateRequest
  ): IO[DeleteConfigurationTemplateResponse] =
    IO.fromFuture {
      IO(underlying.deleteConfigurationTemplate(deleteConfigurationTemplateRequest))
    }

  override def deleteEnvironmentConfiguration(
      deleteEnvironmentConfigurationRequest: DeleteEnvironmentConfigurationRequest
  ): IO[DeleteEnvironmentConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.deleteEnvironmentConfiguration(deleteEnvironmentConfigurationRequest))
    }

  override def deletePlatformVersion(
      deletePlatformVersionRequest: DeletePlatformVersionRequest
  ): IO[DeletePlatformVersionResponse] =
    IO.fromFuture {
      IO(underlying.deletePlatformVersion(deletePlatformVersionRequest))
    }

  override def describeAccountAttributes(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest
  ): IO[DescribeAccountAttributesResponse] =
    IO.fromFuture {
      IO(underlying.describeAccountAttributes(describeAccountAttributesRequest))
    }

  override def describeAccountAttributes(): IO[DescribeAccountAttributesResponse] =
    IO.fromFuture {
      IO(underlying.describeAccountAttributes())
    }

  override def describeApplicationVersions(
      describeApplicationVersionsRequest: DescribeApplicationVersionsRequest
  ): IO[DescribeApplicationVersionsResponse] =
    IO.fromFuture {
      IO(underlying.describeApplicationVersions(describeApplicationVersionsRequest))
    }

  override def describeApplicationVersions(): IO[DescribeApplicationVersionsResponse] =
    IO.fromFuture {
      IO(underlying.describeApplicationVersions())
    }

  override def describeApplications(
      describeApplicationsRequest: DescribeApplicationsRequest
  ): IO[DescribeApplicationsResponse] =
    IO.fromFuture {
      IO(underlying.describeApplications(describeApplicationsRequest))
    }

  override def describeApplications(): IO[DescribeApplicationsResponse] =
    IO.fromFuture {
      IO(underlying.describeApplications())
    }

  override def describeConfigurationOptions(
      describeConfigurationOptionsRequest: DescribeConfigurationOptionsRequest
  ): IO[DescribeConfigurationOptionsResponse] =
    IO.fromFuture {
      IO(underlying.describeConfigurationOptions(describeConfigurationOptionsRequest))
    }

  override def describeConfigurationSettings(
      describeConfigurationSettingsRequest: DescribeConfigurationSettingsRequest
  ): IO[DescribeConfigurationSettingsResponse] =
    IO.fromFuture {
      IO(underlying.describeConfigurationSettings(describeConfigurationSettingsRequest))
    }

  override def describeEnvironmentHealth(
      describeEnvironmentHealthRequest: DescribeEnvironmentHealthRequest
  ): IO[DescribeEnvironmentHealthResponse] =
    IO.fromFuture {
      IO(underlying.describeEnvironmentHealth(describeEnvironmentHealthRequest))
    }

  override def describeEnvironmentManagedActionHistory(
      describeEnvironmentManagedActionHistoryRequest: DescribeEnvironmentManagedActionHistoryRequest
  ): IO[DescribeEnvironmentManagedActionHistoryResponse] =
    IO.fromFuture {
      IO(underlying.describeEnvironmentManagedActionHistory(describeEnvironmentManagedActionHistoryRequest))
    }

  override def describeEnvironmentManagedActions(
      describeEnvironmentManagedActionsRequest: DescribeEnvironmentManagedActionsRequest
  ): IO[DescribeEnvironmentManagedActionsResponse] =
    IO.fromFuture {
      IO(underlying.describeEnvironmentManagedActions(describeEnvironmentManagedActionsRequest))
    }

  override def describeEnvironmentResources(
      describeEnvironmentResourcesRequest: DescribeEnvironmentResourcesRequest
  ): IO[DescribeEnvironmentResourcesResponse] =
    IO.fromFuture {
      IO(underlying.describeEnvironmentResources(describeEnvironmentResourcesRequest))
    }

  override def describeEnvironments(
      describeEnvironmentsRequest: DescribeEnvironmentsRequest
  ): IO[DescribeEnvironmentsResponse] =
    IO.fromFuture {
      IO(underlying.describeEnvironments(describeEnvironmentsRequest))
    }

  override def describeEnvironments(): IO[DescribeEnvironmentsResponse] =
    IO.fromFuture {
      IO(underlying.describeEnvironments())
    }

  override def describeEvents(describeEventsRequest: DescribeEventsRequest): IO[DescribeEventsResponse] =
    IO.fromFuture {
      IO(underlying.describeEvents(describeEventsRequest))
    }

  override def describeEvents(): IO[DescribeEventsResponse] =
    IO.fromFuture {
      IO(underlying.describeEvents())
    }

  def describeEventsPaginator(): DescribeEventsPublisher =
    underlying.describeEventsPaginator()

  def describeEventsPaginator(describeEventsRequest: DescribeEventsRequest): DescribeEventsPublisher =
    underlying.describeEventsPaginator(describeEventsRequest)

  override def describeInstancesHealth(
      describeInstancesHealthRequest: DescribeInstancesHealthRequest
  ): IO[DescribeInstancesHealthResponse] =
    IO.fromFuture {
      IO(underlying.describeInstancesHealth(describeInstancesHealthRequest))
    }

  override def describePlatformVersion(
      describePlatformVersionRequest: DescribePlatformVersionRequest
  ): IO[DescribePlatformVersionResponse] =
    IO.fromFuture {
      IO(underlying.describePlatformVersion(describePlatformVersionRequest))
    }

  override def disassociateEnvironmentOperationsRole(
      disassociateEnvironmentOperationsRoleRequest: DisassociateEnvironmentOperationsRoleRequest
  ): IO[DisassociateEnvironmentOperationsRoleResponse] =
    IO.fromFuture {
      IO(underlying.disassociateEnvironmentOperationsRole(disassociateEnvironmentOperationsRoleRequest))
    }

  override def listAvailableSolutionStacks(
      listAvailableSolutionStacksRequest: ListAvailableSolutionStacksRequest
  ): IO[ListAvailableSolutionStacksResponse] =
    IO.fromFuture {
      IO(underlying.listAvailableSolutionStacks(listAvailableSolutionStacksRequest))
    }

  override def listAvailableSolutionStacks(): IO[ListAvailableSolutionStacksResponse] =
    IO.fromFuture {
      IO(underlying.listAvailableSolutionStacks())
    }

  override def listPlatformBranches(
      listPlatformBranchesRequest: ListPlatformBranchesRequest
  ): IO[ListPlatformBranchesResponse] =
    IO.fromFuture {
      IO(underlying.listPlatformBranches(listPlatformBranchesRequest))
    }

  def listPlatformBranchesPaginator(
      listPlatformBranchesRequest: ListPlatformBranchesRequest
  ): ListPlatformBranchesPublisher =
    underlying.listPlatformBranchesPaginator(listPlatformBranchesRequest)

  override def listPlatformVersions(
      listPlatformVersionsRequest: ListPlatformVersionsRequest
  ): IO[ListPlatformVersionsResponse] =
    IO.fromFuture {
      IO(underlying.listPlatformVersions(listPlatformVersionsRequest))
    }

  override def listPlatformVersions(): IO[ListPlatformVersionsResponse] =
    IO.fromFuture {
      IO(underlying.listPlatformVersions())
    }

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): IO[ListTagsForResourceResponse] =
    IO.fromFuture {
      IO(underlying.listTagsForResource(listTagsForResourceRequest))
    }

  override def rebuildEnvironment(
      rebuildEnvironmentRequest: RebuildEnvironmentRequest
  ): IO[RebuildEnvironmentResponse] =
    IO.fromFuture {
      IO(underlying.rebuildEnvironment(rebuildEnvironmentRequest))
    }

  override def requestEnvironmentInfo(
      requestEnvironmentInfoRequest: RequestEnvironmentInfoRequest
  ): IO[RequestEnvironmentInfoResponse] =
    IO.fromFuture {
      IO(underlying.requestEnvironmentInfo(requestEnvironmentInfoRequest))
    }

  override def restartAppServer(restartAppServerRequest: RestartAppServerRequest): IO[RestartAppServerResponse] =
    IO.fromFuture {
      IO(underlying.restartAppServer(restartAppServerRequest))
    }

  override def retrieveEnvironmentInfo(
      retrieveEnvironmentInfoRequest: RetrieveEnvironmentInfoRequest
  ): IO[RetrieveEnvironmentInfoResponse] =
    IO.fromFuture {
      IO(underlying.retrieveEnvironmentInfo(retrieveEnvironmentInfoRequest))
    }

  override def swapEnvironmentCNAMEs(
      swapEnvironmentCnamEsRequest: SwapEnvironmentCnamEsRequest
  ): IO[SwapEnvironmentCnamEsResponse] =
    IO.fromFuture {
      IO(underlying.swapEnvironmentCNAMEs(swapEnvironmentCnamEsRequest))
    }

  override def terminateEnvironment(
      terminateEnvironmentRequest: TerminateEnvironmentRequest
  ): IO[TerminateEnvironmentResponse] =
    IO.fromFuture {
      IO(underlying.terminateEnvironment(terminateEnvironmentRequest))
    }

  override def updateApplication(updateApplicationRequest: UpdateApplicationRequest): IO[UpdateApplicationResponse] =
    IO.fromFuture {
      IO(underlying.updateApplication(updateApplicationRequest))
    }

  override def updateApplicationResourceLifecycle(
      updateApplicationResourceLifecycleRequest: UpdateApplicationResourceLifecycleRequest
  ): IO[UpdateApplicationResourceLifecycleResponse] =
    IO.fromFuture {
      IO(underlying.updateApplicationResourceLifecycle(updateApplicationResourceLifecycleRequest))
    }

  override def updateApplicationVersion(
      updateApplicationVersionRequest: UpdateApplicationVersionRequest
  ): IO[UpdateApplicationVersionResponse] =
    IO.fromFuture {
      IO(underlying.updateApplicationVersion(updateApplicationVersionRequest))
    }

  override def updateConfigurationTemplate(
      updateConfigurationTemplateRequest: UpdateConfigurationTemplateRequest
  ): IO[UpdateConfigurationTemplateResponse] =
    IO.fromFuture {
      IO(underlying.updateConfigurationTemplate(updateConfigurationTemplateRequest))
    }

  override def updateEnvironment(updateEnvironmentRequest: UpdateEnvironmentRequest): IO[UpdateEnvironmentResponse] =
    IO.fromFuture {
      IO(underlying.updateEnvironment(updateEnvironmentRequest))
    }

  override def updateTagsForResource(
      updateTagsForResourceRequest: UpdateTagsForResourceRequest
  ): IO[UpdateTagsForResourceResponse] =
    IO.fromFuture {
      IO(underlying.updateTagsForResource(updateTagsForResourceRequest))
    }

  override def validateConfigurationSettings(
      validateConfigurationSettingsRequest: ValidateConfigurationSettingsRequest
  ): IO[ValidateConfigurationSettingsResponse] =
    IO.fromFuture {
      IO(underlying.validateConfigurationSettings(validateConfigurationSettingsRequest))
    }

}
