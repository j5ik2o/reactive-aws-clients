// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.cloudformation.{ CloudFormationAsyncClient, CloudFormationClient }
import software.amazon.awssdk.services.cloudformation.model._
import software.amazon.awssdk.services.cloudformation.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object CloudFormationCatsIOClient {

  def apply(asyncClient: CloudFormationAsyncClient)(implicit ec: ExecutionContext): CloudFormationCatsIOClient =
    new CloudFormationCatsIOClient {
      override val executionContext: ExecutionContext    = ec
      override val underlying: CloudFormationAsyncClient = asyncClient
    }

}

trait CloudFormationCatsIOClient extends CloudFormationClient[IO] {

  val underlying: CloudFormationAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def cancelUpdateStack(cancelUpdateStackRequest: CancelUpdateStackRequest): IO[CancelUpdateStackResponse] =
    IO.fromFuture {
      IO(underlying.cancelUpdateStack(cancelUpdateStackRequest))
    }

  override def continueUpdateRollback(
      continueUpdateRollbackRequest: ContinueUpdateRollbackRequest
  ): IO[ContinueUpdateRollbackResponse] =
    IO.fromFuture {
      IO(underlying.continueUpdateRollback(continueUpdateRollbackRequest))
    }

  override def createChangeSet(createChangeSetRequest: CreateChangeSetRequest): IO[CreateChangeSetResponse] =
    IO.fromFuture {
      IO(underlying.createChangeSet(createChangeSetRequest))
    }

  override def createStack(createStackRequest: CreateStackRequest): IO[CreateStackResponse] =
    IO.fromFuture {
      IO(underlying.createStack(createStackRequest))
    }

  override def createStackInstances(
      createStackInstancesRequest: CreateStackInstancesRequest
  ): IO[CreateStackInstancesResponse] =
    IO.fromFuture {
      IO(underlying.createStackInstances(createStackInstancesRequest))
    }

  override def createStackSet(createStackSetRequest: CreateStackSetRequest): IO[CreateStackSetResponse] =
    IO.fromFuture {
      IO(underlying.createStackSet(createStackSetRequest))
    }

  override def deleteChangeSet(deleteChangeSetRequest: DeleteChangeSetRequest): IO[DeleteChangeSetResponse] =
    IO.fromFuture {
      IO(underlying.deleteChangeSet(deleteChangeSetRequest))
    }

  override def deleteStack(deleteStackRequest: DeleteStackRequest): IO[DeleteStackResponse] =
    IO.fromFuture {
      IO(underlying.deleteStack(deleteStackRequest))
    }

  override def deleteStackInstances(
      deleteStackInstancesRequest: DeleteStackInstancesRequest
  ): IO[DeleteStackInstancesResponse] =
    IO.fromFuture {
      IO(underlying.deleteStackInstances(deleteStackInstancesRequest))
    }

  override def deleteStackSet(deleteStackSetRequest: DeleteStackSetRequest): IO[DeleteStackSetResponse] =
    IO.fromFuture {
      IO(underlying.deleteStackSet(deleteStackSetRequest))
    }

  override def deregisterType(deregisterTypeRequest: DeregisterTypeRequest): IO[DeregisterTypeResponse] =
    IO.fromFuture {
      IO(underlying.deregisterType(deregisterTypeRequest))
    }

  override def describeAccountLimits(
      describeAccountLimitsRequest: DescribeAccountLimitsRequest
  ): IO[DescribeAccountLimitsResponse] =
    IO.fromFuture {
      IO(underlying.describeAccountLimits(describeAccountLimitsRequest))
    }

  override def describeAccountLimits(): IO[DescribeAccountLimitsResponse] =
    IO.fromFuture {
      IO(underlying.describeAccountLimits())
    }

  override def describeChangeSet(describeChangeSetRequest: DescribeChangeSetRequest): IO[DescribeChangeSetResponse] =
    IO.fromFuture {
      IO(underlying.describeChangeSet(describeChangeSetRequest))
    }

  override def describeStackDriftDetectionStatus(
      describeStackDriftDetectionStatusRequest: DescribeStackDriftDetectionStatusRequest
  ): IO[DescribeStackDriftDetectionStatusResponse] =
    IO.fromFuture {
      IO(underlying.describeStackDriftDetectionStatus(describeStackDriftDetectionStatusRequest))
    }

