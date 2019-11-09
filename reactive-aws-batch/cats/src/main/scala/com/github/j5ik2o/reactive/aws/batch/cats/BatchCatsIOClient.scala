// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.batch.{ BatchAsyncClient, BatchClient }
import software.amazon.awssdk.services.batch.model._
import software.amazon.awssdk.services.batch.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object BatchCatsIOClient {

  def apply(asyncClient: BatchAsyncClient)(implicit ec: ExecutionContext): BatchCatsIOClient = new BatchCatsIOClient {
    override val executionContext: ExecutionContext = ec
    override val underlying: BatchAsyncClient       = asyncClient
  }

}

trait BatchCatsIOClient extends BatchClient[IO] {

  val underlying: BatchAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def cancelJob(cancelJobRequest: CancelJobRequest): IO[CancelJobResponse] =
    IO.fromFuture {
      IO(underlying.cancelJob(cancelJobRequest))
    }

  override def createComputeEnvironment(
      createComputeEnvironmentRequest: CreateComputeEnvironmentRequest
  ): IO[CreateComputeEnvironmentResponse] =
    IO.fromFuture {
      IO(underlying.createComputeEnvironment(createComputeEnvironmentRequest))
    }

  override def createJobQueue(createJobQueueRequest: CreateJobQueueRequest): IO[CreateJobQueueResponse] =
    IO.fromFuture {
      IO(underlying.createJobQueue(createJobQueueRequest))
    }

  override def deleteComputeEnvironment(
      deleteComputeEnvironmentRequest: DeleteComputeEnvironmentRequest
  ): IO[DeleteComputeEnvironmentResponse] =
    IO.fromFuture {
      IO(underlying.deleteComputeEnvironment(deleteComputeEnvironmentRequest))
    }

  override def deleteJobQueue(deleteJobQueueRequest: DeleteJobQueueRequest): IO[DeleteJobQueueResponse] =
    IO.fromFuture {
      IO(underlying.deleteJobQueue(deleteJobQueueRequest))
    }

  override def deregisterJobDefinition(
      deregisterJobDefinitionRequest: DeregisterJobDefinitionRequest
  ): IO[DeregisterJobDefinitionResponse] =
    IO.fromFuture {
      IO(underlying.deregisterJobDefinition(deregisterJobDefinitionRequest))
    }

  override def describeComputeEnvironments(
      describeComputeEnvironmentsRequest: DescribeComputeEnvironmentsRequest
  ): IO[DescribeComputeEnvironmentsResponse] =
    IO.fromFuture {
      IO(underlying.describeComputeEnvironments(describeComputeEnvironmentsRequest))
    }

  override def describeComputeEnvironments(): IO[DescribeComputeEnvironmentsResponse] =
    IO.fromFuture {
      IO(underlying.describeComputeEnvironments())
    }

  def describeComputeEnvironmentsPaginator(): DescribeComputeEnvironmentsPublisher =
    underlying.describeComputeEnvironmentsPaginator()

  def describeComputeEnvironmentsPaginator(
      describeComputeEnvironmentsRequest: DescribeComputeEnvironmentsRequest
  ): DescribeComputeEnvironmentsPublisher =
    underlying.describeComputeEnvironmentsPaginator(describeComputeEnvironmentsRequest)

  override def describeJobDefinitions(
      describeJobDefinitionsRequest: DescribeJobDefinitionsRequest
  ): IO[DescribeJobDefinitionsResponse] =
    IO.fromFuture {
      IO(underlying.describeJobDefinitions(describeJobDefinitionsRequest))
    }

  override def describeJobDefinitions(): IO[DescribeJobDefinitionsResponse] =
    IO.fromFuture {
      IO(underlying.describeJobDefinitions())
    }

  def describeJobDefinitionsPaginator(): DescribeJobDefinitionsPublisher =
    underlying.describeJobDefinitionsPaginator()

  def describeJobDefinitionsPaginator(
      describeJobDefinitionsRequest: DescribeJobDefinitionsRequest
  ): DescribeJobDefinitionsPublisher =
    underlying.describeJobDefinitionsPaginator(describeJobDefinitionsRequest)

  override def describeJobQueues(describeJobQueuesRequest: DescribeJobQueuesRequest): IO[DescribeJobQueuesResponse] =
    IO.fromFuture {
      IO(underlying.describeJobQueues(describeJobQueuesRequest))
    }

  override def describeJobQueues(): IO[DescribeJobQueuesResponse] =
    IO.fromFuture {
      IO(underlying.describeJobQueues())
    }

  def describeJobQueuesPaginator(): DescribeJobQueuesPublisher =
    underlying.describeJobQueuesPaginator()

  def describeJobQueuesPaginator(describeJobQueuesRequest: DescribeJobQueuesRequest): DescribeJobQueuesPublisher =
    underlying.describeJobQueuesPaginator(describeJobQueuesRequest)

  override def describeJobs(describeJobsRequest: DescribeJobsRequest): IO[DescribeJobsResponse] =
    IO.fromFuture {
      IO(underlying.describeJobs(describeJobsRequest))
    }

  override def listJobs(listJobsRequest: ListJobsRequest): IO[ListJobsResponse] =
    IO.fromFuture {
      IO(underlying.listJobs(listJobsRequest))
    }

  def listJobsPaginator(listJobsRequest: ListJobsRequest): ListJobsPublisher =
    underlying.listJobsPaginator(listJobsRequest)

  override def registerJobDefinition(
      registerJobDefinitionRequest: RegisterJobDefinitionRequest
  ): IO[RegisterJobDefinitionResponse] =
    IO.fromFuture {
      IO(underlying.registerJobDefinition(registerJobDefinitionRequest))
    }

  override def submitJob(submitJobRequest: SubmitJobRequest): IO[SubmitJobResponse] =
    IO.fromFuture {
      IO(underlying.submitJob(submitJobRequest))
    }

  override def terminateJob(terminateJobRequest: TerminateJobRequest): IO[TerminateJobResponse] =
    IO.fromFuture {
      IO(underlying.terminateJob(terminateJobRequest))
    }

  override def updateComputeEnvironment(
      updateComputeEnvironmentRequest: UpdateComputeEnvironmentRequest
  ): IO[UpdateComputeEnvironmentResponse] =
    IO.fromFuture {
      IO(underlying.updateComputeEnvironment(updateComputeEnvironmentRequest))
    }

  override def updateJobQueue(updateJobQueueRequest: UpdateJobQueueRequest): IO[UpdateJobQueueResponse] =
    IO.fromFuture {
      IO(underlying.updateJobQueue(updateJobQueueRequest))
    }

}
