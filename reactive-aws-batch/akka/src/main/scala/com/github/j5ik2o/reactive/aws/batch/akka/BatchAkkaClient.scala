// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.batch.BatchAsyncClient
import software.amazon.awssdk.services.batch.model._
import software.amazon.awssdk.services.batch.paginators._

object BatchAkkaClient {

  def apply(asyncClient: BatchAsyncClient): BatchAkkaClient =
    new BatchAkkaClient {
      override val underlying: BatchAsyncClient = asyncClient
    }

  val DefaultParallelism: Int = 1

}

trait BatchAkkaClient {

  import BatchAkkaClient._

  val underlying: BatchAsyncClient

  def cancelJobSource(
      cancelJobRequest: CancelJobRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CancelJobResponse, NotUsed] =
    Source.single(cancelJobRequest).via(cancelJobFlow(parallelism))

  def cancelJobFlow(parallelism: Int = DefaultParallelism): Flow[CancelJobRequest, CancelJobResponse, NotUsed] =
    Flow[CancelJobRequest].mapAsync(parallelism) { cancelJobRequest =>
      underlying.cancelJob(cancelJobRequest)
    }

  def createComputeEnvironmentSource(
      createComputeEnvironmentRequest: CreateComputeEnvironmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateComputeEnvironmentResponse, NotUsed] =
    Source.single(createComputeEnvironmentRequest).via(createComputeEnvironmentFlow(parallelism))

