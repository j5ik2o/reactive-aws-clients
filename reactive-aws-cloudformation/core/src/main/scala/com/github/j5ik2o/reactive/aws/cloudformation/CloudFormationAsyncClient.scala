// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation

import software.amazon.awssdk.services.cloudformation.model._
import software.amazon.awssdk.services.cloudformation.paginators._
import software.amazon.awssdk.services.cloudformation.{ CloudFormationAsyncClient => JavaCloudFormationAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object CloudFormationAsyncClient {

  def apply(javaClient: JavaCloudFormationAsyncClient): CloudFormationAsyncClient =
    new CloudFormationAsyncClient {
      override val underlying: JavaCloudFormationAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/cloudformation/CloudFormationAsyncClient.html
  */
trait CloudFormationAsyncClient extends CloudFormationClient[Future] {
  val underlying: JavaCloudFormationAsyncClient

  override def cancelUpdateStack(
      cancelUpdateStackRequest: CancelUpdateStackRequest
  ): Future[CancelUpdateStackResponse] =
    underlying.cancelUpdateStack(cancelUpdateStackRequest).toScala

  override def continueUpdateRollback(
      continueUpdateRollbackRequest: ContinueUpdateRollbackRequest
  ): Future[ContinueUpdateRollbackResponse] =
    underlying.continueUpdateRollback(continueUpdateRollbackRequest).toScala

  override def createChangeSet(createChangeSetRequest: CreateChangeSetRequest): Future[CreateChangeSetResponse] =
    underlying.createChangeSet(createChangeSetRequest).toScala

  override def createStack(createStackRequest: CreateStackRequest): Future[CreateStackResponse] =
    underlying.createStack(createStackRequest).toScala

  override def createStackInstances(
      createStackInstancesRequest: CreateStackInstancesRequest
  ): Future[CreateStackInstancesResponse] =
    underlying.createStackInstances(createStackInstancesRequest).toScala

  override def createStackSet(createStackSetRequest: CreateStackSetRequest): Future[CreateStackSetResponse] =
    underlying.createStackSet(createStackSetRequest).toScala

  override def deleteChangeSet(deleteChangeSetRequest: DeleteChangeSetRequest): Future[DeleteChangeSetResponse] =
    underlying.deleteChangeSet(deleteChangeSetRequest).toScala

  override def deleteStack(deleteStackRequest: DeleteStackRequest): Future[DeleteStackResponse] =
    underlying.deleteStack(deleteStackRequest).toScala

  override def deleteStackInstances(
      deleteStackInstancesRequest: DeleteStackInstancesRequest
  ): Future[DeleteStackInstancesResponse] =
    underlying.deleteStackInstances(deleteStackInstancesRequest).toScala

  override def deleteStackSet(deleteStackSetRequest: DeleteStackSetRequest): Future[DeleteStackSetResponse] =
    underlying.deleteStackSet(deleteStackSetRequest).toScala

  override def deregisterType(deregisterTypeRequest: DeregisterTypeRequest): Future[DeregisterTypeResponse] =
    underlying.deregisterType(deregisterTypeRequest).toScala

  override def describeAccountLimits(
      describeAccountLimitsRequest: DescribeAccountLimitsRequest
  ): Future[DescribeAccountLimitsResponse] =
    underlying.describeAccountLimits(describeAccountLimitsRequest).toScala

  override def describeAccountLimits(): Future[DescribeAccountLimitsResponse] =
    underlying.describeAccountLimits().toScala

  def describeAccountLimitsPaginator(): DescribeAccountLimitsPublisher =
    underlying.describeAccountLimitsPaginator()

  def describeAccountLimitsPaginator(
      describeAccountLimitsRequest: DescribeAccountLimitsRequest
  ): DescribeAccountLimitsPublisher =
    underlying.describeAccountLimitsPaginator(describeAccountLimitsRequest)

  override def describeChangeSet(
      describeChangeSetRequest: DescribeChangeSetRequest
  ): Future[DescribeChangeSetResponse] =
    underlying.describeChangeSet(describeChangeSetRequest).toScala

  override def describeStackDriftDetectionStatus(
      describeStackDriftDetectionStatusRequest: DescribeStackDriftDetectionStatusRequest
  ): Future[DescribeStackDriftDetectionStatusResponse] =
    underlying.describeStackDriftDetectionStatus(describeStackDriftDetectionStatusRequest).toScala

  override def describeStackEvents(
      describeStackEventsRequest: DescribeStackEventsRequest
  ): Future[DescribeStackEventsResponse] =
    underlying.describeStackEvents(describeStackEventsRequest).toScala

  def describeStackEventsPaginator(
      describeStackEventsRequest: DescribeStackEventsRequest
  ): DescribeStackEventsPublisher =
    underlying.describeStackEventsPaginator(describeStackEventsRequest)

  override def describeStackInstance(
      describeStackInstanceRequest: DescribeStackInstanceRequest
  ): Future[DescribeStackInstanceResponse] =
    underlying.describeStackInstance(describeStackInstanceRequest).toScala

  override def describeStackResource(
      describeStackResourceRequest: DescribeStackResourceRequest
  ): Future[DescribeStackResourceResponse] =
    underlying.describeStackResource(describeStackResourceRequest).toScala

  override def describeStackResourceDrifts(
      describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest
  ): Future[DescribeStackResourceDriftsResponse] =
    underlying.describeStackResourceDrifts(describeStackResourceDriftsRequest).toScala

  def describeStackResourceDriftsPaginator(
      describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest
  ): DescribeStackResourceDriftsPublisher =
    underlying.describeStackResourceDriftsPaginator(describeStackResourceDriftsRequest)

  override def describeStackResources(
      describeStackResourcesRequest: DescribeStackResourcesRequest
  ): Future[DescribeStackResourcesResponse] =
    underlying.describeStackResources(describeStackResourcesRequest).toScala

  override def describeStackSet(describeStackSetRequest: DescribeStackSetRequest): Future[DescribeStackSetResponse] =
    underlying.describeStackSet(describeStackSetRequest).toScala

  override def describeStackSetOperation(
      describeStackSetOperationRequest: DescribeStackSetOperationRequest
  ): Future[DescribeStackSetOperationResponse] =
    underlying.describeStackSetOperation(describeStackSetOperationRequest).toScala

  override def describeStacks(describeStacksRequest: DescribeStacksRequest): Future[DescribeStacksResponse] =
    underlying.describeStacks(describeStacksRequest).toScala

  override def describeStacks(): Future[DescribeStacksResponse] =
    underlying.describeStacks().toScala

  def describeStacksPaginator(): DescribeStacksPublisher =
    underlying.describeStacksPaginator()

  def describeStacksPaginator(describeStacksRequest: DescribeStacksRequest): DescribeStacksPublisher =
    underlying.describeStacksPaginator(describeStacksRequest)

  override def describeType(describeTypeRequest: DescribeTypeRequest): Future[DescribeTypeResponse] =
    underlying.describeType(describeTypeRequest).toScala

  override def describeTypeRegistration(
      describeTypeRegistrationRequest: DescribeTypeRegistrationRequest
  ): Future[DescribeTypeRegistrationResponse] =
    underlying.describeTypeRegistration(describeTypeRegistrationRequest).toScala

  override def detectStackDrift(detectStackDriftRequest: DetectStackDriftRequest): Future[DetectStackDriftResponse] =
    underlying.detectStackDrift(detectStackDriftRequest).toScala

  override def detectStackResourceDrift(
      detectStackResourceDriftRequest: DetectStackResourceDriftRequest
  ): Future[DetectStackResourceDriftResponse] =
    underlying.detectStackResourceDrift(detectStackResourceDriftRequest).toScala

  override def detectStackSetDrift(
      detectStackSetDriftRequest: DetectStackSetDriftRequest
  ): Future[DetectStackSetDriftResponse] =
    underlying.detectStackSetDrift(detectStackSetDriftRequest).toScala

  override def estimateTemplateCost(
      estimateTemplateCostRequest: EstimateTemplateCostRequest
  ): Future[EstimateTemplateCostResponse] =
    underlying.estimateTemplateCost(estimateTemplateCostRequest).toScala

  override def executeChangeSet(executeChangeSetRequest: ExecuteChangeSetRequest): Future[ExecuteChangeSetResponse] =
    underlying.executeChangeSet(executeChangeSetRequest).toScala

  override def getStackPolicy(getStackPolicyRequest: GetStackPolicyRequest): Future[GetStackPolicyResponse] =
    underlying.getStackPolicy(getStackPolicyRequest).toScala

  override def getTemplate(getTemplateRequest: GetTemplateRequest): Future[GetTemplateResponse] =
    underlying.getTemplate(getTemplateRequest).toScala

  override def getTemplateSummary(
      getTemplateSummaryRequest: GetTemplateSummaryRequest
  ): Future[GetTemplateSummaryResponse] =
    underlying.getTemplateSummary(getTemplateSummaryRequest).toScala

  override def listChangeSets(listChangeSetsRequest: ListChangeSetsRequest): Future[ListChangeSetsResponse] =
    underlying.listChangeSets(listChangeSetsRequest).toScala

  def listChangeSetsPaginator(listChangeSetsRequest: ListChangeSetsRequest): ListChangeSetsPublisher =
    underlying.listChangeSetsPaginator(listChangeSetsRequest)

  override def listExports(listExportsRequest: ListExportsRequest): Future[ListExportsResponse] =
    underlying.listExports(listExportsRequest).toScala

  override def listExports(): Future[ListExportsResponse] =
    underlying.listExports().toScala

  def listExportsPaginator(): ListExportsPublisher =
    underlying.listExportsPaginator()

  def listExportsPaginator(listExportsRequest: ListExportsRequest): ListExportsPublisher =
    underlying.listExportsPaginator(listExportsRequest)

  override def listImports(listImportsRequest: ListImportsRequest): Future[ListImportsResponse] =
    underlying.listImports(listImportsRequest).toScala

  def listImportsPaginator(listImportsRequest: ListImportsRequest): ListImportsPublisher =
    underlying.listImportsPaginator(listImportsRequest)

  override def listStackInstances(
      listStackInstancesRequest: ListStackInstancesRequest
  ): Future[ListStackInstancesResponse] =
    underlying.listStackInstances(listStackInstancesRequest).toScala

  def listStackInstancesPaginator(listStackInstancesRequest: ListStackInstancesRequest): ListStackInstancesPublisher =
    underlying.listStackInstancesPaginator(listStackInstancesRequest)

  override def listStackResources(
      listStackResourcesRequest: ListStackResourcesRequest
  ): Future[ListStackResourcesResponse] =
    underlying.listStackResources(listStackResourcesRequest).toScala

  def listStackResourcesPaginator(listStackResourcesRequest: ListStackResourcesRequest): ListStackResourcesPublisher =
    underlying.listStackResourcesPaginator(listStackResourcesRequest)

  override def listStackSetOperationResults(
      listStackSetOperationResultsRequest: ListStackSetOperationResultsRequest
  ): Future[ListStackSetOperationResultsResponse] =
    underlying.listStackSetOperationResults(listStackSetOperationResultsRequest).toScala

  def listStackSetOperationResultsPaginator(
      listStackSetOperationResultsRequest: ListStackSetOperationResultsRequest
  ): ListStackSetOperationResultsPublisher =
    underlying.listStackSetOperationResultsPaginator(listStackSetOperationResultsRequest)

  override def listStackSetOperations(
      listStackSetOperationsRequest: ListStackSetOperationsRequest
  ): Future[ListStackSetOperationsResponse] =
    underlying.listStackSetOperations(listStackSetOperationsRequest).toScala

  def listStackSetOperationsPaginator(
      listStackSetOperationsRequest: ListStackSetOperationsRequest
  ): ListStackSetOperationsPublisher =
    underlying.listStackSetOperationsPaginator(listStackSetOperationsRequest)

  override def listStackSets(listStackSetsRequest: ListStackSetsRequest): Future[ListStackSetsResponse] =
    underlying.listStackSets(listStackSetsRequest).toScala

  override def listStackSets(): Future[ListStackSetsResponse] =
    underlying.listStackSets().toScala

  def listStackSetsPaginator(): ListStackSetsPublisher =
    underlying.listStackSetsPaginator()

  def listStackSetsPaginator(listStackSetsRequest: ListStackSetsRequest): ListStackSetsPublisher =
    underlying.listStackSetsPaginator(listStackSetsRequest)

  override def listStacks(listStacksRequest: ListStacksRequest): Future[ListStacksResponse] =
    underlying.listStacks(listStacksRequest).toScala

  override def listStacks(): Future[ListStacksResponse] =
    underlying.listStacks().toScala

  def listStacksPaginator(): ListStacksPublisher =
    underlying.listStacksPaginator()

  def listStacksPaginator(listStacksRequest: ListStacksRequest): ListStacksPublisher =
    underlying.listStacksPaginator(listStacksRequest)

  override def listTypeRegistrations(
      listTypeRegistrationsRequest: ListTypeRegistrationsRequest
  ): Future[ListTypeRegistrationsResponse] =
    underlying.listTypeRegistrations(listTypeRegistrationsRequest).toScala

  def listTypeRegistrationsPaginator(
      listTypeRegistrationsRequest: ListTypeRegistrationsRequest
  ): ListTypeRegistrationsPublisher =
    underlying.listTypeRegistrationsPaginator(listTypeRegistrationsRequest)

  override def listTypeVersions(listTypeVersionsRequest: ListTypeVersionsRequest): Future[ListTypeVersionsResponse] =
    underlying.listTypeVersions(listTypeVersionsRequest).toScala

  def listTypeVersionsPaginator(listTypeVersionsRequest: ListTypeVersionsRequest): ListTypeVersionsPublisher =
    underlying.listTypeVersionsPaginator(listTypeVersionsRequest)

  override def listTypes(listTypesRequest: ListTypesRequest): Future[ListTypesResponse] =
    underlying.listTypes(listTypesRequest).toScala

  def listTypesPaginator(listTypesRequest: ListTypesRequest): ListTypesPublisher =
    underlying.listTypesPaginator(listTypesRequest)

  override def recordHandlerProgress(
      recordHandlerProgressRequest: RecordHandlerProgressRequest
  ): Future[RecordHandlerProgressResponse] =
    underlying.recordHandlerProgress(recordHandlerProgressRequest).toScala

  override def registerType(registerTypeRequest: RegisterTypeRequest): Future[RegisterTypeResponse] =
    underlying.registerType(registerTypeRequest).toScala

  override def setStackPolicy(setStackPolicyRequest: SetStackPolicyRequest): Future[SetStackPolicyResponse] =
    underlying.setStackPolicy(setStackPolicyRequest).toScala

  override def setTypeDefaultVersion(
      setTypeDefaultVersionRequest: SetTypeDefaultVersionRequest
  ): Future[SetTypeDefaultVersionResponse] =
    underlying.setTypeDefaultVersion(setTypeDefaultVersionRequest).toScala

  override def signalResource(signalResourceRequest: SignalResourceRequest): Future[SignalResourceResponse] =
    underlying.signalResource(signalResourceRequest).toScala

  override def stopStackSetOperation(
      stopStackSetOperationRequest: StopStackSetOperationRequest
  ): Future[StopStackSetOperationResponse] =
    underlying.stopStackSetOperation(stopStackSetOperationRequest).toScala

  override def updateStack(updateStackRequest: UpdateStackRequest): Future[UpdateStackResponse] =
    underlying.updateStack(updateStackRequest).toScala

  override def updateStackInstances(
      updateStackInstancesRequest: UpdateStackInstancesRequest
  ): Future[UpdateStackInstancesResponse] =
    underlying.updateStackInstances(updateStackInstancesRequest).toScala

  override def updateStackSet(updateStackSetRequest: UpdateStackSetRequest): Future[UpdateStackSetResponse] =
    underlying.updateStackSet(updateStackSetRequest).toScala

  override def updateTerminationProtection(
      updateTerminationProtectionRequest: UpdateTerminationProtectionRequest
  ): Future[UpdateTerminationProtectionResponse] =
    underlying.updateTerminationProtection(updateTerminationProtectionRequest).toScala

  override def validateTemplate(validateTemplateRequest: ValidateTemplateRequest): Future[ValidateTemplateResponse] =
    underlying.validateTemplate(validateTemplateRequest).toScala

}
