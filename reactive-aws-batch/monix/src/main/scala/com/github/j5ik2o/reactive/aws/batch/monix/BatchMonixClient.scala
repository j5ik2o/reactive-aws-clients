// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.monix

import software.amazon.awssdk.services.batch.model._
import software.amazon.awssdk.services.batch.paginators._
import com.github.j5ik2o.reactive.aws.batch.{ BatchAsyncClient, BatchClient }
import monix.eval.Task
import monix.reactive.Observable

object BatchMonixClient {

  def apply(asyncClient: BatchAsyncClient): BatchMonixClient =
    new BatchMonixClient {
      override val underlying: BatchAsyncClient = asyncClient
    }

}

trait BatchMonixClient extends BatchClient[Task] {

  val underlying: BatchAsyncClient

  override def cancelJob(cancelJobRequest: CancelJobRequest): Task[CancelJobResponse] =
    Task.deferFuture {
      underlying.cancelJob(cancelJobRequest)
    }

  override def createComputeEnvironment(
      createComputeEnvironmentRequest: CreateComputeEnvironmentRequest
  ): Task[CreateComputeEnvironmentResponse] =
    Task.deferFuture {
      underlying.createComputeEnvironment(createComputeEnvironmentRequest)
    }

  override def createJobQueue(createJobQueueRequest: CreateJobQueueRequest): Task[CreateJobQueueResponse] =
    Task.deferFuture {
      underlying.createJobQueue(createJobQueueRequest)
    }

  override def deleteComputeEnvironment(
      deleteComputeEnvironmentRequest: DeleteComputeEnvironmentRequest
  ): Task[DeleteComputeEnvironmentResponse] =
    Task.deferFuture {
      underlying.deleteComputeEnvironment(deleteComputeEnvironmentRequest)
    }

  override def deleteJobQueue(deleteJobQueueRequest: DeleteJobQueueRequest): Task[DeleteJobQueueResponse] =
    Task.deferFuture {
      underlying.deleteJobQueue(deleteJobQueueRequest)
    }

  override def deregisterJobDefinition(
      deregisterJobDefinitionRequest: DeregisterJobDefinitionRequest
  ): Task[DeregisterJobDefinitionResponse] =
    Task.deferFuture {
      underlying.deregisterJobDefinition(deregisterJobDefinitionRequest)
    }

  override def describeComputeEnvironments(
      describeComputeEnvironmentsRequest: DescribeComputeEnvironmentsRequest
  ): Task[DescribeComputeEnvironmentsResponse] =
    Task.deferFuture {
      underlying.describeComputeEnvironments(describeComputeEnvironmentsRequest)
    }

  override def describeComputeEnvironments(): Task[DescribeComputeEnvironmentsResponse] =
    Task.deferFuture {
      underlying.describeComputeEnvironments()
    }

  def describeComputeEnvironmentsPaginator(): Observable[DescribeComputeEnvironmentsResponse] =
    Observable.fromReactivePublisher(underlying.describeComputeEnvironmentsPaginator())

  def describeComputeEnvironmentsPaginator(
      describeComputeEnvironmentsRequest: DescribeComputeEnvironmentsRequest
  ): Observable[DescribeComputeEnvironmentsResponse] =
    Observable.fromReactivePublisher(
      underlying.describeComputeEnvironmentsPaginator(describeComputeEnvironmentsRequest)
    )

  override def describeJobDefinitions(
      describeJobDefinitionsRequest: DescribeJobDefinitionsRequest
  ): Task[DescribeJobDefinitionsResponse] =
    Task.deferFuture {
      underlying.describeJobDefinitions(describeJobDefinitionsRequest)
    }

  override def describeJobDefinitions(): Task[DescribeJobDefinitionsResponse] =
    Task.deferFuture {
      underlying.describeJobDefinitions()
    }

  def describeJobDefinitionsPaginator(): Observable[DescribeJobDefinitionsResponse] =
    Observable.fromReactivePublisher(underlying.describeJobDefinitionsPaginator())

  def describeJobDefinitionsPaginator(
      describeJobDefinitionsRequest: DescribeJobDefinitionsRequest
  ): Observable[DescribeJobDefinitionsResponse] =
    Observable.fromReactivePublisher(underlying.describeJobDefinitionsPaginator(describeJobDefinitionsRequest))

  override def describeJobQueues(describeJobQueuesRequest: DescribeJobQueuesRequest): Task[DescribeJobQueuesResponse] =
    Task.deferFuture {
      underlying.describeJobQueues(describeJobQueuesRequest)
    }

  override def describeJobQueues(): Task[DescribeJobQueuesResponse] =
    Task.deferFuture {
      underlying.describeJobQueues()
    }

  def describeJobQueuesPaginator(): Observable[DescribeJobQueuesResponse] =
    Observable.fromReactivePublisher(underlying.describeJobQueuesPaginator())

  def describeJobQueuesPaginator(
      describeJobQueuesRequest: DescribeJobQueuesRequest
  ): Observable[DescribeJobQueuesResponse] =
    Observable.fromReactivePublisher(underlying.describeJobQueuesPaginator(describeJobQueuesRequest))

  override def describeJobs(describeJobsRequest: DescribeJobsRequest): Task[DescribeJobsResponse] =
    Task.deferFuture {
      underlying.describeJobs(describeJobsRequest)
    }

  override def listJobs(listJobsRequest: ListJobsRequest): Task[ListJobsResponse] =
    Task.deferFuture {
      underlying.listJobs(listJobsRequest)
    }

  def listJobsPaginator(listJobsRequest: ListJobsRequest): Observable[ListJobsResponse] =
    Observable.fromReactivePublisher(underlying.listJobsPaginator(listJobsRequest))

  override def registerJobDefinition(
      registerJobDefinitionRequest: RegisterJobDefinitionRequest
  ): Task[RegisterJobDefinitionResponse] =
    Task.deferFuture {
      underlying.registerJobDefinition(registerJobDefinitionRequest)
    }

  override def submitJob(submitJobRequest: SubmitJobRequest): Task[SubmitJobResponse] =
    Task.deferFuture {
      underlying.submitJob(submitJobRequest)
    }

  override def terminateJob(terminateJobRequest: TerminateJobRequest): Task[TerminateJobResponse] =
    Task.deferFuture {
      underlying.terminateJob(terminateJobRequest)
    }

  override def updateComputeEnvironment(
      updateComputeEnvironmentRequest: UpdateComputeEnvironmentRequest
  ): Task[UpdateComputeEnvironmentResponse] =
    Task.deferFuture {
      underlying.updateComputeEnvironment(updateComputeEnvironmentRequest)
    }

  override def updateJobQueue(updateJobQueueRequest: UpdateJobQueueRequest): Task[UpdateJobQueueResponse] =
    Task.deferFuture {
      underlying.updateJobQueue(updateJobQueueRequest)
    }

}
