// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ListJobsRequestBuilderOps(val self: ListJobsRequest.Builder) extends AnyVal {

  final def jobQueueAsScala(value: Option[String]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.jobQueue(v)
    }
  } // String

  final def arrayJobIdAsScala(value: Option[String]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.arrayJobId(v)
    }
  } // String

  final def multiNodeJobIdAsScala(value: Option[String]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.multiNodeJobId(v)
    }
  } // String

  final def jobStatusAsScala(value: Option[JobStatus]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.jobStatus(v)
    }
  } // JobStatus

  final def maxResultsAsScala(value: Option[Int]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListJobsRequestOps(val self: ListJobsRequest) extends AnyVal {

  final def jobQueueAsScala: Option[String] = Option(self.jobQueue) // String

  final def arrayJobIdAsScala: Option[String] = Option(self.arrayJobId) // String

  final def multiNodeJobIdAsScala: Option[String] = Option(self.multiNodeJobId) // String

  final def jobStatusAsScala: Option[JobStatus] = Option(self.jobStatus) // JobStatus

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListJobsRequestOps {

  implicit def toListJobsRequestBuilderOps(v: ListJobsRequest.Builder): ListJobsRequestBuilderOps =
    new ListJobsRequestBuilderOps(v)

  implicit def toListJobsRequestOps(v: ListJobsRequest): ListJobsRequestOps = new ListJobsRequestOps(v)

}
