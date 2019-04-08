// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk

import software.amazon.awssdk.services.elasticbeanstalk.model._
import software.amazon.awssdk.services.elasticbeanstalk.paginators._
import software.amazon.awssdk.services.elasticbeanstalk.{
  ElasticBeanstalkAsyncClient => JavaElasticBeanstalkAsyncClient
}

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object ElasticBeanstalkAsyncClient {

  def apply(asyncClient: JavaElasticBeanstalkAsyncClient): ElasticBeanstalkAsyncClient =
    new ElasticBeanstalkAsyncClient {
      override val underlying: JavaElasticBeanstalkAsyncClient = asyncClient
    }

}

trait ElasticBeanstalkAsyncClient extends ElasticBeanstalkClient[Future] {
  val underlying: JavaElasticBeanstalkAsyncClient

  override def abortEnvironmentUpdate(
      abortEnvironmentUpdateRequest: AbortEnvironmentUpdateRequest
  ): Future[AbortEnvironmentUpdateResponse] =
    underlying.abortEnvironmentUpdate(abortEnvironmentUpdateRequest).toScala

  override def applyEnvironmentManagedAction(
      applyEnvironmentManagedActionRequest: ApplyEnvironmentManagedActionRequest
  ): Future[ApplyEnvironmentManagedActionResponse] =
    underlying.applyEnvironmentManagedAction(applyEnvironmentManagedActionRequest).toScala

  override def checkDNSAvailability(
      checkDnsAvailabilityRequest: CheckDnsAvailabilityRequest
  ): Future[CheckDnsAvailabilityResponse] =
    underlying.checkDNSAvailability(checkDnsAvailabilityRequest).toScala

  override def composeEnvironments(
      composeEnvironmentsRequest: ComposeEnvironmentsRequest
  ): Future[ComposeEnvironmentsResponse] =
    underlying.composeEnvironments(composeEnvironmentsRequest).toScala

  override def createApplication(
      createApplicationRequest: CreateApplicationRequest
  ): Future[CreateApplicationResponse] =
    underlying.createApplication(createApplicationRequest).toScala

  override def createApplicationVersion(
      createApplicationVersionRequest: CreateApplicationVersionRequest
  ): Future[CreateApplicationVersionResponse] =
    underlying.createApplicationVersion(createApplicationVersionRequest).toScala

  override def createConfigurationTemplate(
      createConfigurationTemplateRequest: CreateConfigurationTemplateRequest
  ): Future[CreateConfigurationTemplateResponse] =
    underlying.createConfigurationTemplate(createConfigurationTemplateRequest).toScala

  override def createEnvironment(
      createEnvironmentRequest: CreateEnvironmentRequest
  ): Future[CreateEnvironmentResponse] =
    underlying.createEnvironment(createEnvironmentRequest).toScala

  override def createPlatformVersion(
      createPlatformVersionRequest: CreatePlatformVersionRequest
  ): Future[CreatePlatformVersionResponse] =
    underlying.createPlatformVersion(createPlatformVersionRequest).toScala

  override def createStorageLocation(
      createStorageLocationRequest: CreateStorageLocationRequest
  ): Future[CreateStorageLocationResponse] =
    underlying.createStorageLocation(createStorageLocationRequest).toScala

  override def createStorageLocation(): Future[CreateStorageLocationResponse] =
    underlying.createStorageLocation().toScala

  override def deleteApplication(
      deleteApplicationRequest: DeleteApplicationRequest
  ): Future[DeleteApplicationResponse] =
    underlying.deleteApplication(deleteApplicationRequest).toScala

  override def deleteApplicationVersion(
      deleteApplicationVersionRequest: DeleteApplicationVersionRequest
  ): Future[DeleteApplicationVersionResponse] =
    underlying.deleteApplicationVersion(deleteApplicationVersionRequest).toScala

  override def deleteConfigurationTemplate(
      deleteConfigurationTemplateRequest: DeleteConfigurationTemplateRequest
  ): Future[DeleteConfigurationTemplateResponse] =
    underlying.deleteConfigurationTemplate(deleteConfigurationTemplateRequest).toScala

  override def deleteEnvironmentConfiguration(
      deleteEnvironmentConfigurationRequest: DeleteEnvironmentConfigurationRequest
  ): Future[DeleteEnvironmentConfigurationResponse] =
    underlying.deleteEnvironmentConfiguration(deleteEnvironmentConfigurationRequest).toScala

