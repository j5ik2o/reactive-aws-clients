// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.elasticbeanstalk.model._
import software.amazon.awssdk.services.elasticbeanstalk.paginators._
import software.amazon.awssdk.services.elasticbeanstalk.{ ElasticBeanstalkClient => JavaElasticBeanstalkSyncClient }

object ElasticBeanstalkSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaElasticBeanstalkSyncClient): ElasticBeanstalkSyncClient =
    new ElasticBeanstalkSyncClient {
      override val underlying: JavaElasticBeanstalkSyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/elasticbeanstalk/ElasticBeanstalkClient.html
  */
trait ElasticBeanstalkSyncClient extends ElasticBeanstalkClient[Either[Throwable, ?]] {
  val underlying: JavaElasticBeanstalkSyncClient

  import ElasticBeanstalkSyncClient._

  override def abortEnvironmentUpdate(
      abortEnvironmentUpdateRequest: AbortEnvironmentUpdateRequest
  ): Either[Throwable, AbortEnvironmentUpdateResponse] =
    underlying.abortEnvironmentUpdate(abortEnvironmentUpdateRequest).toEither

  override def applyEnvironmentManagedAction(
      applyEnvironmentManagedActionRequest: ApplyEnvironmentManagedActionRequest
  ): Either[Throwable, ApplyEnvironmentManagedActionResponse] =
    underlying.applyEnvironmentManagedAction(applyEnvironmentManagedActionRequest).toEither

  override def associateEnvironmentOperationsRole(
      associateEnvironmentOperationsRoleRequest: AssociateEnvironmentOperationsRoleRequest
  ): Either[Throwable, AssociateEnvironmentOperationsRoleResponse] =
    underlying.associateEnvironmentOperationsRole(associateEnvironmentOperationsRoleRequest).toEither

  override def checkDNSAvailability(
      checkDnsAvailabilityRequest: CheckDnsAvailabilityRequest
  ): Either[Throwable, CheckDnsAvailabilityResponse] =
    underlying.checkDNSAvailability(checkDnsAvailabilityRequest).toEither

  override def composeEnvironments(
      composeEnvironmentsRequest: ComposeEnvironmentsRequest
  ): Either[Throwable, ComposeEnvironmentsResponse] =
    underlying.composeEnvironments(composeEnvironmentsRequest).toEither

  override def createApplication(
      createApplicationRequest: CreateApplicationRequest
  ): Either[Throwable, CreateApplicationResponse] =
    underlying.createApplication(createApplicationRequest).toEither

  override def createApplicationVersion(
      createApplicationVersionRequest: CreateApplicationVersionRequest
  ): Either[Throwable, CreateApplicationVersionResponse] =
    underlying.createApplicationVersion(createApplicationVersionRequest).toEither

  override def createConfigurationTemplate(
      createConfigurationTemplateRequest: CreateConfigurationTemplateRequest
  ): Either[Throwable, CreateConfigurationTemplateResponse] =
    underlying.createConfigurationTemplate(createConfigurationTemplateRequest).toEither

  override def createEnvironment(
      createEnvironmentRequest: CreateEnvironmentRequest
  ): Either[Throwable, CreateEnvironmentResponse] =
    underlying.createEnvironment(createEnvironmentRequest).toEither

  override def createPlatformVersion(
      createPlatformVersionRequest: CreatePlatformVersionRequest
  ): Either[Throwable, CreatePlatformVersionResponse] =
    underlying.createPlatformVersion(createPlatformVersionRequest).toEither

  override def createStorageLocation(): Either[Throwable, CreateStorageLocationResponse] =
    underlying.createStorageLocation().toEither

  override def createStorageLocation(
      createStorageLocationRequest: CreateStorageLocationRequest
  ): Either[Throwable, CreateStorageLocationResponse] =
    underlying.createStorageLocation(createStorageLocationRequest).toEither

  override def deleteApplication(
      deleteApplicationRequest: DeleteApplicationRequest
  ): Either[Throwable, DeleteApplicationResponse] =
    underlying.deleteApplication(deleteApplicationRequest).toEither

  override def deleteApplicationVersion(
      deleteApplicationVersionRequest: DeleteApplicationVersionRequest
  ): Either[Throwable, DeleteApplicationVersionResponse] =
    underlying.deleteApplicationVersion(deleteApplicationVersionRequest).toEither

  override def deleteConfigurationTemplate(
      deleteConfigurationTemplateRequest: DeleteConfigurationTemplateRequest
  ): Either[Throwable, DeleteConfigurationTemplateResponse] =
    underlying.deleteConfigurationTemplate(deleteConfigurationTemplateRequest).toEither

  override def deleteEnvironmentConfiguration(
      deleteEnvironmentConfigurationRequest: DeleteEnvironmentConfigurationRequest
  ): Either[Throwable, DeleteEnvironmentConfigurationResponse] =
    underlying.deleteEnvironmentConfiguration(deleteEnvironmentConfigurationRequest).toEither

  override def deletePlatformVersion(
      deletePlatformVersionRequest: DeletePlatformVersionRequest
  ): Either[Throwable, DeletePlatformVersionResponse] =
    underlying.deletePlatformVersion(deletePlatformVersionRequest).toEither

  override def describeAccountAttributes(): Either[Throwable, DescribeAccountAttributesResponse] =
    underlying.describeAccountAttributes().toEither

  override def describeAccountAttributes(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest
  ): Either[Throwable, DescribeAccountAttributesResponse] =
    underlying.describeAccountAttributes(describeAccountAttributesRequest).toEither

  override def describeApplicationVersions(): Either[Throwable, DescribeApplicationVersionsResponse] =
    underlying.describeApplicationVersions().toEither

  override def describeApplicationVersions(
      describeApplicationVersionsRequest: DescribeApplicationVersionsRequest
  ): Either[Throwable, DescribeApplicationVersionsResponse] =
    underlying.describeApplicationVersions(describeApplicationVersionsRequest).toEither

  override def describeApplications(): Either[Throwable, DescribeApplicationsResponse] =
    underlying.describeApplications().toEither

  override def describeApplications(
      describeApplicationsRequest: DescribeApplicationsRequest
  ): Either[Throwable, DescribeApplicationsResponse] =
    underlying.describeApplications(describeApplicationsRequest).toEither

  override def describeConfigurationOptions(
      describeConfigurationOptionsRequest: DescribeConfigurationOptionsRequest
  ): Either[Throwable, DescribeConfigurationOptionsResponse] =
    underlying.describeConfigurationOptions(describeConfigurationOptionsRequest).toEither

  override def describeConfigurationSettings(
      describeConfigurationSettingsRequest: DescribeConfigurationSettingsRequest
  ): Either[Throwable, DescribeConfigurationSettingsResponse] =
    underlying.describeConfigurationSettings(describeConfigurationSettingsRequest).toEither

  override def describeEnvironmentHealth(
      describeEnvironmentHealthRequest: DescribeEnvironmentHealthRequest
  ): Either[Throwable, DescribeEnvironmentHealthResponse] =
    underlying.describeEnvironmentHealth(describeEnvironmentHealthRequest).toEither

  override def describeEnvironmentManagedActionHistory(
      describeEnvironmentManagedActionHistoryRequest: DescribeEnvironmentManagedActionHistoryRequest
  ): Either[Throwable, DescribeEnvironmentManagedActionHistoryResponse] =
    underlying.describeEnvironmentManagedActionHistory(describeEnvironmentManagedActionHistoryRequest).toEither

  override def describeEnvironmentManagedActions(
      describeEnvironmentManagedActionsRequest: DescribeEnvironmentManagedActionsRequest
  ): Either[Throwable, DescribeEnvironmentManagedActionsResponse] =
    underlying.describeEnvironmentManagedActions(describeEnvironmentManagedActionsRequest).toEither

  override def describeEnvironmentResources(
      describeEnvironmentResourcesRequest: DescribeEnvironmentResourcesRequest
  ): Either[Throwable, DescribeEnvironmentResourcesResponse] =
    underlying.describeEnvironmentResources(describeEnvironmentResourcesRequest).toEither

  override def describeEnvironments(): Either[Throwable, DescribeEnvironmentsResponse] =
    underlying.describeEnvironments().toEither

  override def describeEnvironments(
      describeEnvironmentsRequest: DescribeEnvironmentsRequest
  ): Either[Throwable, DescribeEnvironmentsResponse] =
    underlying.describeEnvironments(describeEnvironmentsRequest).toEither

  override def describeEvents(): Either[Throwable, DescribeEventsResponse] =
    underlying.describeEvents().toEither

  override def describeEvents(describeEventsRequest: DescribeEventsRequest): Either[Throwable, DescribeEventsResponse] =
    underlying.describeEvents(describeEventsRequest).toEither

  def describeEventsPaginator(): DescribeEventsIterable =
    underlying.describeEventsPaginator()

  def describeEventsPaginator(describeEventsRequest: DescribeEventsRequest): DescribeEventsIterable =
    underlying.describeEventsPaginator(describeEventsRequest)

  override def describeInstancesHealth(
      describeInstancesHealthRequest: DescribeInstancesHealthRequest
  ): Either[Throwable, DescribeInstancesHealthResponse] =
    underlying.describeInstancesHealth(describeInstancesHealthRequest).toEither

  override def describePlatformVersion(
      describePlatformVersionRequest: DescribePlatformVersionRequest
  ): Either[Throwable, DescribePlatformVersionResponse] =
    underlying.describePlatformVersion(describePlatformVersionRequest).toEither

  override def disassociateEnvironmentOperationsRole(
      disassociateEnvironmentOperationsRoleRequest: DisassociateEnvironmentOperationsRoleRequest
  ): Either[Throwable, DisassociateEnvironmentOperationsRoleResponse] =
    underlying.disassociateEnvironmentOperationsRole(disassociateEnvironmentOperationsRoleRequest).toEither

  override def listAvailableSolutionStacks(): Either[Throwable, ListAvailableSolutionStacksResponse] =
    underlying.listAvailableSolutionStacks().toEither

  override def listAvailableSolutionStacks(
      listAvailableSolutionStacksRequest: ListAvailableSolutionStacksRequest
  ): Either[Throwable, ListAvailableSolutionStacksResponse] =
    underlying.listAvailableSolutionStacks(listAvailableSolutionStacksRequest).toEither

  override def listPlatformBranches(
      listPlatformBranchesRequest: ListPlatformBranchesRequest
  ): Either[Throwable, ListPlatformBranchesResponse] =
    underlying.listPlatformBranches(listPlatformBranchesRequest).toEither

  def listPlatformBranchesPaginator(
      listPlatformBranchesRequest: ListPlatformBranchesRequest
  ): ListPlatformBranchesIterable =
    underlying.listPlatformBranchesPaginator(listPlatformBranchesRequest)

  override def listPlatformVersions(): Either[Throwable, ListPlatformVersionsResponse] =
    underlying.listPlatformVersions().toEither

  override def listPlatformVersions(
      listPlatformVersionsRequest: ListPlatformVersionsRequest
  ): Either[Throwable, ListPlatformVersionsResponse] =
    underlying.listPlatformVersions(listPlatformVersionsRequest).toEither

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Either[Throwable, ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toEither

  override def rebuildEnvironment(
      rebuildEnvironmentRequest: RebuildEnvironmentRequest
  ): Either[Throwable, RebuildEnvironmentResponse] =
    underlying.rebuildEnvironment(rebuildEnvironmentRequest).toEither

  override def requestEnvironmentInfo(
      requestEnvironmentInfoRequest: RequestEnvironmentInfoRequest
  ): Either[Throwable, RequestEnvironmentInfoResponse] =
    underlying.requestEnvironmentInfo(requestEnvironmentInfoRequest).toEither

  override def restartAppServer(
      restartAppServerRequest: RestartAppServerRequest
  ): Either[Throwable, RestartAppServerResponse] =
    underlying.restartAppServer(restartAppServerRequest).toEither

  override def retrieveEnvironmentInfo(
      retrieveEnvironmentInfoRequest: RetrieveEnvironmentInfoRequest
  ): Either[Throwable, RetrieveEnvironmentInfoResponse] =
    underlying.retrieveEnvironmentInfo(retrieveEnvironmentInfoRequest).toEither

  override def swapEnvironmentCNAMEs(
      swapEnvironmentCnamEsRequest: SwapEnvironmentCnamEsRequest
  ): Either[Throwable, SwapEnvironmentCnamEsResponse] =
    underlying.swapEnvironmentCNAMEs(swapEnvironmentCnamEsRequest).toEither

  override def terminateEnvironment(
      terminateEnvironmentRequest: TerminateEnvironmentRequest
  ): Either[Throwable, TerminateEnvironmentResponse] =
    underlying.terminateEnvironment(terminateEnvironmentRequest).toEither

  override def updateApplication(
      updateApplicationRequest: UpdateApplicationRequest
  ): Either[Throwable, UpdateApplicationResponse] =
    underlying.updateApplication(updateApplicationRequest).toEither

  override def updateApplicationResourceLifecycle(
      updateApplicationResourceLifecycleRequest: UpdateApplicationResourceLifecycleRequest
  ): Either[Throwable, UpdateApplicationResourceLifecycleResponse] =
    underlying.updateApplicationResourceLifecycle(updateApplicationResourceLifecycleRequest).toEither

  override def updateApplicationVersion(
      updateApplicationVersionRequest: UpdateApplicationVersionRequest
  ): Either[Throwable, UpdateApplicationVersionResponse] =
    underlying.updateApplicationVersion(updateApplicationVersionRequest).toEither

  override def updateConfigurationTemplate(
      updateConfigurationTemplateRequest: UpdateConfigurationTemplateRequest
  ): Either[Throwable, UpdateConfigurationTemplateResponse] =
    underlying.updateConfigurationTemplate(updateConfigurationTemplateRequest).toEither

  override def updateEnvironment(
      updateEnvironmentRequest: UpdateEnvironmentRequest
  ): Either[Throwable, UpdateEnvironmentResponse] =
    underlying.updateEnvironment(updateEnvironmentRequest).toEither

  override def updateTagsForResource(
      updateTagsForResourceRequest: UpdateTagsForResourceRequest
  ): Either[Throwable, UpdateTagsForResourceResponse] =
    underlying.updateTagsForResource(updateTagsForResourceRequest).toEither

  override def validateConfigurationSettings(
      validateConfigurationSettingsRequest: ValidateConfigurationSettingsRequest
  ): Either[Throwable, ValidateConfigurationSettingsResponse] =
    underlying.validateConfigurationSettings(validateConfigurationSettingsRequest).toEither

}
