// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.cloudformation.CloudFormationAsyncClient
import software.amazon.awssdk.services.cloudformation.model._

object CloudFormationAkkaClient {

  def apply(asyncClient: CloudFormationAsyncClient): CloudFormationAkkaClient = new CloudFormationAkkaClient {
    override val underlying: CloudFormationAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait CloudFormationAkkaClient {

  import CloudFormationAkkaClient._

  val underlying: CloudFormationAsyncClient

  def cancelUpdateStackSource(cancelUpdateStackRequest: CancelUpdateStackRequest,
                              parallelism: Int = DefaultParallelism): Source[CancelUpdateStackResponse, NotUsed] =
    Source.single(cancelUpdateStackRequest).via(cancelUpdateStackFlow(parallelism))

  def cancelUpdateStackFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelUpdateStackRequest, CancelUpdateStackResponse, NotUsed] =
    Flow[CancelUpdateStackRequest].mapAsync(parallelism) { cancelUpdateStackRequest =>
      underlying.cancelUpdateStack(cancelUpdateStackRequest)
    }

  def continueUpdateRollbackSource(
      continueUpdateRollbackRequest: ContinueUpdateRollbackRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ContinueUpdateRollbackResponse, NotUsed] =
    Source.single(continueUpdateRollbackRequest).via(continueUpdateRollbackFlow(parallelism))

  def continueUpdateRollbackFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ContinueUpdateRollbackRequest, ContinueUpdateRollbackResponse, NotUsed] =
    Flow[ContinueUpdateRollbackRequest].mapAsync(parallelism) { continueUpdateRollbackRequest =>
      underlying.continueUpdateRollback(continueUpdateRollbackRequest)
    }

  def createChangeSetSource(createChangeSetRequest: CreateChangeSetRequest,
                            parallelism: Int = DefaultParallelism): Source[CreateChangeSetResponse, NotUsed] =
    Source.single(createChangeSetRequest).via(createChangeSetFlow(parallelism))

