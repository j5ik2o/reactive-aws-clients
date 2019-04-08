// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation

import software.amazon.awssdk.services.cloudformation.model._

trait CloudFormationClient[M[_]] {

  def cancelUpdateStack(cancelUpdateStackRequest: CancelUpdateStackRequest): M[CancelUpdateStackResponse]

  def continueUpdateRollback(
      continueUpdateRollbackRequest: ContinueUpdateRollbackRequest
  ): M[ContinueUpdateRollbackResponse]

  def createChangeSet(createChangeSetRequest: CreateChangeSetRequest): M[CreateChangeSetResponse]

  def createStack(createStackRequest: CreateStackRequest): M[CreateStackResponse]

  def createStackInstances(createStackInstancesRequest: CreateStackInstancesRequest): M[CreateStackInstancesResponse]

  def createStackSet(createStackSetRequest: CreateStackSetRequest): M[CreateStackSetResponse]

  def deleteChangeSet(deleteChangeSetRequest: DeleteChangeSetRequest): M[DeleteChangeSetResponse]

  def deleteStack(deleteStackRequest: DeleteStackRequest): M[DeleteStackResponse]

  def deleteStackInstances(deleteStackInstancesRequest: DeleteStackInstancesRequest): M[DeleteStackInstancesResponse]

  def deleteStackSet(deleteStackSetRequest: DeleteStackSetRequest): M[DeleteStackSetResponse]

  def describeAccountLimits(
      describeAccountLimitsRequest: DescribeAccountLimitsRequest
  ): M[DescribeAccountLimitsResponse]

  def describeAccountLimits(): M[DescribeAccountLimitsResponse]

  def describeChangeSet(describeChangeSetRequest: DescribeChangeSetRequest): M[DescribeChangeSetResponse]

  def describeStackDriftDetectionStatus(
      describeStackDriftDetectionStatusRequest: DescribeStackDriftDetectionStatusRequest
  ): M[DescribeStackDriftDetectionStatusResponse]

  def describeStackEvents(describeStackEventsRequest: DescribeStackEventsRequest): M[DescribeStackEventsResponse]

  def describeStackInstance(
      describeStackInstanceRequest: DescribeStackInstanceRequest
  ): M[DescribeStackInstanceResponse]

  def describeStackResource(
      describeStackResourceRequest: DescribeStackResourceRequest
  ): M[DescribeStackResourceResponse]

  def describeStackResourceDrifts(
      describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest
  ): M[DescribeStackResourceDriftsResponse]

  def describeStackResources(
      describeStackResourcesRequest: DescribeStackResourcesRequest
  ): M[DescribeStackResourcesResponse]

  def describeStackSet(describeStackSetRequest: DescribeStackSetRequest): M[DescribeStackSetResponse]

  def describeStackSetOperation(
      describeStackSetOperationRequest: DescribeStackSetOperationRequest
  ): M[DescribeStackSetOperationResponse]

  def describeStacks(describeStacksRequest: DescribeStacksRequest): M[DescribeStacksResponse]

  def describeStacks(): M[DescribeStacksResponse]

  def detectStackDrift(detectStackDriftRequest: DetectStackDriftRequest): M[DetectStackDriftResponse]

  def detectStackResourceDrift(
      detectStackResourceDriftRequest: DetectStackResourceDriftRequest
  ): M[DetectStackResourceDriftResponse]

  def estimateTemplateCost(estimateTemplateCostRequest: EstimateTemplateCostRequest): M[EstimateTemplateCostResponse]

  def executeChangeSet(executeChangeSetRequest: ExecuteChangeSetRequest): M[ExecuteChangeSetResponse]

  def getStackPolicy(getStackPolicyRequest: GetStackPolicyRequest): M[GetStackPolicyResponse]

  def getTemplate(getTemplateRequest: GetTemplateRequest): M[GetTemplateResponse]

  def getTemplateSummary(getTemplateSummaryRequest: GetTemplateSummaryRequest): M[GetTemplateSummaryResponse]

  def listChangeSets(listChangeSetsRequest: ListChangeSetsRequest): M[ListChangeSetsResponse]

  def listExports(listExportsRequest: ListExportsRequest): M[ListExportsResponse]

  def listExports(): M[ListExportsResponse]

  def listImports(listImportsRequest: ListImportsRequest): M[ListImportsResponse]

  def listStackInstances(listStackInstancesRequest: ListStackInstancesRequest): M[ListStackInstancesResponse]

  def listStackResources(listStackResourcesRequest: ListStackResourcesRequest): M[ListStackResourcesResponse]

  def listStackSetOperationResults(
      listStackSetOperationResultsRequest: ListStackSetOperationResultsRequest
  ): M[ListStackSetOperationResultsResponse]

  def listStackSetOperations(
      listStackSetOperationsRequest: ListStackSetOperationsRequest
  ): M[ListStackSetOperationsResponse]

  def listStackSets(listStackSetsRequest: ListStackSetsRequest): M[ListStackSetsResponse]

  def listStackSets(): M[ListStackSetsResponse]

  def listStacks(listStacksRequest: ListStacksRequest): M[ListStacksResponse]

  def listStacks(): M[ListStacksResponse]

  def setStackPolicy(setStackPolicyRequest: SetStackPolicyRequest): M[SetStackPolicyResponse]

  def signalResource(signalResourceRequest: SignalResourceRequest): M[SignalResourceResponse]

  def stopStackSetOperation(
      stopStackSetOperationRequest: StopStackSetOperationRequest
  ): M[StopStackSetOperationResponse]

  def updateStack(updateStackRequest: UpdateStackRequest): M[UpdateStackResponse]

  def updateStackInstances(updateStackInstancesRequest: UpdateStackInstancesRequest): M[UpdateStackInstancesResponse]

  def updateStackSet(updateStackSetRequest: UpdateStackSetRequest): M[UpdateStackSetResponse]

  def updateTerminationProtection(
      updateTerminationProtectionRequest: UpdateTerminationProtectionRequest
  ): M[UpdateTerminationProtectionResponse]

  def validateTemplate(validateTemplateRequest: ValidateTemplateRequest): M[ValidateTemplateResponse]

}
