// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.batch.model._
import software.amazon.awssdk.services.batch.paginators._
import software.amazon.awssdk.services.batch.{ BatchClient => JavaBatchSyncClient }

object BatchSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaBatchSyncClient): BatchSyncClient =
    new BatchSyncClient {
      override val underlying: JavaBatchSyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/batch/BatchClient.html
  */
trait BatchSyncClient extends BatchClient[Either[Throwable, ?]] {
  val underlying: JavaBatchSyncClient

  import BatchSyncClient._

  override def cancelJob(cancelJobRequest: CancelJobRequest): Either[Throwable, CancelJobResponse] =
    underlying.cancelJob(cancelJobRequest).toEither

  override def createComputeEnvironment(
      createComputeEnvironmentRequest: CreateComputeEnvironmentRequest
  ): Either[Throwable, CreateComputeEnvironmentResponse] =
    underlying.createComputeEnvironment(createComputeEnvironmentRequest).toEither

  override def createJobQueue(createJobQueueRequest: CreateJobQueueRequest): Either[Throwable, CreateJobQueueResponse] =
    underlying.createJobQueue(createJobQueueRequest).toEither

  override def deleteComputeEnvironment(
      deleteComputeEnvironmentRequest: DeleteComputeEnvironmentRequest
  ): Either[Throwable, DeleteComputeEnvironmentResponse] =
    underlying.deleteComputeEnvironment(deleteComputeEnvironmentRequest).toEither

  override def deleteJobQueue(deleteJobQueueRequest: DeleteJobQueueRequest): Either[Throwable, DeleteJobQueueResponse] =
    underlying.deleteJobQueue(deleteJobQueueRequest).toEither

  override def deregisterJobDefinition(
      deregisterJobDefinitionRequest: DeregisterJobDefinitionRequest
  ): Either[Throwable, DeregisterJobDefinitionResponse] =
    underlying.deregisterJobDefinition(deregisterJobDefinitionRequest).toEither

  override def describeComputeEnvironments(): Either[Throwable, DescribeComputeEnvironmentsResponse] =
    underlying.describeComputeEnvironments().toEither

  override def describeComputeEnvironments(
      describeComputeEnvironmentsRequest: DescribeComputeEnvironmentsRequest
  ): Either[Throwable, DescribeComputeEnvironmentsResponse] =
    underlying.describeComputeEnvironments(describeComputeEnvironmentsRequest).toEither

  def describeComputeEnvironmentsPaginator(): DescribeComputeEnvironmentsIterable =
    underlying.describeComputeEnvironmentsPaginator()

  def describeComputeEnvironmentsPaginator(
      describeComputeEnvironmentsRequest: DescribeComputeEnvironmentsRequest
  ): DescribeComputeEnvironmentsIterable =
    underlying.describeComputeEnvironmentsPaginator(describeComputeEnvironmentsRequest)

  override def describeJobDefinitions(): Either[Throwable, DescribeJobDefinitionsResponse] =
    underlying.describeJobDefinitions().toEither

  override def describeJobDefinitions(
      describeJobDefinitionsRequest: DescribeJobDefinitionsRequest
  ): Either[Throwable, DescribeJobDefinitionsResponse] =
    underlying.describeJobDefinitions(describeJobDefinitionsRequest).toEither

  def describeJobDefinitionsPaginator(): DescribeJobDefinitionsIterable =
    underlying.describeJobDefinitionsPaginator()

  def describeJobDefinitionsPaginator(
      describeJobDefinitionsRequest: DescribeJobDefinitionsRequest
  ): DescribeJobDefinitionsIterable =
    underlying.describeJobDefinitionsPaginator(describeJobDefinitionsRequest)

  override def describeJobQueues(): Either[Throwable, DescribeJobQueuesResponse] =
    underlying.describeJobQueues().toEither

  override def describeJobQueues(
      describeJobQueuesRequest: DescribeJobQueuesRequest
  ): Either[Throwable, DescribeJobQueuesResponse] =
    underlying.describeJobQueues(describeJobQueuesRequest).toEither

  def describeJobQueuesPaginator(): DescribeJobQueuesIterable =
    underlying.describeJobQueuesPaginator()

  def describeJobQueuesPaginator(describeJobQueuesRequest: DescribeJobQueuesRequest): DescribeJobQueuesIterable =
    underlying.describeJobQueuesPaginator(describeJobQueuesRequest)

  override def describeJobs(describeJobsRequest: DescribeJobsRequest): Either[Throwable, DescribeJobsResponse] =
    underlying.describeJobs(describeJobsRequest).toEither

  override def listJobs(listJobsRequest: ListJobsRequest): Either[Throwable, ListJobsResponse] =
    underlying.listJobs(listJobsRequest).toEither

  def listJobsPaginator(listJobsRequest: ListJobsRequest): ListJobsIterable =
    underlying.listJobsPaginator(listJobsRequest)

  override def registerJobDefinition(
      registerJobDefinitionRequest: RegisterJobDefinitionRequest
  ): Either[Throwable, RegisterJobDefinitionResponse] =
    underlying.registerJobDefinition(registerJobDefinitionRequest).toEither

  override def submitJob(submitJobRequest: SubmitJobRequest): Either[Throwable, SubmitJobResponse] =
    underlying.submitJob(submitJobRequest).toEither

  override def terminateJob(terminateJobRequest: TerminateJobRequest): Either[Throwable, TerminateJobResponse] =
    underlying.terminateJob(terminateJobRequest).toEither

  override def updateComputeEnvironment(
      updateComputeEnvironmentRequest: UpdateComputeEnvironmentRequest
  ): Either[Throwable, UpdateComputeEnvironmentResponse] =
    underlying.updateComputeEnvironment(updateComputeEnvironmentRequest).toEither

  override def updateJobQueue(updateJobQueueRequest: UpdateJobQueueRequest): Either[Throwable, UpdateJobQueueResponse] =
    underlying.updateJobQueue(updateJobQueueRequest).toEither

}
