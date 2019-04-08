// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.batch.{ BatchAsyncClient, BatchClient }
import software.amazon.awssdk.services.batch.model._

import scala.concurrent.{ ExecutionContext, Future }

object BatchCatsIOClient {

  def apply(asyncClient: BatchAsyncClient): BatchCatsIOClient = new BatchCatsIOClient {
    override val underlying: BatchAsyncClient = asyncClient
  }

}

trait BatchCatsIOClient extends BatchClient[IO] {

  val underlying: BatchAsyncClient

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

  override def describeJobQueues(describeJobQueuesRequest: DescribeJobQueuesRequest): IO[DescribeJobQueuesResponse] =
    IO.fromFuture {
      IO(underlying.describeJobQueues(describeJobQueuesRequest))
    }

  override def describeJobQueues(): IO[DescribeJobQueuesResponse] =
    IO.fromFuture {
      IO(underlying.describeJobQueues())
    }

  override def describeJobs(describeJobsRequest: DescribeJobsRequest): IO[DescribeJobsResponse] =
    IO.fromFuture {
      IO(underlying.describeJobs(describeJobsRequest))
    }

  override def listJobs(listJobsRequest: ListJobsRequest): IO[ListJobsResponse] =
    IO.fromFuture {
      IO(underlying.listJobs(listJobsRequest))
    }

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