  override def describeStackEvents(
      describeStackEventsRequest: DescribeStackEventsRequest
  ): IO[DescribeStackEventsResponse] =
    IO.fromFuture {
      IO(underlying.describeStackEvents(describeStackEventsRequest))
    }

  def describeStackEventsPaginator(
      describeStackEventsRequest: DescribeStackEventsRequest
  ): DescribeStackEventsPublisher =
    underlying.describeStackEventsPaginator(describeStackEventsRequest)

  override def describeStackInstance(
      describeStackInstanceRequest: DescribeStackInstanceRequest
  ): IO[DescribeStackInstanceResponse] =
    IO.fromFuture {
      IO(underlying.describeStackInstance(describeStackInstanceRequest))
    }

  override def describeStackResource(
      describeStackResourceRequest: DescribeStackResourceRequest
  ): IO[DescribeStackResourceResponse] =
    IO.fromFuture {
      IO(underlying.describeStackResource(describeStackResourceRequest))
    }

  override def describeStackResourceDrifts(
      describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest
  ): IO[DescribeStackResourceDriftsResponse] =
    IO.fromFuture {
      IO(underlying.describeStackResourceDrifts(describeStackResourceDriftsRequest))
    }

  def describeStackResourceDriftsPaginator(
      describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest
  ): DescribeStackResourceDriftsPublisher =
    underlying.describeStackResourceDriftsPaginator(describeStackResourceDriftsRequest)

  override def describeStackResources(
      describeStackResourcesRequest: DescribeStackResourcesRequest
  ): IO[DescribeStackResourcesResponse] =
    IO.fromFuture {
      IO(underlying.describeStackResources(describeStackResourcesRequest))
    }

  override def describeStackSet(describeStackSetRequest: DescribeStackSetRequest): IO[DescribeStackSetResponse] =
    IO.fromFuture {
      IO(underlying.describeStackSet(describeStackSetRequest))
    }

  override def describeStackSetOperation(
      describeStackSetOperationRequest: DescribeStackSetOperationRequest
  ): IO[DescribeStackSetOperationResponse] =
    IO.fromFuture {
      IO(underlying.describeStackSetOperation(describeStackSetOperationRequest))
    }

  override def describeStacks(describeStacksRequest: DescribeStacksRequest): IO[DescribeStacksResponse] =
    IO.fromFuture {
      IO(underlying.describeStacks(describeStacksRequest))
    }

  override def describeStacks(): IO[DescribeStacksResponse] =
    IO.fromFuture {
      IO(underlying.describeStacks())
    }

  def describeStacksPaginator(): DescribeStacksPublisher =
    underlying.describeStacksPaginator()

  def describeStacksPaginator(describeStacksRequest: DescribeStacksRequest): DescribeStacksPublisher =
    underlying.describeStacksPaginator(describeStacksRequest)

  override def describeType(describeTypeRequest: DescribeTypeRequest): IO[DescribeTypeResponse] =
    IO.fromFuture {
      IO(underlying.describeType(describeTypeRequest))
    }

  override def describeTypeRegistration(
      describeTypeRegistrationRequest: DescribeTypeRegistrationRequest
  ): IO[DescribeTypeRegistrationResponse] =
    IO.fromFuture {
      IO(underlying.describeTypeRegistration(describeTypeRegistrationRequest))
    }

  override def detectStackDrift(detectStackDriftRequest: DetectStackDriftRequest): IO[DetectStackDriftResponse] =
    IO.fromFuture {
      IO(underlying.detectStackDrift(detectStackDriftRequest))
    }

  override def detectStackResourceDrift(
      detectStackResourceDriftRequest: DetectStackResourceDriftRequest
  ): IO[DetectStackResourceDriftResponse] =
    IO.fromFuture {
      IO(underlying.detectStackResourceDrift(detectStackResourceDriftRequest))
    }

  override def detectStackSetDrift(
      detectStackSetDriftRequest: DetectStackSetDriftRequest
  ): IO[DetectStackSetDriftResponse] =
    IO.fromFuture {
      IO(underlying.detectStackSetDrift(detectStackSetDriftRequest))
    }

