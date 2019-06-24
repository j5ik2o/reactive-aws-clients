// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetsResponseBuilderOps(val self: DescribeFleetsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeFleetsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fleetsAsScala(value: Option[Seq[FleetData]]): DescribeFleetsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.fleets(v.asJava)
    }
  }

}

final class DescribeFleetsResponseOps(val self: DescribeFleetsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fleetsAsScala: Option[Seq[FleetData]] = Option(self.fleets).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetsResponseOps {

  implicit def toDescribeFleetsResponseBuilderOps(v: DescribeFleetsResponse.Builder): DescribeFleetsResponseBuilderOps =
    new DescribeFleetsResponseBuilderOps(v)

  implicit def toDescribeFleetsResponseOps(v: DescribeFleetsResponse): DescribeFleetsResponseOps =
    new DescribeFleetsResponseOps(v)

}
