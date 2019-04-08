// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeJobDefinitionsResponseBuilderOps(val self: DescribeJobDefinitionsResponse.Builder) extends AnyVal {

  final def jobDefinitionsAsScala(value: Option[Seq[JobDefinition]]): DescribeJobDefinitionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.jobDefinitions(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeJobDefinitionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeJobDefinitionsResponseOps(val self: DescribeJobDefinitionsResponse) extends AnyVal {

  final def jobDefinitionsAsScala: Option[Seq[JobDefinition]] = Option(self.jobDefinitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeJobDefinitionsResponseOps {

  implicit def toDescribeJobDefinitionsResponseBuilderOps(
      v: DescribeJobDefinitionsResponse.Builder
  ): DescribeJobDefinitionsResponseBuilderOps = new DescribeJobDefinitionsResponseBuilderOps(v)

  implicit def toDescribeJobDefinitionsResponseOps(
      v: DescribeJobDefinitionsResponse
  ): DescribeJobDefinitionsResponseOps = new DescribeJobDefinitionsResponseOps(v)

}