  def createComputeEnvironmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateComputeEnvironmentRequest, CreateComputeEnvironmentResponse, NotUsed] =
    Flow[CreateComputeEnvironmentRequest].mapAsync(parallelism) { createComputeEnvironmentRequest =>
      underlying.createComputeEnvironment(createComputeEnvironmentRequest)
    }

  def createJobQueueSource(
      createJobQueueRequest: CreateJobQueueRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateJobQueueResponse, NotUsed] =
    Source.single(createJobQueueRequest).via(createJobQueueFlow(parallelism))

  def createJobQueueFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateJobQueueRequest, CreateJobQueueResponse, NotUsed] =
    Flow[CreateJobQueueRequest].mapAsync(parallelism) { createJobQueueRequest =>
      underlying.createJobQueue(createJobQueueRequest)
    }

  def deleteComputeEnvironmentSource(
      deleteComputeEnvironmentRequest: DeleteComputeEnvironmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteComputeEnvironmentResponse, NotUsed] =
    Source.single(deleteComputeEnvironmentRequest).via(deleteComputeEnvironmentFlow(parallelism))

  def deleteComputeEnvironmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteComputeEnvironmentRequest, DeleteComputeEnvironmentResponse, NotUsed] =
    Flow[DeleteComputeEnvironmentRequest].mapAsync(parallelism) { deleteComputeEnvironmentRequest =>
      underlying.deleteComputeEnvironment(deleteComputeEnvironmentRequest)
    }

  def deleteJobQueueSource(
      deleteJobQueueRequest: DeleteJobQueueRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteJobQueueResponse, NotUsed] =
    Source.single(deleteJobQueueRequest).via(deleteJobQueueFlow(parallelism))

  def deleteJobQueueFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteJobQueueRequest, DeleteJobQueueResponse, NotUsed] =
    Flow[DeleteJobQueueRequest].mapAsync(parallelism) { deleteJobQueueRequest =>
      underlying.deleteJobQueue(deleteJobQueueRequest)
    }

  def deregisterJobDefinitionSource(
      deregisterJobDefinitionRequest: DeregisterJobDefinitionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeregisterJobDefinitionResponse, NotUsed] =
    Source.single(deregisterJobDefinitionRequest).via(deregisterJobDefinitionFlow(parallelism))

  def deregisterJobDefinitionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeregisterJobDefinitionRequest, DeregisterJobDefinitionResponse, NotUsed] =
    Flow[DeregisterJobDefinitionRequest].mapAsync(parallelism) { deregisterJobDefinitionRequest =>
      underlying.deregisterJobDefinition(deregisterJobDefinitionRequest)
    }

  def describeComputeEnvironmentsSource(
      describeComputeEnvironmentsRequest: DescribeComputeEnvironmentsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeComputeEnvironmentsResponse, NotUsed] =
    Source.single(describeComputeEnvironmentsRequest).via(describeComputeEnvironmentsFlow(parallelism))

  def describeComputeEnvironmentsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeComputeEnvironmentsRequest, DescribeComputeEnvironmentsResponse, NotUsed] =
    Flow[DescribeComputeEnvironmentsRequest].mapAsync(parallelism) { describeComputeEnvironmentsRequest =>
      underlying.describeComputeEnvironments(describeComputeEnvironmentsRequest)
    }

  def describeComputeEnvironmentsSource(): Source[DescribeComputeEnvironmentsResponse, NotUsed] =
    Source.fromFuture(underlying.describeComputeEnvironments())

  def describeComputeEnvironmentsPaginatorSource: Source[DescribeComputeEnvironmentsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeComputeEnvironmentsPaginator())

  def describeComputeEnvironmentsPaginatorFlow
      : Flow[DescribeComputeEnvironmentsRequest, DescribeComputeEnvironmentsResponse, NotUsed] =
    Flow[DescribeComputeEnvironmentsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeComputeEnvironmentsPaginator(request))
    }

  def describeJobDefinitionsSource(
      describeJobDefinitionsRequest: DescribeJobDefinitionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeJobDefinitionsResponse, NotUsed] =
    Source.single(describeJobDefinitionsRequest).via(describeJobDefinitionsFlow(parallelism))

  def describeJobDefinitionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeJobDefinitionsRequest, DescribeJobDefinitionsResponse, NotUsed] =
    Flow[DescribeJobDefinitionsRequest].mapAsync(parallelism) { describeJobDefinitionsRequest =>
      underlying.describeJobDefinitions(describeJobDefinitionsRequest)
    }

  def describeJobDefinitionsSource(): Source[DescribeJobDefinitionsResponse, NotUsed] =
    Source.fromFuture(underlying.describeJobDefinitions())

  def describeJobDefinitionsPaginatorSource: Source[DescribeJobDefinitionsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeJobDefinitionsPaginator())

  def describeJobDefinitionsPaginatorFlow
      : Flow[DescribeJobDefinitionsRequest, DescribeJobDefinitionsResponse, NotUsed] =
    Flow[DescribeJobDefinitionsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeJobDefinitionsPaginator(request))
    }

  def describeJobQueuesSource(
      describeJobQueuesRequest: DescribeJobQueuesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeJobQueuesResponse, NotUsed] =
    Source.single(describeJobQueuesRequest).via(describeJobQueuesFlow(parallelism))

  def describeJobQueuesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeJobQueuesRequest, DescribeJobQueuesResponse, NotUsed] =
    Flow[DescribeJobQueuesRequest].mapAsync(parallelism) { describeJobQueuesRequest =>
      underlying.describeJobQueues(describeJobQueuesRequest)
    }

  def describeJobQueuesSource(): Source[DescribeJobQueuesResponse, NotUsed] =
    Source.fromFuture(underlying.describeJobQueues())

  def describeJobQueuesPaginatorSource: Source[DescribeJobQueuesResponse, NotUsed] =
    Source.fromPublisher(underlying.describeJobQueuesPaginator())

  def describeJobQueuesPaginatorFlow: Flow[DescribeJobQueuesRequest, DescribeJobQueuesResponse, NotUsed] =
    Flow[DescribeJobQueuesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeJobQueuesPaginator(request))
    }

  def describeJobsSource(
      describeJobsRequest: DescribeJobsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeJobsResponse, NotUsed] =
    Source.single(describeJobsRequest).via(describeJobsFlow(parallelism))

  def describeJobsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeJobsRequest, DescribeJobsResponse, NotUsed] =
    Flow[DescribeJobsRequest].mapAsync(parallelism) { describeJobsRequest =>
      underlying.describeJobs(describeJobsRequest)
    }

  def listJobsSource(
      listJobsRequest: ListJobsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListJobsResponse, NotUsed] =
    Source.single(listJobsRequest).via(listJobsFlow(parallelism))

  def listJobsFlow(parallelism: Int = DefaultParallelism): Flow[ListJobsRequest, ListJobsResponse, NotUsed] =
    Flow[ListJobsRequest].mapAsync(parallelism) { listJobsRequest =>
      underlying.listJobs(listJobsRequest)
    }

  def listJobsPaginatorFlow: Flow[ListJobsRequest, ListJobsResponse, NotUsed] =
    Flow[ListJobsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listJobsPaginator(request))
    }

  def registerJobDefinitionSource(
      registerJobDefinitionRequest: RegisterJobDefinitionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RegisterJobDefinitionResponse, NotUsed] =
    Source.single(registerJobDefinitionRequest).via(registerJobDefinitionFlow(parallelism))

  def registerJobDefinitionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RegisterJobDefinitionRequest, RegisterJobDefinitionResponse, NotUsed] =
    Flow[RegisterJobDefinitionRequest].mapAsync(parallelism) { registerJobDefinitionRequest =>
      underlying.registerJobDefinition(registerJobDefinitionRequest)
    }

  def submitJobSource(
      submitJobRequest: SubmitJobRequest,
      parallelism: Int = DefaultParallelism
  ): Source[SubmitJobResponse, NotUsed] =
    Source.single(submitJobRequest).via(submitJobFlow(parallelism))

  def submitJobFlow(parallelism: Int = DefaultParallelism): Flow[SubmitJobRequest, SubmitJobResponse, NotUsed] =
    Flow[SubmitJobRequest].mapAsync(parallelism) { submitJobRequest =>
      underlying.submitJob(submitJobRequest)
    }

  def terminateJobSource(
      terminateJobRequest: TerminateJobRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TerminateJobResponse, NotUsed] =
    Source.single(terminateJobRequest).via(terminateJobFlow(parallelism))

  def terminateJobFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[TerminateJobRequest, TerminateJobResponse, NotUsed] =
    Flow[TerminateJobRequest].mapAsync(parallelism) { terminateJobRequest =>
      underlying.terminateJob(terminateJobRequest)
    }

  def updateComputeEnvironmentSource(
      updateComputeEnvironmentRequest: UpdateComputeEnvironmentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateComputeEnvironmentResponse, NotUsed] =
    Source.single(updateComputeEnvironmentRequest).via(updateComputeEnvironmentFlow(parallelism))

  def updateComputeEnvironmentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateComputeEnvironmentRequest, UpdateComputeEnvironmentResponse, NotUsed] =
    Flow[UpdateComputeEnvironmentRequest].mapAsync(parallelism) { updateComputeEnvironmentRequest =>
      underlying.updateComputeEnvironment(updateComputeEnvironmentRequest)
    }

  def updateJobQueueSource(
      updateJobQueueRequest: UpdateJobQueueRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateJobQueueResponse, NotUsed] =
    Source.single(updateJobQueueRequest).via(updateJobQueueFlow(parallelism))

  def updateJobQueueFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateJobQueueRequest, UpdateJobQueueResponse, NotUsed] =
    Flow[UpdateJobQueueRequest].mapAsync(parallelism) { updateJobQueueRequest =>
      underlying.updateJobQueue(updateJobQueueRequest)
    }

}
