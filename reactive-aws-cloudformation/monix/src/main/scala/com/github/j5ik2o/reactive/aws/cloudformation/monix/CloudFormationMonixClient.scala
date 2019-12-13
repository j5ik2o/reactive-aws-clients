// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.monix

import software.amazon.awssdk.services.cloudformation.model._
import com.github.j5ik2o.reactive.aws.cloudformation.{ CloudFormationAsyncClient, CloudFormationClient }
import monix.eval.Task
import monix.reactive.Observable

object CloudFormationMonixClient {

  def apply(asyncClient: CloudFormationAsyncClient): CloudFormationMonixClient = new CloudFormationMonixClient {
    override val underlying: CloudFormationAsyncClient = asyncClient
  }

}

trait CloudFormationMonixClient extends CloudFormationClient[Task] {

  val underlying: CloudFormationAsyncClient

  override def cancelUpdateStack(cancelUpdateStackRequest: CancelUpdateStackRequest): Task[CancelUpdateStackResponse] =
    Task.deferFuture {
      underlying.cancelUpdateStack(cancelUpdateStackRequest)
    }

  override def continueUpdateRollback(
      continueUpdateRollbackRequest: ContinueUpdateRollbackRequest
  ): Task[ContinueUpdateRollbackResponse] =
    Task.deferFuture {
      underlying.continueUpdateRollback(continueUpdateRollbackRequest)
    }

  override def createChangeSet(createChangeSetRequest: CreateChangeSetRequest): Task[CreateChangeSetResponse] =
    Task.deferFuture {
      underlying.createChangeSet(createChangeSetRequest)
    }

  override def createStack(createStackRequest: CreateStackRequest): Task[CreateStackResponse] =
    Task.deferFuture {
      underlying.createStack(createStackRequest)
    }

  override def createStackInstances(
      createStackInstancesRequest: CreateStackInstancesRequest
  ): Task[CreateStackInstancesResponse] =
    Task.deferFuture {
      underlying.createStackInstances(createStackInstancesRequest)
    }

  override def createStackSet(createStackSetRequest: CreateStackSetRequest): Task[CreateStackSetResponse] =
    Task.deferFuture {
      underlying.createStackSet(createStackSetRequest)
    }

  override def deleteChangeSet(deleteChangeSetRequest: DeleteChangeSetRequest): Task[DeleteChangeSetResponse] =
    Task.deferFuture {
      underlying.deleteChangeSet(deleteChangeSetRequest)
    }

  override def deleteStack(deleteStackRequest: DeleteStackRequest): Task[DeleteStackResponse] =
    Task.deferFuture {
      underlying.deleteStack(deleteStackRequest)
    }

  override def deleteStackInstances(
      deleteStackInstancesRequest: DeleteStackInstancesRequest
  ): Task[DeleteStackInstancesResponse] =
    Task.deferFuture {
      underlying.deleteStackInstances(deleteStackInstancesRequest)
    }

  override def deleteStackSet(deleteStackSetRequest: DeleteStackSetRequest): Task[DeleteStackSetResponse] =
    Task.deferFuture {
      underlying.deleteStackSet(deleteStackSetRequest)
    }

  override def deregisterType(deregisterTypeRequest: DeregisterTypeRequest): Task[DeregisterTypeResponse] =
    Task.deferFuture {
      underlying.deregisterType(deregisterTypeRequest)
    }

  override def describeAccountLimits(
      describeAccountLimitsRequest: DescribeAccountLimitsRequest
  ): Task[DescribeAccountLimitsResponse] =
    Task.deferFuture {
      underlying.describeAccountLimits(describeAccountLimitsRequest)
    }

  override def describeAccountLimits(): Task[DescribeAccountLimitsResponse] =
    Task.deferFuture {
      underlying.describeAccountLimits()
    }

  override def describeChangeSet(describeChangeSetRequest: DescribeChangeSetRequest): Task[DescribeChangeSetResponse] =
    Task.deferFuture {
      underlying.describeChangeSet(describeChangeSetRequest)
    }

  override def describeStackDriftDetectionStatus(
      describeStackDriftDetectionStatusRequest: DescribeStackDriftDetectionStatusRequest
  ): Task[DescribeStackDriftDetectionStatusResponse] =
    Task.deferFuture {
      underlying.describeStackDriftDetectionStatus(describeStackDriftDetectionStatusRequest)
    }