  override def estimateTemplateCost(
      estimateTemplateCostRequest: EstimateTemplateCostRequest
  ): IO[EstimateTemplateCostResponse] =
    IO.fromFuture {
      IO(underlying.estimateTemplateCost(estimateTemplateCostRequest))
    }

  override def executeChangeSet(executeChangeSetRequest: ExecuteChangeSetRequest): IO[ExecuteChangeSetResponse] =
    IO.fromFuture {
      IO(underlying.executeChangeSet(executeChangeSetRequest))
    }

  override def getStackPolicy(getStackPolicyRequest: GetStackPolicyRequest): IO[GetStackPolicyResponse] =
    IO.fromFuture {
      IO(underlying.getStackPolicy(getStackPolicyRequest))
    }

  override def getTemplate(getTemplateRequest: GetTemplateRequest): IO[GetTemplateResponse] =
    IO.fromFuture {
      IO(underlying.getTemplate(getTemplateRequest))
    }

  override def getTemplateSummary(
      getTemplateSummaryRequest: GetTemplateSummaryRequest
  ): IO[GetTemplateSummaryResponse] =
    IO.fromFuture {
      IO(underlying.getTemplateSummary(getTemplateSummaryRequest))
    }

  override def listChangeSets(listChangeSetsRequest: ListChangeSetsRequest): IO[ListChangeSetsResponse] =
    IO.fromFuture {
      IO(underlying.listChangeSets(listChangeSetsRequest))
    }

  override def listExports(listExportsRequest: ListExportsRequest): IO[ListExportsResponse] =
    IO.fromFuture {
      IO(underlying.listExports(listExportsRequest))
    }

  override def listExports(): IO[ListExportsResponse] =
    IO.fromFuture {
      IO(underlying.listExports())
    }

  def listExportsPaginator(): ListExportsPublisher =
    underlying.listExportsPaginator()

  def listExportsPaginator(listExportsRequest: ListExportsRequest): ListExportsPublisher =
    underlying.listExportsPaginator(listExportsRequest)

  override def listImports(listImportsRequest: ListImportsRequest): IO[ListImportsResponse] =
    IO.fromFuture {
      IO(underlying.listImports(listImportsRequest))
    }

  def listImportsPaginator(listImportsRequest: ListImportsRequest): ListImportsPublisher =
    underlying.listImportsPaginator(listImportsRequest)

  override def listStackInstances(
      listStackInstancesRequest: ListStackInstancesRequest
  ): IO[ListStackInstancesResponse] =
    IO.fromFuture {
      IO(underlying.listStackInstances(listStackInstancesRequest))
    }

  override def listStackResources(
      listStackResourcesRequest: ListStackResourcesRequest
  ): IO[ListStackResourcesResponse] =
    IO.fromFuture {
      IO(underlying.listStackResources(listStackResourcesRequest))
    }

  def listStackResourcesPaginator(listStackResourcesRequest: ListStackResourcesRequest): ListStackResourcesPublisher =
    underlying.listStackResourcesPaginator(listStackResourcesRequest)

  override def listStackSetOperationResults(
      listStackSetOperationResultsRequest: ListStackSetOperationResultsRequest
  ): IO[ListStackSetOperationResultsResponse] =
    IO.fromFuture {
      IO(underlying.listStackSetOperationResults(listStackSetOperationResultsRequest))
    }

  override def listStackSetOperations(
      listStackSetOperationsRequest: ListStackSetOperationsRequest
  ): IO[ListStackSetOperationsResponse] =
    IO.fromFuture {
      IO(underlying.listStackSetOperations(listStackSetOperationsRequest))
    }

  override def listStackSets(listStackSetsRequest: ListStackSetsRequest): IO[ListStackSetsResponse] =
    IO.fromFuture {
      IO(underlying.listStackSets(listStackSetsRequest))
    }

  override def listStackSets(): IO[ListStackSetsResponse] =
    IO.fromFuture {
      IO(underlying.listStackSets())
    }

  override def listStacks(listStacksRequest: ListStacksRequest): IO[ListStacksResponse] =
    IO.fromFuture {
      IO(underlying.listStacks(listStacksRequest))
    }

  override def listStacks(): IO[ListStacksResponse] =
    IO.fromFuture {
      IO(underlying.listStacks())
    }

