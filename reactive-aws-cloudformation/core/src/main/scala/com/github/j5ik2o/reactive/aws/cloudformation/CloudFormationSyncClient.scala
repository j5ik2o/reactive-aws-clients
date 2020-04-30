// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.cloudformation.model._
import software.amazon.awssdk.services.cloudformation.paginators._
import software.amazon.awssdk.services.cloudformation.{ CloudFormationClient => JavaCloudFormationSyncClient }

object CloudFormationSyncClient extends ToEitherSupport {

def apply(javaClient: JavaCloudFormationSyncClient): CloudFormationSyncClient =
new CloudFormationSyncClient {
override val underlying: JavaCloudFormationSyncClient = javaClient
}
}

/**
* @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/cloudformation/CloudFormationClient.html
*/
trait CloudFormationSyncClient extends CloudFormationClient[Either[Throwable, ?]] {
val underlying: JavaCloudFormationSyncClient

import CloudFormationSyncClient._

    override def cancelUpdateStack(cancelUpdateStackRequest: CancelUpdateStackRequest): Either[Throwable, CancelUpdateStackResponse] =
        underlying.cancelUpdateStack(cancelUpdateStackRequest).toEither

    override def continueUpdateRollback(continueUpdateRollbackRequest: ContinueUpdateRollbackRequest): Either[Throwable, ContinueUpdateRollbackResponse] =
        underlying.continueUpdateRollback(continueUpdateRollbackRequest).toEither

    override def createChangeSet(createChangeSetRequest: CreateChangeSetRequest): Either[Throwable, CreateChangeSetResponse] =
        underlying.createChangeSet(createChangeSetRequest).toEither

    override def createStack(createStackRequest: CreateStackRequest): Either[Throwable, CreateStackResponse] =
        underlying.createStack(createStackRequest).toEither

    override def createStackInstances(createStackInstancesRequest: CreateStackInstancesRequest): Either[Throwable, CreateStackInstancesResponse] =
        underlying.createStackInstances(createStackInstancesRequest).toEither

    override def createStackSet(createStackSetRequest: CreateStackSetRequest): Either[Throwable, CreateStackSetResponse] =
        underlying.createStackSet(createStackSetRequest).toEither

    override def deleteChangeSet(deleteChangeSetRequest: DeleteChangeSetRequest): Either[Throwable, DeleteChangeSetResponse] =
        underlying.deleteChangeSet(deleteChangeSetRequest).toEither

    override def deleteStack(deleteStackRequest: DeleteStackRequest): Either[Throwable, DeleteStackResponse] =
        underlying.deleteStack(deleteStackRequest).toEither

    override def deleteStackInstances(deleteStackInstancesRequest: DeleteStackInstancesRequest): Either[Throwable, DeleteStackInstancesResponse] =
        underlying.deleteStackInstances(deleteStackInstancesRequest).toEither

    override def deleteStackSet(deleteStackSetRequest: DeleteStackSetRequest): Either[Throwable, DeleteStackSetResponse] =
        underlying.deleteStackSet(deleteStackSetRequest).toEither

    override def deregisterType(deregisterTypeRequest: DeregisterTypeRequest): Either[Throwable, DeregisterTypeResponse] =
        underlying.deregisterType(deregisterTypeRequest).toEither

    override def describeAccountLimits(): Either[Throwable, DescribeAccountLimitsResponse] =
        underlying.describeAccountLimits().toEither

    override def describeAccountLimits(describeAccountLimitsRequest: DescribeAccountLimitsRequest): Either[Throwable, DescribeAccountLimitsResponse] =
        underlying.describeAccountLimits(describeAccountLimitsRequest).toEither

    override def describeChangeSet(describeChangeSetRequest: DescribeChangeSetRequest): Either[Throwable, DescribeChangeSetResponse] =
        underlying.describeChangeSet(describeChangeSetRequest).toEither

