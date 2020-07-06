// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk

import software.amazon.awssdk.services.elasticbeanstalk.model._

trait ElasticBeanstalkClient[M[_]] {

  def abortEnvironmentUpdate(
      abortEnvironmentUpdateRequest: AbortEnvironmentUpdateRequest
  ): M[AbortEnvironmentUpdateResponse]

  def applyEnvironmentManagedAction(
      applyEnvironmentManagedActionRequest: ApplyEnvironmentManagedActionRequest
  ): M[ApplyEnvironmentManagedActionResponse]

  def associateEnvironmentOperationsRole(
      associateEnvironmentOperationsRoleRequest: AssociateEnvironmentOperationsRoleRequest
  ): M[AssociateEnvironmentOperationsRoleResponse]

  def checkDNSAvailability(checkDnsAvailabilityRequest: CheckDnsAvailabilityRequest): M[CheckDnsAvailabilityResponse]

  def composeEnvironments(composeEnvironmentsRequest: ComposeEnvironmentsRequest): M[ComposeEnvironmentsResponse]

  def createApplication(createApplicationRequest: CreateApplicationRequest): M[CreateApplicationResponse]

  def createApplicationVersion(
      createApplicationVersionRequest: CreateApplicationVersionRequest
  ): M[CreateApplicationVersionResponse]

  def createConfigurationTemplate(
      createConfigurationTemplateRequest: CreateConfigurationTemplateRequest
  ): M[CreateConfigurationTemplateResponse]

  def createEnvironment(createEnvironmentRequest: CreateEnvironmentRequest): M[CreateEnvironmentResponse]

  def createPlatformVersion(
      createPlatformVersionRequest: CreatePlatformVersionRequest
  ): M[CreatePlatformVersionResponse]

  def createStorageLocation(
      createStorageLocationRequest: CreateStorageLocationRequest
  ): M[CreateStorageLocationResponse]

  def createStorageLocation(): M[CreateStorageLocationResponse]

  def deleteApplication(deleteApplicationRequest: DeleteApplicationRequest): M[DeleteApplicationResponse]

  def deleteApplicationVersion(
      deleteApplicationVersionRequest: DeleteApplicationVersionRequest
  ): M[DeleteApplicationVersionResponse]

  def deleteConfigurationTemplate(
      deleteConfigurationTemplateRequest: DeleteConfigurationTemplateRequest
  ): M[DeleteConfigurationTemplateResponse]

  def deleteEnvironmentConfiguration(
      deleteEnvironmentConfigurationRequest: DeleteEnvironmentConfigurationRequest
  ): M[DeleteEnvironmentConfigurationResponse]

  def deletePlatformVersion(
      deletePlatformVersionRequest: DeletePlatformVersionRequest
  ): M[DeletePlatformVersionResponse]

  def describeAccountAttributes(
      describeAccountAttributesRequest: DescribeAccountAttributesRequest
  ): M[DescribeAccountAttributesResponse]

  def describeAccountAttributes(): M[DescribeAccountAttributesResponse]

  def describeApplicationVersions(
      describeApplicationVersionsRequest: DescribeApplicationVersionsRequest
  ): M[DescribeApplicationVersionsResponse]

  def describeApplicationVersions(): M[DescribeApplicationVersionsResponse]

  def describeApplications(describeApplicationsRequest: DescribeApplicationsRequest): M[DescribeApplicationsResponse]

  def describeApplications(): M[DescribeApplicationsResponse]

  def describeConfigurationOptions(
      describeConfigurationOptionsRequest: DescribeConfigurationOptionsRequest
  ): M[DescribeConfigurationOptionsResponse]

  def describeConfigurationSettings(
      describeConfigurationSettingsRequest: DescribeConfigurationSettingsRequest
  ): M[DescribeConfigurationSettingsResponse]

  def describeEnvironmentHealth(
      describeEnvironmentHealthRequest: DescribeEnvironmentHealthRequest
  ): M[DescribeEnvironmentHealthResponse]

  def describeEnvironmentManagedActionHistory(
      describeEnvironmentManagedActionHistoryRequest: DescribeEnvironmentManagedActionHistoryRequest
  ): M[DescribeEnvironmentManagedActionHistoryResponse]

