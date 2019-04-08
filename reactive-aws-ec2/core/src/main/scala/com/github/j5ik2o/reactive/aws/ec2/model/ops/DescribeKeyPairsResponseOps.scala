// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeKeyPairsResponseBuilderOps(val self: DescribeKeyPairsResponse.Builder) extends AnyVal {

  final def keyPairsAsScala(value: Option[Seq[KeyPairInfo]]): DescribeKeyPairsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keyPairs(v.asJava)
    }
  }

}

final class DescribeKeyPairsResponseOps(val self: DescribeKeyPairsResponse) extends AnyVal {

  final def keyPairsAsScala: Option[Seq[KeyPairInfo]] = Option(self.keyPairs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeKeyPairsResponseOps {

  implicit def toDescribeKeyPairsResponseBuilderOps(
      v: DescribeKeyPairsResponse.Builder
  ): DescribeKeyPairsResponseBuilderOps = new DescribeKeyPairsResponseBuilderOps(v)

  implicit def toDescribeKeyPairsResponseOps(v: DescribeKeyPairsResponse): DescribeKeyPairsResponseOps =
    new DescribeKeyPairsResponseOps(v)

}