    override def describeStackDriftDetectionStatus(describeStackDriftDetectionStatusRequest: DescribeStackDriftDetectionStatusRequest): Either[Throwable, DescribeStackDriftDetectionStatusResponse] =
        underlying.describeStackDriftDetectionStatus(describeStackDriftDetectionStatusRequest).toEither

    override def describeStackEvents(describeStackEventsRequest: DescribeStackEventsRequest): Either[Throwable, DescribeStackEventsResponse] =
        underlying.describeStackEvents(describeStackEventsRequest).toEither

     def describeStackEventsPaginator(describeStackEventsRequest: DescribeStackEventsRequest): DescribeStackEventsIterable =
        underlying.describeStackEventsPaginator(describeStackEventsRequest)

    override def describeStackInstance(describeStackInstanceRequest: DescribeStackInstanceRequest): Either[Throwable, DescribeStackInstanceResponse] =
        underlying.describeStackInstance(describeStackInstanceRequest).toEither

    override def describeStackResource(describeStackResourceRequest: DescribeStackResourceRequest): Either[Throwable, DescribeStackResourceResponse] =
        underlying.describeStackResource(describeStackResourceRequest).toEither

    override def describeStackResourceDrifts(describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest): Either[Throwable, DescribeStackResourceDriftsResponse] =
        underlying.describeStackResourceDrifts(describeStackResourceDriftsRequest).toEither

     def describeStackResourceDriftsPaginator(describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest): DescribeStackResourceDriftsIterable =
        underlying.describeStackResourceDriftsPaginator(describeStackResourceDriftsRequest)

    override def describeStackResources(describeStackResourcesRequest: DescribeStackResourcesRequest): Either[Throwable, DescribeStackResourcesResponse] =
        underlying.describeStackResources(describeStackResourcesRequest).toEither

    override def describeStackSet(describeStackSetRequest: DescribeStackSetRequest): Either[Throwable, DescribeStackSetResponse] =
        underlying.describeStackSet(describeStackSetRequest).toEither

    override def describeStackSetOperation(describeStackSetOperationRequest: DescribeStackSetOperationRequest): Either[Throwable, DescribeStackSetOperationResponse] =
        underlying.describeStackSetOperation(describeStackSetOperationRequest).toEither

    override def describeStacks(): Either[Throwable, DescribeStacksResponse] =
        underlying.describeStacks().toEither

    override def describeStacks(describeStacksRequest: DescribeStacksRequest): Either[Throwable, DescribeStacksResponse] =
        underlying.describeStacks(describeStacksRequest).toEither

     def describeStacksPaginator(): DescribeStacksIterable =
        underlying.describeStacksPaginator()

     def describeStacksPaginator(describeStacksRequest: DescribeStacksRequest): DescribeStacksIterable =
        underlying.describeStacksPaginator(describeStacksRequest)

    override def describeType(describeTypeRequest: DescribeTypeRequest): Either[Throwable, DescribeTypeResponse] =
        underlying.describeType(describeTypeRequest).toEither

    override def describeTypeRegistration(describeTypeRegistrationRequest: DescribeTypeRegistrationRequest): Either[Throwable, DescribeTypeRegistrationResponse] =
        underlying.describeTypeRegistration(describeTypeRegistrationRequest).toEither

    override def detectStackDrift(detectStackDriftRequest: DetectStackDriftRequest): Either[Throwable, DetectStackDriftResponse] =
        underlying.detectStackDrift(detectStackDriftRequest).toEither

    override def detectStackResourceDrift(detectStackResourceDriftRequest: DetectStackResourceDriftRequest): Either[Throwable, DetectStackResourceDriftResponse] =
        underlying.detectStackResourceDrift(detectStackResourceDriftRequest).toEither

    override def detectStackSetDrift(detectStackSetDriftRequest: DetectStackSetDriftRequest): Either[Throwable, DetectStackSetDriftResponse] =
        underlying.detectStackSetDrift(detectStackSetDriftRequest).toEither