  def createChangeSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateChangeSetRequest, CreateChangeSetResponse, NotUsed] =
    Flow[CreateChangeSetRequest].mapAsync(parallelism) { createChangeSetRequest =>
      underlying.createChangeSet(createChangeSetRequest)
    }

  def createStackSource(createStackRequest: CreateStackRequest,
                        parallelism: Int = DefaultParallelism): Source[CreateStackResponse, NotUsed] =
    Source.single(createStackRequest).via(createStackFlow(parallelism))

  def createStackFlow(parallelism: Int = DefaultParallelism): Flow[CreateStackRequest, CreateStackResponse, NotUsed] =
    Flow[CreateStackRequest].mapAsync(parallelism) { createStackRequest =>
      underlying.createStack(createStackRequest)
    }

  def createStackInstancesSource(createStackInstancesRequest: CreateStackInstancesRequest,
                                 parallelism: Int = DefaultParallelism): Source[CreateStackInstancesResponse, NotUsed] =
    Source.single(createStackInstancesRequest).via(createStackInstancesFlow(parallelism))

  def createStackInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateStackInstancesRequest, CreateStackInstancesResponse, NotUsed] =
    Flow[CreateStackInstancesRequest].mapAsync(parallelism) { createStackInstancesRequest =>
      underlying.createStackInstances(createStackInstancesRequest)
    }

  def createStackSetSource(createStackSetRequest: CreateStackSetRequest,
                           parallelism: Int = DefaultParallelism): Source[CreateStackSetResponse, NotUsed] =
    Source.single(createStackSetRequest).via(createStackSetFlow(parallelism))

  def createStackSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateStackSetRequest, CreateStackSetResponse, NotUsed] =
    Flow[CreateStackSetRequest].mapAsync(parallelism) { createStackSetRequest =>
      underlying.createStackSet(createStackSetRequest)
    }

  def deleteChangeSetSource(deleteChangeSetRequest: DeleteChangeSetRequest,
                            parallelism: Int = DefaultParallelism): Source[DeleteChangeSetResponse, NotUsed] =
    Source.single(deleteChangeSetRequest).via(deleteChangeSetFlow(parallelism))

  def deleteChangeSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteChangeSetRequest, DeleteChangeSetResponse, NotUsed] =
    Flow[DeleteChangeSetRequest].mapAsync(parallelism) { deleteChangeSetRequest =>
      underlying.deleteChangeSet(deleteChangeSetRequest)
    }

  def deleteStackSource(deleteStackRequest: DeleteStackRequest,
                        parallelism: Int = DefaultParallelism): Source[DeleteStackResponse, NotUsed] =
    Source.single(deleteStackRequest).via(deleteStackFlow(parallelism))

  def deleteStackFlow(parallelism: Int = DefaultParallelism): Flow[DeleteStackRequest, DeleteStackResponse, NotUsed] =
    Flow[DeleteStackRequest].mapAsync(parallelism) { deleteStackRequest =>
      underlying.deleteStack(deleteStackRequest)
    }

  def deleteStackInstancesSource(deleteStackInstancesRequest: DeleteStackInstancesRequest,
                                 parallelism: Int = DefaultParallelism): Source[DeleteStackInstancesResponse, NotUsed] =
    Source.single(deleteStackInstancesRequest).via(deleteStackInstancesFlow(parallelism))

  def deleteStackInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteStackInstancesRequest, DeleteStackInstancesResponse, NotUsed] =
    Flow[DeleteStackInstancesRequest].mapAsync(parallelism) { deleteStackInstancesRequest =>
      underlying.deleteStackInstances(deleteStackInstancesRequest)
    }

  def deleteStackSetSource(deleteStackSetRequest: DeleteStackSetRequest,
                           parallelism: Int = DefaultParallelism): Source[DeleteStackSetResponse, NotUsed] =
    Source.single(deleteStackSetRequest).via(deleteStackSetFlow(parallelism))

  def deleteStackSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteStackSetRequest, DeleteStackSetResponse, NotUsed] =
    Flow[DeleteStackSetRequest].mapAsync(parallelism) { deleteStackSetRequest =>
      underlying.deleteStackSet(deleteStackSetRequest)
    }

  def describeAccountLimitsSource(
      describeAccountLimitsRequest: DescribeAccountLimitsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeAccountLimitsResponse, NotUsed] =
    Source.single(describeAccountLimitsRequest).via(describeAccountLimitsFlow(parallelism))

  def describeAccountLimitsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAccountLimitsRequest, DescribeAccountLimitsResponse, NotUsed] =
    Flow[DescribeAccountLimitsRequest].mapAsync(parallelism) { describeAccountLimitsRequest =>
      underlying.describeAccountLimits(describeAccountLimitsRequest)
    }

  def describeAccountLimitsSource(): Source[DescribeAccountLimitsResponse, NotUsed] =
    Source.fromFuture(underlying.describeAccountLimits())

  def describeChangeSetSource(describeChangeSetRequest: DescribeChangeSetRequest,
                              parallelism: Int = DefaultParallelism): Source[DescribeChangeSetResponse, NotUsed] =
    Source.single(describeChangeSetRequest).via(describeChangeSetFlow(parallelism))

  def describeChangeSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeChangeSetRequest, DescribeChangeSetResponse, NotUsed] =
    Flow[DescribeChangeSetRequest].mapAsync(parallelism) { describeChangeSetRequest =>
      underlying.describeChangeSet(describeChangeSetRequest)
    }

  def describeStackDriftDetectionStatusSource(
      describeStackDriftDetectionStatusRequest: DescribeStackDriftDetectionStatusRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStackDriftDetectionStatusResponse, NotUsed] =
    Source.single(describeStackDriftDetectionStatusRequest).via(describeStackDriftDetectionStatusFlow(parallelism))

  def describeStackDriftDetectionStatusFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStackDriftDetectionStatusRequest, DescribeStackDriftDetectionStatusResponse, NotUsed] =
    Flow[DescribeStackDriftDetectionStatusRequest].mapAsync(parallelism) { describeStackDriftDetectionStatusRequest =>
      underlying.describeStackDriftDetectionStatus(describeStackDriftDetectionStatusRequest)
    }

  def describeStackEventsSource(describeStackEventsRequest: DescribeStackEventsRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeStackEventsResponse, NotUsed] =
    Source.single(describeStackEventsRequest).via(describeStackEventsFlow(parallelism))

  def describeStackEventsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStackEventsRequest, DescribeStackEventsResponse, NotUsed] =
    Flow[DescribeStackEventsRequest].mapAsync(parallelism) { describeStackEventsRequest =>
      underlying.describeStackEvents(describeStackEventsRequest)
    }

  def describeStackEventsPaginatorFlow: Flow[DescribeStackEventsRequest, DescribeStackEventsResponse, NotUsed] =
    Flow[DescribeStackEventsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeStackEventsPaginator(request))
    }

  def describeStackInstanceSource(
      describeStackInstanceRequest: DescribeStackInstanceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStackInstanceResponse, NotUsed] =
    Source.single(describeStackInstanceRequest).via(describeStackInstanceFlow(parallelism))

  def describeStackInstanceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStackInstanceRequest, DescribeStackInstanceResponse, NotUsed] =
    Flow[DescribeStackInstanceRequest].mapAsync(parallelism) { describeStackInstanceRequest =>
      underlying.describeStackInstance(describeStackInstanceRequest)
    }

  def describeStackResourceSource(
      describeStackResourceRequest: DescribeStackResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStackResourceResponse, NotUsed] =
    Source.single(describeStackResourceRequest).via(describeStackResourceFlow(parallelism))

  def describeStackResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStackResourceRequest, DescribeStackResourceResponse, NotUsed] =
    Flow[DescribeStackResourceRequest].mapAsync(parallelism) { describeStackResourceRequest =>
      underlying.describeStackResource(describeStackResourceRequest)
    }

  def describeStackResourceDriftsSource(
      describeStackResourceDriftsRequest: DescribeStackResourceDriftsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStackResourceDriftsResponse, NotUsed] =
    Source.single(describeStackResourceDriftsRequest).via(describeStackResourceDriftsFlow(parallelism))

  def describeStackResourceDriftsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStackResourceDriftsRequest, DescribeStackResourceDriftsResponse, NotUsed] =
    Flow[DescribeStackResourceDriftsRequest].mapAsync(parallelism) { describeStackResourceDriftsRequest =>
      underlying.describeStackResourceDrifts(describeStackResourceDriftsRequest)
    }

  def describeStackResourceDriftsPaginatorFlow
    : Flow[DescribeStackResourceDriftsRequest, DescribeStackResourceDriftsResponse, NotUsed] =
    Flow[DescribeStackResourceDriftsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeStackResourceDriftsPaginator(request))
    }

  def describeStackResourcesSource(
      describeStackResourcesRequest: DescribeStackResourcesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStackResourcesResponse, NotUsed] =
    Source.single(describeStackResourcesRequest).via(describeStackResourcesFlow(parallelism))

  def describeStackResourcesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStackResourcesRequest, DescribeStackResourcesResponse, NotUsed] =
    Flow[DescribeStackResourcesRequest].mapAsync(parallelism) { describeStackResourcesRequest =>
      underlying.describeStackResources(describeStackResourcesRequest)
    }

  def describeStackSetSource(describeStackSetRequest: DescribeStackSetRequest,
                             parallelism: Int = DefaultParallelism): Source[DescribeStackSetResponse, NotUsed] =
    Source.single(describeStackSetRequest).via(describeStackSetFlow(parallelism))

  def describeStackSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStackSetRequest, DescribeStackSetResponse, NotUsed] =
    Flow[DescribeStackSetRequest].mapAsync(parallelism) { describeStackSetRequest =>
      underlying.describeStackSet(describeStackSetRequest)
    }

  def describeStackSetOperationSource(
      describeStackSetOperationRequest: DescribeStackSetOperationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStackSetOperationResponse, NotUsed] =
    Source.single(describeStackSetOperationRequest).via(describeStackSetOperationFlow(parallelism))

  def describeStackSetOperationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStackSetOperationRequest, DescribeStackSetOperationResponse, NotUsed] =
    Flow[DescribeStackSetOperationRequest].mapAsync(parallelism) { describeStackSetOperationRequest =>
      underlying.describeStackSetOperation(describeStackSetOperationRequest)
    }

  def describeStacksSource(describeStacksRequest: DescribeStacksRequest,
                           parallelism: Int = DefaultParallelism): Source[DescribeStacksResponse, NotUsed] =
    Source.single(describeStacksRequest).via(describeStacksFlow(parallelism))

  def describeStacksFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStacksRequest, DescribeStacksResponse, NotUsed] =
    Flow[DescribeStacksRequest].mapAsync(parallelism) { describeStacksRequest =>
      underlying.describeStacks(describeStacksRequest)
    }

  def describeStacksSource(): Source[DescribeStacksResponse, NotUsed] =
    Source.fromFuture(underlying.describeStacks())

  def describeStacksPaginatorSource: Source[DescribeStacksResponse, NotUsed] =
    Source.fromPublisher(underlying.describeStacksPaginator())

  def describeStacksPaginatorFlow: Flow[DescribeStacksRequest, DescribeStacksResponse, NotUsed] =
    Flow[DescribeStacksRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeStacksPaginator(request))
    }

  def detectStackDriftSource(detectStackDriftRequest: DetectStackDriftRequest,
                             parallelism: Int = DefaultParallelism): Source[DetectStackDriftResponse, NotUsed] =
    Source.single(detectStackDriftRequest).via(detectStackDriftFlow(parallelism))

  def detectStackDriftFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetectStackDriftRequest, DetectStackDriftResponse, NotUsed] =
    Flow[DetectStackDriftRequest].mapAsync(parallelism) { detectStackDriftRequest =>
      underlying.detectStackDrift(detectStackDriftRequest)
    }

  def detectStackResourceDriftSource(
      detectStackResourceDriftRequest: DetectStackResourceDriftRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DetectStackResourceDriftResponse, NotUsed] =
    Source.single(detectStackResourceDriftRequest).via(detectStackResourceDriftFlow(parallelism))

  def detectStackResourceDriftFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetectStackResourceDriftRequest, DetectStackResourceDriftResponse, NotUsed] =
    Flow[DetectStackResourceDriftRequest].mapAsync(parallelism) { detectStackResourceDriftRequest =>
      underlying.detectStackResourceDrift(detectStackResourceDriftRequest)
    }

  def estimateTemplateCostSource(estimateTemplateCostRequest: EstimateTemplateCostRequest,
                                 parallelism: Int = DefaultParallelism): Source[EstimateTemplateCostResponse, NotUsed] =
    Source.single(estimateTemplateCostRequest).via(estimateTemplateCostFlow(parallelism))

  def estimateTemplateCostFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[EstimateTemplateCostRequest, EstimateTemplateCostResponse, NotUsed] =
    Flow[EstimateTemplateCostRequest].mapAsync(parallelism) { estimateTemplateCostRequest =>
      underlying.estimateTemplateCost(estimateTemplateCostRequest)
    }

  def executeChangeSetSource(executeChangeSetRequest: ExecuteChangeSetRequest,
                             parallelism: Int = DefaultParallelism): Source[ExecuteChangeSetResponse, NotUsed] =
    Source.single(executeChangeSetRequest).via(executeChangeSetFlow(parallelism))

  def executeChangeSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ExecuteChangeSetRequest, ExecuteChangeSetResponse, NotUsed] =
    Flow[ExecuteChangeSetRequest].mapAsync(parallelism) { executeChangeSetRequest =>
      underlying.executeChangeSet(executeChangeSetRequest)
    }

  def getStackPolicySource(getStackPolicyRequest: GetStackPolicyRequest,
                           parallelism: Int = DefaultParallelism): Source[GetStackPolicyResponse, NotUsed] =
    Source.single(getStackPolicyRequest).via(getStackPolicyFlow(parallelism))

  def getStackPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetStackPolicyRequest, GetStackPolicyResponse, NotUsed] =
    Flow[GetStackPolicyRequest].mapAsync(parallelism) { getStackPolicyRequest =>
      underlying.getStackPolicy(getStackPolicyRequest)
    }

  def getTemplateSource(getTemplateRequest: GetTemplateRequest,
                        parallelism: Int = DefaultParallelism): Source[GetTemplateResponse, NotUsed] =
    Source.single(getTemplateRequest).via(getTemplateFlow(parallelism))

  def getTemplateFlow(parallelism: Int = DefaultParallelism): Flow[GetTemplateRequest, GetTemplateResponse, NotUsed] =
    Flow[GetTemplateRequest].mapAsync(parallelism) { getTemplateRequest =>
      underlying.getTemplate(getTemplateRequest)
    }

  def getTemplateSummarySource(getTemplateSummaryRequest: GetTemplateSummaryRequest,
                               parallelism: Int = DefaultParallelism): Source[GetTemplateSummaryResponse, NotUsed] =
    Source.single(getTemplateSummaryRequest).via(getTemplateSummaryFlow(parallelism))

  def getTemplateSummaryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetTemplateSummaryRequest, GetTemplateSummaryResponse, NotUsed] =
    Flow[GetTemplateSummaryRequest].mapAsync(parallelism) { getTemplateSummaryRequest =>
      underlying.getTemplateSummary(getTemplateSummaryRequest)
    }

  def listChangeSetsSource(listChangeSetsRequest: ListChangeSetsRequest,
                           parallelism: Int = DefaultParallelism): Source[ListChangeSetsResponse, NotUsed] =
    Source.single(listChangeSetsRequest).via(listChangeSetsFlow(parallelism))

  def listChangeSetsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListChangeSetsRequest, ListChangeSetsResponse, NotUsed] =
    Flow[ListChangeSetsRequest].mapAsync(parallelism) { listChangeSetsRequest =>
      underlying.listChangeSets(listChangeSetsRequest)
    }

  def listExportsSource(listExportsRequest: ListExportsRequest,
                        parallelism: Int = DefaultParallelism): Source[ListExportsResponse, NotUsed] =
    Source.single(listExportsRequest).via(listExportsFlow(parallelism))

  def listExportsFlow(parallelism: Int = DefaultParallelism): Flow[ListExportsRequest, ListExportsResponse, NotUsed] =
    Flow[ListExportsRequest].mapAsync(parallelism) { listExportsRequest =>
      underlying.listExports(listExportsRequest)
    }

  def listExportsSource(): Source[ListExportsResponse, NotUsed] =
    Source.fromFuture(underlying.listExports())

  def listExportsPaginatorSource: Source[ListExportsResponse, NotUsed] =
    Source.fromPublisher(underlying.listExportsPaginator())

  def listExportsPaginatorFlow: Flow[ListExportsRequest, ListExportsResponse, NotUsed] =
    Flow[ListExportsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listExportsPaginator(request))
    }

  def listImportsSource(listImportsRequest: ListImportsRequest,
                        parallelism: Int = DefaultParallelism): Source[ListImportsResponse, NotUsed] =
    Source.single(listImportsRequest).via(listImportsFlow(parallelism))

  def listImportsFlow(parallelism: Int = DefaultParallelism): Flow[ListImportsRequest, ListImportsResponse, NotUsed] =
    Flow[ListImportsRequest].mapAsync(parallelism) { listImportsRequest =>
      underlying.listImports(listImportsRequest)
    }

  def listImportsPaginatorFlow: Flow[ListImportsRequest, ListImportsResponse, NotUsed] =
    Flow[ListImportsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listImportsPaginator(request))
    }

  def listStackInstancesSource(listStackInstancesRequest: ListStackInstancesRequest,
                               parallelism: Int = DefaultParallelism): Source[ListStackInstancesResponse, NotUsed] =
    Source.single(listStackInstancesRequest).via(listStackInstancesFlow(parallelism))

  def listStackInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListStackInstancesRequest, ListStackInstancesResponse, NotUsed] =
    Flow[ListStackInstancesRequest].mapAsync(parallelism) { listStackInstancesRequest =>
      underlying.listStackInstances(listStackInstancesRequest)
    }

  def listStackResourcesSource(listStackResourcesRequest: ListStackResourcesRequest,
                               parallelism: Int = DefaultParallelism): Source[ListStackResourcesResponse, NotUsed] =
    Source.single(listStackResourcesRequest).via(listStackResourcesFlow(parallelism))

  def listStackResourcesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListStackResourcesRequest, ListStackResourcesResponse, NotUsed] =
    Flow[ListStackResourcesRequest].mapAsync(parallelism) { listStackResourcesRequest =>
      underlying.listStackResources(listStackResourcesRequest)
    }

  def listStackResourcesPaginatorFlow: Flow[ListStackResourcesRequest, ListStackResourcesResponse, NotUsed] =
    Flow[ListStackResourcesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listStackResourcesPaginator(request))
    }

  def listStackSetOperationResultsSource(
      listStackSetOperationResultsRequest: ListStackSetOperationResultsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListStackSetOperationResultsResponse, NotUsed] =
    Source.single(listStackSetOperationResultsRequest).via(listStackSetOperationResultsFlow(parallelism))

  def listStackSetOperationResultsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListStackSetOperationResultsRequest, ListStackSetOperationResultsResponse, NotUsed] =
    Flow[ListStackSetOperationResultsRequest].mapAsync(parallelism) { listStackSetOperationResultsRequest =>
      underlying.listStackSetOperationResults(listStackSetOperationResultsRequest)
    }

  def listStackSetOperationsSource(
      listStackSetOperationsRequest: ListStackSetOperationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListStackSetOperationsResponse, NotUsed] =
    Source.single(listStackSetOperationsRequest).via(listStackSetOperationsFlow(parallelism))

  def listStackSetOperationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListStackSetOperationsRequest, ListStackSetOperationsResponse, NotUsed] =
    Flow[ListStackSetOperationsRequest].mapAsync(parallelism) { listStackSetOperationsRequest =>
      underlying.listStackSetOperations(listStackSetOperationsRequest)
    }

  def listStackSetsSource(listStackSetsRequest: ListStackSetsRequest,
                          parallelism: Int = DefaultParallelism): Source[ListStackSetsResponse, NotUsed] =
    Source.single(listStackSetsRequest).via(listStackSetsFlow(parallelism))

  def listStackSetsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListStackSetsRequest, ListStackSetsResponse, NotUsed] =
    Flow[ListStackSetsRequest].mapAsync(parallelism) { listStackSetsRequest =>
      underlying.listStackSets(listStackSetsRequest)
    }

  def listStackSetsSource(): Source[ListStackSetsResponse, NotUsed] =
    Source.fromFuture(underlying.listStackSets())

  def listStacksSource(listStacksRequest: ListStacksRequest,
                       parallelism: Int = DefaultParallelism): Source[ListStacksResponse, NotUsed] =
    Source.single(listStacksRequest).via(listStacksFlow(parallelism))

  def listStacksFlow(parallelism: Int = DefaultParallelism): Flow[ListStacksRequest, ListStacksResponse, NotUsed] =
    Flow[ListStacksRequest].mapAsync(parallelism) { listStacksRequest =>
      underlying.listStacks(listStacksRequest)
    }

  def listStacksSource(): Source[ListStacksResponse, NotUsed] =
    Source.fromFuture(underlying.listStacks())

  def listStacksPaginatorSource: Source[ListStacksResponse, NotUsed] =
    Source.fromPublisher(underlying.listStacksPaginator())

  def listStacksPaginatorFlow: Flow[ListStacksRequest, ListStacksResponse, NotUsed] =
    Flow[ListStacksRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listStacksPaginator(request))
    }

  def setStackPolicySource(setStackPolicyRequest: SetStackPolicyRequest,
                           parallelism: Int = DefaultParallelism): Source[SetStackPolicyResponse, NotUsed] =
    Source.single(setStackPolicyRequest).via(setStackPolicyFlow(parallelism))

  def setStackPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SetStackPolicyRequest, SetStackPolicyResponse, NotUsed] =
    Flow[SetStackPolicyRequest].mapAsync(parallelism) { setStackPolicyRequest =>
      underlying.setStackPolicy(setStackPolicyRequest)
    }

  def signalResourceSource(signalResourceRequest: SignalResourceRequest,
                           parallelism: Int = DefaultParallelism): Source[SignalResourceResponse, NotUsed] =
    Source.single(signalResourceRequest).via(signalResourceFlow(parallelism))

  def signalResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SignalResourceRequest, SignalResourceResponse, NotUsed] =
    Flow[SignalResourceRequest].mapAsync(parallelism) { signalResourceRequest =>
      underlying.signalResource(signalResourceRequest)
    }

  def stopStackSetOperationSource(
      stopStackSetOperationRequest: StopStackSetOperationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StopStackSetOperationResponse, NotUsed] =
    Source.single(stopStackSetOperationRequest).via(stopStackSetOperationFlow(parallelism))

  def stopStackSetOperationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StopStackSetOperationRequest, StopStackSetOperationResponse, NotUsed] =
    Flow[StopStackSetOperationRequest].mapAsync(parallelism) { stopStackSetOperationRequest =>
      underlying.stopStackSetOperation(stopStackSetOperationRequest)
    }

  def updateStackSource(updateStackRequest: UpdateStackRequest,
                        parallelism: Int = DefaultParallelism): Source[UpdateStackResponse, NotUsed] =
    Source.single(updateStackRequest).via(updateStackFlow(parallelism))

  def updateStackFlow(parallelism: Int = DefaultParallelism): Flow[UpdateStackRequest, UpdateStackResponse, NotUsed] =
    Flow[UpdateStackRequest].mapAsync(parallelism) { updateStackRequest =>
      underlying.updateStack(updateStackRequest)
    }

  def updateStackInstancesSource(updateStackInstancesRequest: UpdateStackInstancesRequest,
                                 parallelism: Int = DefaultParallelism): Source[UpdateStackInstancesResponse, NotUsed] =
    Source.single(updateStackInstancesRequest).via(updateStackInstancesFlow(parallelism))

  def updateStackInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateStackInstancesRequest, UpdateStackInstancesResponse, NotUsed] =
    Flow[UpdateStackInstancesRequest].mapAsync(parallelism) { updateStackInstancesRequest =>
      underlying.updateStackInstances(updateStackInstancesRequest)
    }

  def updateStackSetSource(updateStackSetRequest: UpdateStackSetRequest,
                           parallelism: Int = DefaultParallelism): Source[UpdateStackSetResponse, NotUsed] =
    Source.single(updateStackSetRequest).via(updateStackSetFlow(parallelism))

  def updateStackSetFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateStackSetRequest, UpdateStackSetResponse, NotUsed] =
    Flow[UpdateStackSetRequest].mapAsync(parallelism) { updateStackSetRequest =>
      underlying.updateStackSet(updateStackSetRequest)
    }

  def updateTerminationProtectionSource(
      updateTerminationProtectionRequest: UpdateTerminationProtectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateTerminationProtectionResponse, NotUsed] =
    Source.single(updateTerminationProtectionRequest).via(updateTerminationProtectionFlow(parallelism))

  def updateTerminationProtectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateTerminationProtectionRequest, UpdateTerminationProtectionResponse, NotUsed] =
    Flow[UpdateTerminationProtectionRequest].mapAsync(parallelism) { updateTerminationProtectionRequest =>
      underlying.updateTerminationProtection(updateTerminationProtectionRequest)
    }

  def validateTemplateSource(validateTemplateRequest: ValidateTemplateRequest,
                             parallelism: Int = DefaultParallelism): Source[ValidateTemplateResponse, NotUsed] =
    Source.single(validateTemplateRequest).via(validateTemplateFlow(parallelism))

  def validateTemplateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ValidateTemplateRequest, ValidateTemplateResponse, NotUsed] =
    Flow[ValidateTemplateRequest].mapAsync(parallelism) { validateTemplateRequest =>
      underlying.validateTemplate(validateTemplateRequest)
    }

}
