// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeInstancesHealthResponseBuilderOps(val self: DescribeInstancesHealthResponse.Builder)
    extends AnyVal {

  final def instanceHealthListAsScala(
      value: Option[Seq[SingleInstanceHealth]]
  ): DescribeInstancesHealthResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceHealthList(v.asJava)
    }
  }

  final def refreshedAtAsScala(value: Option[java.time.Instant]): DescribeInstancesHealthResponse.Builder = {
    value.fold(self) { v =>
      self.refreshedAt(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeInstancesHealthResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeInstancesHealthResponseOps(val self: DescribeInstancesHealthResponse) extends AnyVal {

  final def instanceHealthListAsScala: Option[Seq[SingleInstanceHealth]] = Option(self.instanceHealthList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def refreshedAtAsScala: Option[java.time.Instant] = Option(self.refreshedAt)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstancesHealthResponseOps {

  implicit def toDescribeInstancesHealthResponseBuilderOps(
      v: DescribeInstancesHealthResponse.Builder
  ): DescribeInstancesHealthResponseBuilderOps = new DescribeInstancesHealthResponseBuilderOps(v)

  implicit def toDescribeInstancesHealthResponseOps(
      v: DescribeInstancesHealthResponse
  ): DescribeInstancesHealthResponseOps = new DescribeInstancesHealthResponseOps(v)

}
