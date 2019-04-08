// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeJobQueuesResponseBuilderOps(val self: DescribeJobQueuesResponse.Builder) extends AnyVal {

  final def jobQueuesAsScala(value: Option[Seq[JobQueueDetail]]): DescribeJobQueuesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.jobQueues(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeJobQueuesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeJobQueuesResponseOps(val self: DescribeJobQueuesResponse) extends AnyVal {

  final def jobQueuesAsScala: Option[Seq[JobQueueDetail]] = Option(self.jobQueues).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeJobQueuesResponseOps {

  implicit def toDescribeJobQueuesResponseBuilderOps(
      v: DescribeJobQueuesResponse.Builder
  ): DescribeJobQueuesResponseBuilderOps = new DescribeJobQueuesResponseBuilderOps(v)

  implicit def toDescribeJobQueuesResponseOps(v: DescribeJobQueuesResponse): DescribeJobQueuesResponseOps =
    new DescribeJobQueuesResponseOps(v)

}