  override def describeStackEvents(
      describeStackEventsRequest: DescribeStackEventsRequest
  ): Task[DescribeStackEventsResponse] =
    Task.deferFuture {
      underlying.describeStackEvents(describeStackEventsRequest)
    }

  def describeStackEventsPaginator(
      describeStackEventsRequest: DescribeStackEventsRequest
  ): Observable[DescribeStackEventsResponse] =
    Observable.fromReactivePublisher(underlying.describeStackEventsPaginator(describeStackEventsRequest))

  override def describeStackInstance(
      describeStackInstanceRequest: DescribeStackInstanceRequest
  ): Task[DescribeStackInstanceResponse] =
    Task.deferFuture {
      underlying.describeStackInstance(describeStackInstanceRequest)
    }

  override def describeStackResource(
      describeStackResourceRequest: DescribeStackResourceRequest
  ): Task[DescribeStackResourceResponse] =
    Task.deferFuture {
      underlying.describeStackResource(describeStackResourceRequest)
    }

  override def describeStackResourceDrifts(
      describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest
  ): Task[DescribeStackResourceDriftsResponse] =
    Task.deferFuture {
      underlying.describeStackResourceDrifts(describeStackResourceDriftsRequest)
    }

  def describeStackResourceDriftsPaginator(
      describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest
  ): Observable[DescribeStackResourceDriftsResponse] =
    Observable.fromReactivePublisher(
      underlying.describeStackResourceDriftsPaginator(describeStackResourceDriftsRequest)
    )

  override def describeStackResources(
      describeStackResourcesRequest: DescribeStackResourcesRequest
  ): Task[DescribeStackResourcesResponse] =
    Task.deferFuture {
      underlying.describeStackResources(describeStackResourcesRequest)
    }

  override def describeStackSet(describeStackSetRequest: DescribeStackSetRequest): Task[DescribeStackSetResponse] =
    Task.deferFuture {
      underlying.describeStackSet(describeStackSetRequest)
    }

  override def describeStackSetOperation(
      describeStackSetOperationRequest: DescribeStackSetOperationRequest
  ): Task[DescribeStackSetOperationResponse] =
    Task.deferFuture {
      underlying.describeStackSetOperation(describeStackSetOperationRequest)
    }

  override def describeStacks(describeStacksRequest: DescribeStacksRequest): Task[DescribeStacksResponse] =
    Task.deferFuture {
      underlying.describeStacks(describeStacksRequest)
    }

  override def describeStacks(): Task[DescribeStacksResponse] =
    Task.deferFuture {
      underlying.describeStacks()
    }

  def describeStacksPaginator(): Observable[DescribeStacksResponse] =
    Observable.fromReactivePublisher(underlying.describeStacksPaginator())

  def describeStacksPaginator(describeStacksRequest: DescribeStacksRequest): Observable[DescribeStacksResponse] =
    Observable.fromReactivePublisher(underlying.describeStacksPaginator(describeStacksRequest))

  override def describeType(describeTypeRequest: DescribeTypeRequest): Task[DescribeTypeResponse] =
    Task.deferFuture {
      underlying.describeType(describeTypeRequest)
    }

  override def describeTypeRegistration(
      describeTypeRegistrationRequest: DescribeTypeRegistrationRequest
  ): Task[DescribeTypeRegistrationResponse] =
    Task.deferFuture {
      underlying.describeTypeRegistration(describeTypeRegistrationRequest)
    }

  override def detectStackDrift(detectStackDriftRequest: DetectStackDriftRequest): Task[DetectStackDriftResponse] =
    Task.deferFuture {
      underlying.detectStackDrift(detectStackDriftRequest)
    }

  override def detectStackResourceDrift(
      detectStackResourceDriftRequest: DetectStackResourceDriftRequest
  ): Task[DetectStackResourceDriftResponse] =
    Task.deferFuture {
      underlying.detectStackResourceDrift(detectStackResourceDriftRequest)
    }

  override def detectStackSetDrift(
      detectStackSetDriftRequest: DetectStackSetDriftRequest
  ): Task[DetectStackSetDriftResponse] =
    Task.deferFuture {
      underlying.detectStackSetDrift(detectStackSetDriftRequest)
    }