  def describeEnvironmentManagedActions(
      describeEnvironmentManagedActionsRequest: DescribeEnvironmentManagedActionsRequest
  ): M[DescribeEnvironmentManagedActionsResponse]

  def describeEnvironmentResources(
      describeEnvironmentResourcesRequest: DescribeEnvironmentResourcesRequest
  ): M[DescribeEnvironmentResourcesResponse]

  def describeEnvironments(describeEnvironmentsRequest: DescribeEnvironmentsRequest): M[DescribeEnvironmentsResponse]

  def describeEnvironments(): M[DescribeEnvironmentsResponse]

  def describeEvents(describeEventsRequest: DescribeEventsRequest): M[DescribeEventsResponse]

  def describeEvents(): M[DescribeEventsResponse]

  def describeInstancesHealth(
      describeInstancesHealthRequest: DescribeInstancesHealthRequest
  ): M[DescribeInstancesHealthResponse]

  def describePlatformVersion(
      describePlatformVersionRequest: DescribePlatformVersionRequest
  ): M[DescribePlatformVersionResponse]

  def disassociateEnvironmentOperationsRole(
      disassociateEnvironmentOperationsRoleRequest: DisassociateEnvironmentOperationsRoleRequest
  ): M[DisassociateEnvironmentOperationsRoleResponse]

  def listAvailableSolutionStacks(
      listAvailableSolutionStacksRequest: ListAvailableSolutionStacksRequest
  ): M[ListAvailableSolutionStacksResponse]

  def listAvailableSolutionStacks(): M[ListAvailableSolutionStacksResponse]

  def listPlatformBranches(listPlatformBranchesRequest: ListPlatformBranchesRequest): M[ListPlatformBranchesResponse]

  def listPlatformVersions(listPlatformVersionsRequest: ListPlatformVersionsRequest): M[ListPlatformVersionsResponse]

  def listPlatformVersions(): M[ListPlatformVersionsResponse]

  def listTagsForResource(listTagsForResourceRequest: ListTagsForResourceRequest): M[ListTagsForResourceResponse]

  def rebuildEnvironment(rebuildEnvironmentRequest: RebuildEnvironmentRequest): M[RebuildEnvironmentResponse]

  def requestEnvironmentInfo(
      requestEnvironmentInfoRequest: RequestEnvironmentInfoRequest
  ): M[RequestEnvironmentInfoResponse]

  def restartAppServer(restartAppServerRequest: RestartAppServerRequest): M[RestartAppServerResponse]

  def retrieveEnvironmentInfo(
      retrieveEnvironmentInfoRequest: RetrieveEnvironmentInfoRequest
  ): M[RetrieveEnvironmentInfoResponse]

  def swapEnvironmentCNAMEs(
      swapEnvironmentCnamEsRequest: SwapEnvironmentCnamEsRequest
  ): M[SwapEnvironmentCnamEsResponse]

  def terminateEnvironment(terminateEnvironmentRequest: TerminateEnvironmentRequest): M[TerminateEnvironmentResponse]

  def updateApplication(updateApplicationRequest: UpdateApplicationRequest): M[UpdateApplicationResponse]

  def updateApplicationResourceLifecycle(
      updateApplicationResourceLifecycleRequest: UpdateApplicationResourceLifecycleRequest
  ): M[UpdateApplicationResourceLifecycleResponse]

  def updateApplicationVersion(
      updateApplicationVersionRequest: UpdateApplicationVersionRequest
  ): M[UpdateApplicationVersionResponse]

  def updateConfigurationTemplate(
      updateConfigurationTemplateRequest: UpdateConfigurationTemplateRequest
  ): M[UpdateConfigurationTemplateResponse]

  def updateEnvironment(updateEnvironmentRequest: UpdateEnvironmentRequest): M[UpdateEnvironmentResponse]

  def updateTagsForResource(
      updateTagsForResourceRequest: UpdateTagsForResourceRequest
  ): M[UpdateTagsForResourceResponse]

  def validateConfigurationSettings(
      validateConfigurationSettingsRequest: ValidateConfigurationSettingsRequest
  ): M[ValidateConfigurationSettingsResponse]

}