  override def deletePlatformVersion(
      deletePlatformVersionRequest: DeletePlatformVersionRequest
  ): Future[DeletePlatformVersionResponse] =
    underlying.deletePlatformVersion(deletePlatformVersionRequest).toScala

  override def describeAccountAttributes(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest
  ): Future[DescribeAccountAttributesResponse] =
    underlying.describeAccountAttributes(describeAccountAttributesRequest).toScala

  override def describeAccountAttributes(): Future[DescribeAccountAttributesResponse] =
    underlying.describeAccountAttributes().toScala

  override def describeApplicationVersions(
      describeApplicationVersionsRequest: DescribeApplicationVersionsRequest
  ): Future[DescribeApplicationVersionsResponse] =
    underlying.describeApplicationVersions(describeApplicationVersionsRequest).toScala

  override def describeApplicationVersions(): Future[DescribeApplicationVersionsResponse] =
    underlying.describeApplicationVersions().toScala

  override def describeApplications(
      describeApplicationsRequest: DescribeApplicationsRequest
  ): Future[DescribeApplicationsResponse] =
    underlying.describeApplications(describeApplicationsRequest).toScala

  override def describeApplications(): Future[DescribeApplicationsResponse] =
    underlying.describeApplications().toScala

  override def describeConfigurationOptions(
      describeConfigurationOptionsRequest: DescribeConfigurationOptionsRequest
  ): Future[DescribeConfigurationOptionsResponse] =
    underlying.describeConfigurationOptions(describeConfigurationOptionsRequest).toScala

  override def describeConfigurationSettings(
      describeConfigurationSettingsRequest: DescribeConfigurationSettingsRequest
  ): Future[DescribeConfigurationSettingsResponse] =
    underlying.describeConfigurationSettings(describeConfigurationSettingsRequest).toScala

  override def describeEnvironmentHealth(
      describeEnvironmentHealthRequest: DescribeEnvironmentHealthRequest
  ): Future[DescribeEnvironmentHealthResponse] =
    underlying.describeEnvironmentHealth(describeEnvironmentHealthRequest).toScala

  override def describeEnvironmentManagedActionHistory(
      describeEnvironmentManagedActionHistoryRequest: DescribeEnvironmentManagedActionHistoryRequest
  ): Future[DescribeEnvironmentManagedActionHistoryResponse] =
    underlying.describeEnvironmentManagedActionHistory(describeEnvironmentManagedActionHistoryRequest).toScala

  override def describeEnvironmentManagedActions(
      describeEnvironmentManagedActionsRequest: DescribeEnvironmentManagedActionsRequest
  ): Future[DescribeEnvironmentManagedActionsResponse] =
    underlying.describeEnvironmentManagedActions(describeEnvironmentManagedActionsRequest).toScala

  override def describeEnvironmentResources(
      describeEnvironmentResourcesRequest: DescribeEnvironmentResourcesRequest
  ): Future[DescribeEnvironmentResourcesResponse] =
    underlying.describeEnvironmentResources(describeEnvironmentResourcesRequest).toScala

  override def describeEnvironments(
      describeEnvironmentsRequest: DescribeEnvironmentsRequest
  ): Future[DescribeEnvironmentsResponse] =
    underlying.describeEnvironments(describeEnvironmentsRequest).toScala

  override def describeEnvironments(): Future[DescribeEnvironmentsResponse] =
    underlying.describeEnvironments().toScala

  override def describeEvents(describeEventsRequest: DescribeEventsRequest): Future[DescribeEventsResponse] =
    underlying.describeEvents(describeEventsRequest).toScala

  override def describeEvents(): Future[DescribeEventsResponse] =
    underlying.describeEvents().toScala

  def describeEventsPaginator(): DescribeEventsPublisher =
    underlying.describeEventsPaginator()

  def describeEventsPaginator(describeEventsRequest: DescribeEventsRequest): DescribeEventsPublisher =
    underlying.describeEventsPaginator(describeEventsRequest)

  override def describeInstancesHealth(
      describeInstancesHealthRequest: DescribeInstancesHealthRequest
  ): Future[DescribeInstancesHealthResponse] =
    underlying.describeInstancesHealth(describeInstancesHealthRequest).toScala