  def listStacksPaginator(): ListStacksPublisher =
    underlying.listStacksPaginator()

  def listStacksPaginator(listStacksRequest: ListStacksRequest): ListStacksPublisher =
    underlying.listStacksPaginator(listStacksRequest)

  override def listTypeRegistrations(
      listTypeRegistrationsRequest: ListTypeRegistrationsRequest
  ): IO[ListTypeRegistrationsResponse] =
    IO.fromFuture {
      IO(underlying.listTypeRegistrations(listTypeRegistrationsRequest))
    }

  def listTypeRegistrationsPaginator(
      listTypeRegistrationsRequest: ListTypeRegistrationsRequest
  ): ListTypeRegistrationsPublisher =
    underlying.listTypeRegistrationsPaginator(listTypeRegistrationsRequest)

  override def listTypeVersions(listTypeVersionsRequest: ListTypeVersionsRequest): IO[ListTypeVersionsResponse] =
    IO.fromFuture {
      IO(underlying.listTypeVersions(listTypeVersionsRequest))
    }

  def listTypeVersionsPaginator(listTypeVersionsRequest: ListTypeVersionsRequest): ListTypeVersionsPublisher =
    underlying.listTypeVersionsPaginator(listTypeVersionsRequest)

  override def listTypes(listTypesRequest: ListTypesRequest): IO[ListTypesResponse] =
    IO.fromFuture {
      IO(underlying.listTypes(listTypesRequest))
    }

  def listTypesPaginator(listTypesRequest: ListTypesRequest): ListTypesPublisher =
    underlying.listTypesPaginator(listTypesRequest)

  override def recordHandlerProgress(
      recordHandlerProgressRequest: RecordHandlerProgressRequest
  ): IO[RecordHandlerProgressResponse] =
    IO.fromFuture {
      IO(underlying.recordHandlerProgress(recordHandlerProgressRequest))
    }

  override def registerType(registerTypeRequest: RegisterTypeRequest): IO[RegisterTypeResponse] =
    IO.fromFuture {
      IO(underlying.registerType(registerTypeRequest))
    }

  override def setStackPolicy(setStackPolicyRequest: SetStackPolicyRequest): IO[SetStackPolicyResponse] =
    IO.fromFuture {
      IO(underlying.setStackPolicy(setStackPolicyRequest))
    }

  override def setTypeDefaultVersion(
      setTypeDefaultVersionRequest: SetTypeDefaultVersionRequest
  ): IO[SetTypeDefaultVersionResponse] =
    IO.fromFuture {
      IO(underlying.setTypeDefaultVersion(setTypeDefaultVersionRequest))
    }

  override def signalResource(signalResourceRequest: SignalResourceRequest): IO[SignalResourceResponse] =
    IO.fromFuture {
      IO(underlying.signalResource(signalResourceRequest))
    }

  override def stopStackSetOperation(
      stopStackSetOperationRequest: StopStackSetOperationRequest
  ): IO[StopStackSetOperationResponse] =
    IO.fromFuture {
      IO(underlying.stopStackSetOperation(stopStackSetOperationRequest))
    }

  override def updateStack(updateStackRequest: UpdateStackRequest): IO[UpdateStackResponse] =
    IO.fromFuture {
      IO(underlying.updateStack(updateStackRequest))
    }

  override def updateStackInstances(
      updateStackInstancesRequest: UpdateStackInstancesRequest
  ): IO[UpdateStackInstancesResponse] =
    IO.fromFuture {
      IO(underlying.updateStackInstances(updateStackInstancesRequest))
    }

  override def updateStackSet(updateStackSetRequest: UpdateStackSetRequest): IO[UpdateStackSetResponse] =
    IO.fromFuture {
      IO(underlying.updateStackSet(updateStackSetRequest))
    }

  override def updateTerminationProtection(
      updateTerminationProtectionRequest: UpdateTerminationProtectionRequest
  ): IO[UpdateTerminationProtectionResponse] =
    IO.fromFuture {
      IO(underlying.updateTerminationProtection(updateTerminationProtectionRequest))
    }

  override def validateTemplate(validateTemplateRequest: ValidateTemplateRequest): IO[ValidateTemplateResponse] =
    IO.fromFuture {
      IO(underlying.validateTemplate(validateTemplateRequest))
    }

}