  override def estimateTemplateCost(
      estimateTemplateCostRequest: EstimateTemplateCostRequest
  ): Task[EstimateTemplateCostResponse] =
    Task.deferFuture {
      underlying.estimateTemplateCost(estimateTemplateCostRequest)
    }

  override def executeChangeSet(executeChangeSetRequest: ExecuteChangeSetRequest): Task[ExecuteChangeSetResponse] =
    Task.deferFuture {
      underlying.executeChangeSet(executeChangeSetRequest)
    }

  override def getStackPolicy(getStackPolicyRequest: GetStackPolicyRequest): Task[GetStackPolicyResponse] =
    Task.deferFuture {
      underlying.getStackPolicy(getStackPolicyRequest)
    }

  override def getTemplate(getTemplateRequest: GetTemplateRequest): Task[GetTemplateResponse] =
    Task.deferFuture {
      underlying.getTemplate(getTemplateRequest)
    }

  override def getTemplateSummary(
      getTemplateSummaryRequest: GetTemplateSummaryRequest
  ): Task[GetTemplateSummaryResponse] =
    Task.deferFuture {
      underlying.getTemplateSummary(getTemplateSummaryRequest)
    }

  override def listChangeSets(listChangeSetsRequest: ListChangeSetsRequest): Task[ListChangeSetsResponse] =
    Task.deferFuture {
      underlying.listChangeSets(listChangeSetsRequest)
    }

  override def listExports(listExportsRequest: ListExportsRequest): Task[ListExportsResponse] =
    Task.deferFuture {
      underlying.listExports(listExportsRequest)
    }

  override def listExports(): Task[ListExportsResponse] =
    Task.deferFuture {
      underlying.listExports()
    }

  def listExportsPaginator(): Observable[ListExportsResponse] =
    Observable.fromReactivePublisher(underlying.listExportsPaginator())

  def listExportsPaginator(listExportsRequest: ListExportsRequest): Observable[ListExportsResponse] =
    Observable.fromReactivePublisher(underlying.listExportsPaginator(listExportsRequest))

  override def listImports(listImportsRequest: ListImportsRequest): Task[ListImportsResponse] =
    Task.deferFuture {
      underlying.listImports(listImportsRequest)
    }

  def listImportsPaginator(listImportsRequest: ListImportsRequest): Observable[ListImportsResponse] =
    Observable.fromReactivePublisher(underlying.listImportsPaginator(listImportsRequest))

  override def listStackInstances(
      listStackInstancesRequest: ListStackInstancesRequest
  ): Task[ListStackInstancesResponse] =
    Task.deferFuture {
      underlying.listStackInstances(listStackInstancesRequest)
    }

  override def listStackResources(
      listStackResourcesRequest: ListStackResourcesRequest
  ): Task[ListStackResourcesResponse] =
    Task.deferFuture {
      underlying.listStackResources(listStackResourcesRequest)
    }

  def listStackResourcesPaginator(
      listStackResourcesRequest: ListStackResourcesRequest
  ): Observable[ListStackResourcesResponse] =
    Observable.fromReactivePublisher(underlying.listStackResourcesPaginator(listStackResourcesRequest))

  override def listStackSetOperationResults(
      listStackSetOperationResultsRequest: ListStackSetOperationResultsRequest
  ): Task[ListStackSetOperationResultsResponse] =
    Task.deferFuture {
      underlying.listStackSetOperationResults(listStackSetOperationResultsRequest)
    }

  override def listStackSetOperations(
      listStackSetOperationsRequest: ListStackSetOperationsRequest
  ): Task[ListStackSetOperationsResponse] =
    Task.deferFuture {
      underlying.listStackSetOperations(listStackSetOperationsRequest)
    }

  override def listStackSets(listStackSetsRequest: ListStackSetsRequest): Task[ListStackSetsResponse] =
    Task.deferFuture {
      underlying.listStackSets(listStackSetsRequest)
    }

  override def listStackSets(): Task[ListStackSetsResponse] =
    Task.deferFuture {
      underlying.listStackSets()
    }

  override def listStacks(listStacksRequest: ListStacksRequest): Task[ListStacksResponse] =
    Task.deferFuture {
      underlying.listStacks(listStacksRequest)
    }

  override def listStacks(): Task[ListStacksResponse] =
    Task.deferFuture {
      underlying.listStacks()
    }

  def listStacksPaginator(): Observable[ListStacksResponse] =
    Observable.fromReactivePublisher(underlying.listStacksPaginator())