    override def estimateTemplateCost(estimateTemplateCostRequest: EstimateTemplateCostRequest): Either[Throwable, EstimateTemplateCostResponse] =
        underlying.estimateTemplateCost(estimateTemplateCostRequest).toEither

    override def executeChangeSet(executeChangeSetRequest: ExecuteChangeSetRequest): Either[Throwable, ExecuteChangeSetResponse] =
        underlying.executeChangeSet(executeChangeSetRequest).toEither

    override def getStackPolicy(getStackPolicyRequest: GetStackPolicyRequest): Either[Throwable, GetStackPolicyResponse] =
        underlying.getStackPolicy(getStackPolicyRequest).toEither

    override def getTemplate(getTemplateRequest: GetTemplateRequest): Either[Throwable, GetTemplateResponse] =
        underlying.getTemplate(getTemplateRequest).toEither

    override def getTemplateSummary(getTemplateSummaryRequest: GetTemplateSummaryRequest): Either[Throwable, GetTemplateSummaryResponse] =
        underlying.getTemplateSummary(getTemplateSummaryRequest).toEither

    override def listChangeSets(listChangeSetsRequest: ListChangeSetsRequest): Either[Throwable, ListChangeSetsResponse] =
        underlying.listChangeSets(listChangeSetsRequest).toEither

    override def listExports(): Either[Throwable, ListExportsResponse] =
        underlying.listExports().toEither

    override def listExports(listExportsRequest: ListExportsRequest): Either[Throwable, ListExportsResponse] =
        underlying.listExports(listExportsRequest).toEither

     def listExportsPaginator(): ListExportsIterable =
        underlying.listExportsPaginator()

     def listExportsPaginator(listExportsRequest: ListExportsRequest): ListExportsIterable =
        underlying.listExportsPaginator(listExportsRequest)

    override def listImports(listImportsRequest: ListImportsRequest): Either[Throwable, ListImportsResponse] =
        underlying.listImports(listImportsRequest).toEither

     def listImportsPaginator(listImportsRequest: ListImportsRequest): ListImportsIterable =
        underlying.listImportsPaginator(listImportsRequest)

    override def listStackInstances(listStackInstancesRequest: ListStackInstancesRequest): Either[Throwable, ListStackInstancesResponse] =
        underlying.listStackInstances(listStackInstancesRequest).toEither

    override def listStackResources(listStackResourcesRequest: ListStackResourcesRequest): Either[Throwable, ListStackResourcesResponse] =
        underlying.listStackResources(listStackResourcesRequest).toEither

     def listStackResourcesPaginator(listStackResourcesRequest: ListStackResourcesRequest): ListStackResourcesIterable =
        underlying.listStackResourcesPaginator(listStackResourcesRequest)

    override def listStackSetOperationResults(listStackSetOperationResultsRequest: ListStackSetOperationResultsRequest): Either[Throwable, ListStackSetOperationResultsResponse] =
        underlying.listStackSetOperationResults(listStackSetOperationResultsRequest).toEither

    override def listStackSetOperations(listStackSetOperationsRequest: ListStackSetOperationsRequest): Either[Throwable, ListStackSetOperationsResponse] =
        underlying.listStackSetOperations(listStackSetOperationsRequest).toEither

    override def listStackSets(): Either[Throwable, ListStackSetsResponse] =
        underlying.listStackSets().toEither

    override def listStackSets(listStackSetsRequest: ListStackSetsRequest): Either[Throwable, ListStackSetsResponse] =
        underlying.listStackSets(listStackSetsRequest).toEither

    override def listStacks(): Either[Throwable, ListStacksResponse] =
        underlying.listStacks().toEither

    override def listStacks(listStacksRequest: ListStacksRequest): Either[Throwable, ListStacksResponse] =
        underlying.listStacks(listStacksRequest).toEither

