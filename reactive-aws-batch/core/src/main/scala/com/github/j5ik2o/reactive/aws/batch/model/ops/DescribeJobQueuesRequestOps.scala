// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeJobQueuesRequestBuilderOps(val self: DescribeJobQueuesRequest.Builder) extends AnyVal {

  final def jobQueuesAsScala(value: Option[Seq[String]]): DescribeJobQueuesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.jobQueues(v.asJava)
    } // Seq[String]
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeJobQueuesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): DescribeJobQueuesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeJobQueuesRequestOps(val self: DescribeJobQueuesRequest) extends AnyVal {

  final def jobQueuesAsScala: Option[Seq[String]] = Option(self.jobQueues).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeJobQueuesRequestOps {

  implicit def toDescribeJobQueuesRequestBuilderOps(
      v: DescribeJobQueuesRequest.Builder
  ): DescribeJobQueuesRequestBuilderOps = new DescribeJobQueuesRequestBuilderOps(v)

  implicit def toDescribeJobQueuesRequestOps(v: DescribeJobQueuesRequest): DescribeJobQueuesRequestOps =
    new DescribeJobQueuesRequestOps(v)

}