  def listStacksPaginator(listStacksRequest: ListStacksRequest): Observable[ListStacksResponse] =
    Observable.fromReactivePublisher(underlying.listStacksPaginator(listStacksRequest))

  override def listTypeRegistrations(
      listTypeRegistrationsRequest: ListTypeRegistrationsRequest
  ): Task[ListTypeRegistrationsResponse] =
    Task.deferFuture {
      underlying.listTypeRegistrations(listTypeRegistrationsRequest)
    }

  def listTypeRegistrationsPaginator(
      listTypeRegistrationsRequest: ListTypeRegistrationsRequest
  ): Observable[ListTypeRegistrationsResponse] =
    Observable.fromReactivePublisher(underlying.listTypeRegistrationsPaginator(listTypeRegistrationsRequest))

  override def listTypeVersions(listTypeVersionsRequest: ListTypeVersionsRequest): Task[ListTypeVersionsResponse] =
    Task.deferFuture {
      underlying.listTypeVersions(listTypeVersionsRequest)
    }

  def listTypeVersionsPaginator(
      listTypeVersionsRequest: ListTypeVersionsRequest
  ): Observable[ListTypeVersionsResponse] =
    Observable.fromReactivePublisher(underlying.listTypeVersionsPaginator(listTypeVersionsRequest))

  override def listTypes(listTypesRequest: ListTypesRequest): Task[ListTypesResponse] =
    Task.deferFuture {
      underlying.listTypes(listTypesRequest)
    }

  def listTypesPaginator(listTypesRequest: ListTypesRequest): Observable[ListTypesResponse] =
    Observable.fromReactivePublisher(underlying.listTypesPaginator(listTypesRequest))

  override def recordHandlerProgress(
      recordHandlerProgressRequest: RecordHandlerProgressRequest
  ): Task[RecordHandlerProgressResponse] =
    Task.deferFuture {
      underlying.recordHandlerProgress(recordHandlerProgressRequest)
    }

  override def registerType(registerTypeRequest: RegisterTypeRequest): Task[RegisterTypeResponse] =
    Task.deferFuture {
      underlying.registerType(registerTypeRequest)
    }

  override def setStackPolicy(setStackPolicyRequest: SetStackPolicyRequest): Task[SetStackPolicyResponse] =
    Task.deferFuture {
      underlying.setStackPolicy(setStackPolicyRequest)
    }

  override def setTypeDefaultVersion(
      setTypeDefaultVersionRequest: SetTypeDefaultVersionRequest
  ): Task[SetTypeDefaultVersionResponse] =
    Task.deferFuture {
      underlying.setTypeDefaultVersion(setTypeDefaultVersionRequest)
    }

  override def signalResource(signalResourceRequest: SignalResourceRequest): Task[SignalResourceResponse] =
    Task.deferFuture {
      underlying.signalResource(signalResourceRequest)
    }

  override def stopStackSetOperation(
      stopStackSetOperationRequest: StopStackSetOperationRequest
  ): Task[StopStackSetOperationResponse] =
    Task.deferFuture {
      underlying.stopStackSetOperation(stopStackSetOperationRequest)
    }

  override def updateStack(updateStackRequest: UpdateStackRequest): Task[UpdateStackResponse] =
    Task.deferFuture {
      underlying.updateStack(updateStackRequest)
    }

  override def updateStackInstances(
      updateStackInstancesRequest: UpdateStackInstancesRequest
  ): Task[UpdateStackInstancesResponse] =
    Task.deferFuture {
      underlying.updateStackInstances(updateStackInstancesRequest)
    }

  override def updateStackSet(updateStackSetRequest: UpdateStackSetRequest): Task[UpdateStackSetResponse] =
    Task.deferFuture {
      underlying.updateStackSet(updateStackSetRequest)
    }

  override def updateTerminationProtection(
      updateTerminationProtectionRequest: UpdateTerminationProtectionRequest
  ): Task[UpdateTerminationProtectionResponse] =
    Task.deferFuture {
      underlying.updateTerminationProtection(updateTerminationProtectionRequest)
    }

  override def validateTemplate(validateTemplateRequest: ValidateTemplateRequest): Task[ValidateTemplateResponse] =
    Task.deferFuture {
      underlying.validateTemplate(validateTemplateRequest)
    }

}
