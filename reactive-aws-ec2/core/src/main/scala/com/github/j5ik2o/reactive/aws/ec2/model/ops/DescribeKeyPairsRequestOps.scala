// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeKeyPairsRequestBuilderOps(val self: DescribeKeyPairsRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeKeyPairsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def keyNamesAsScala(value: Option[Seq[String]]): DescribeKeyPairsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keyNames(v.asJava)
    }
  }

}

final class DescribeKeyPairsRequestOps(val self: DescribeKeyPairsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def keyNamesAsScala: Option[Seq[String]] = Option(self.keyNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeKeyPairsRequestOps {

  implicit def toDescribeKeyPairsRequestBuilderOps(
      v: DescribeKeyPairsRequest.Builder
  ): DescribeKeyPairsRequestBuilderOps = new DescribeKeyPairsRequestBuilderOps(v)

  implicit def toDescribeKeyPairsRequestOps(v: DescribeKeyPairsRequest): DescribeKeyPairsRequestOps =
    new DescribeKeyPairsRequestOps(v)

}