  override def describePlatformVersion(
      describePlatformVersionRequest: DescribePlatformVersionRequest
  ): Future[DescribePlatformVersionResponse] =
    underlying.describePlatformVersion(describePlatformVersionRequest).toScala

  override def listAvailableSolutionStacks(
      listAvailableSolutionStacksRequest: ListAvailableSolutionStacksRequest
  ): Future[ListAvailableSolutionStacksResponse] =
    underlying.listAvailableSolutionStacks(listAvailableSolutionStacksRequest).toScala

  override def listAvailableSolutionStacks(): Future[ListAvailableSolutionStacksResponse] =
    underlying.listAvailableSolutionStacks().toScala

  override def listPlatformVersions(
      listPlatformVersionsRequest: ListPlatformVersionsRequest
  ): Future[ListPlatformVersionsResponse] =
    underlying.listPlatformVersions(listPlatformVersionsRequest).toScala

  override def listPlatformVersions(): Future[ListPlatformVersionsResponse] =
    underlying.listPlatformVersions().toScala

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Future[ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toScala

  override def rebuildEnvironment(
      rebuildEnvironmentRequest: RebuildEnvironmentRequest
  ): Future[RebuildEnvironmentResponse] =
    underlying.rebuildEnvironment(rebuildEnvironmentRequest).toScala

  override def requestEnvironmentInfo(
      requestEnvironmentInfoRequest: RequestEnvironmentInfoRequest
  ): Future[RequestEnvironmentInfoResponse] =
    underlying.requestEnvironmentInfo(requestEnvironmentInfoRequest).toScala

  override def restartAppServer(restartAppServerRequest: RestartAppServerRequest): Future[RestartAppServerResponse] =
    underlying.restartAppServer(restartAppServerRequest).toScala

  override def retrieveEnvironmentInfo(
      retrieveEnvironmentInfoRequest: RetrieveEnvironmentInfoRequest
  ): Future[RetrieveEnvironmentInfoResponse] =
    underlying.retrieveEnvironmentInfo(retrieveEnvironmentInfoRequest).toScala

  override def swapEnvironmentCNAMEs(
      swapEnvironmentCnamEsRequest: SwapEnvironmentCnamEsRequest
  ): Future[SwapEnvironmentCNAMEsResponse] =
    underlying.swapEnvironmentCNAMEs(swapEnvironmentCnamEsRequest).toScala

  override def terminateEnvironment(
      terminateEnvironmentRequest: TerminateEnvironmentRequest
  ): Future[TerminateEnvironmentResponse] =
    underlying.terminateEnvironment(terminateEnvironmentRequest).toScala

  override def updateApplication(
      updateApplicationRequest: UpdateApplicationRequest
  ): Future[UpdateApplicationResponse] =
    underlying.updateApplication(updateApplicationRequest).toScala

  override def updateApplicationResourceLifecycle(
      updateApplicationResourceLifecycleRequest: UpdateApplicationResourceLifecycleRequest
  ): Future[UpdateApplicationResourceLifecycleResponse] =
    underlying.updateApplicationResourceLifecycle(updateApplicationResourceLifecycleRequest).toScala

  override def updateApplicationVersion(
      updateApplicationVersionRequest: UpdateApplicationVersionRequest
  ): Future[UpdateApplicationVersionResponse] =
    underlying.updateApplicationVersion(updateApplicationVersionRequest).toScala

  override def updateConfigurationTemplate(
      updateConfigurationTemplateRequest: UpdateConfigurationTemplateRequest
  ): Future[UpdateConfigurationTemplateResponse] =
    underlying.updateConfigurationTemplate(updateConfigurationTemplateRequest).toScala

  override def updateEnvironment(
      updateEnvironmentRequest: UpdateEnvironmentRequest
  ): Future[UpdateEnvironmentResponse] =
    underlying.updateEnvironment(updateEnvironmentRequest).toScala

  override def updateTagsForResource(
      updateTagsForResourceRequest: UpdateTagsForResourceRequest
  ): Future[UpdateTagsForResourceResponse] =
    underlying.updateTagsForResource(updateTagsForResourceRequest).toScala

  override def validateConfigurationSettings(
      validateConfigurationSettingsRequest: ValidateConfigurationSettingsRequest
  ): Future[ValidateConfigurationSettingsResponse] =
    underlying.validateConfigurationSettings(validateConfigurationSettingsRequest).toScala

}