     def listStacksPaginator(): ListStacksIterable =
        underlying.listStacksPaginator()

     def listStacksPaginator(listStacksRequest: ListStacksRequest): ListStacksIterable =
        underlying.listStacksPaginator(listStacksRequest)

    override def listTypeRegistrations(listTypeRegistrationsRequest: ListTypeRegistrationsRequest): Either[Throwable, ListTypeRegistrationsResponse] =
        underlying.listTypeRegistrations(listTypeRegistrationsRequest).toEither

     def listTypeRegistrationsPaginator(listTypeRegistrationsRequest: ListTypeRegistrationsRequest): ListTypeRegistrationsIterable =
        underlying.listTypeRegistrationsPaginator(listTypeRegistrationsRequest)

    override def listTypeVersions(listTypeVersionsRequest: ListTypeVersionsRequest): Either[Throwable, ListTypeVersionsResponse] =
        underlying.listTypeVersions(listTypeVersionsRequest).toEither

     def listTypeVersionsPaginator(listTypeVersionsRequest: ListTypeVersionsRequest): ListTypeVersionsIterable =
        underlying.listTypeVersionsPaginator(listTypeVersionsRequest)

    override def listTypes(listTypesRequest: ListTypesRequest): Either[Throwable, ListTypesResponse] =
        underlying.listTypes(listTypesRequest).toEither

     def listTypesPaginator(listTypesRequest: ListTypesRequest): ListTypesIterable =
        underlying.listTypesPaginator(listTypesRequest)

    override def recordHandlerProgress(recordHandlerProgressRequest: RecordHandlerProgressRequest): Either[Throwable, RecordHandlerProgressResponse] =
        underlying.recordHandlerProgress(recordHandlerProgressRequest).toEither

    override def registerType(registerTypeRequest: RegisterTypeRequest): Either[Throwable, RegisterTypeResponse] =
        underlying.registerType(registerTypeRequest).toEither

    override def setStackPolicy(setStackPolicyRequest: SetStackPolicyRequest): Either[Throwable, SetStackPolicyResponse] =
        underlying.setStackPolicy(setStackPolicyRequest).toEither

    override def setTypeDefaultVersion(setTypeDefaultVersionRequest: SetTypeDefaultVersionRequest): Either[Throwable, SetTypeDefaultVersionResponse] =
        underlying.setTypeDefaultVersion(setTypeDefaultVersionRequest).toEither

    override def signalResource(signalResourceRequest: SignalResourceRequest): Either[Throwable, SignalResourceResponse] =
        underlying.signalResource(signalResourceRequest).toEither

    override def stopStackSetOperation(stopStackSetOperationRequest: StopStackSetOperationRequest): Either[Throwable, StopStackSetOperationResponse] =
        underlying.stopStackSetOperation(stopStackSetOperationRequest).toEither

    override def updateStack(updateStackRequest: UpdateStackRequest): Either[Throwable, UpdateStackResponse] =
        underlying.updateStack(updateStackRequest).toEither

    override def updateStackInstances(updateStackInstancesRequest: UpdateStackInstancesRequest): Either[Throwable, UpdateStackInstancesResponse] =
        underlying.updateStackInstances(updateStackInstancesRequest).toEither

    override def updateStackSet(updateStackSetRequest: UpdateStackSetRequest): Either[Throwable, UpdateStackSetResponse] =
        underlying.updateStackSet(updateStackSetRequest).toEither

    override def updateTerminationProtection(updateTerminationProtectionRequest: UpdateTerminationProtectionRequest): Either[Throwable, UpdateTerminationProtectionResponse] =
        underlying.updateTerminationProtection(updateTerminationProtectionRequest).toEither

    override def validateTemplate(validateTemplateRequest: ValidateTemplateRequest): Either[Throwable, ValidateTemplateResponse] =
        underlying.validateTemplate(validateTemplateRequest).toEither

}

