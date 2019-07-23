// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyHostsResponseBuilderOps(val self: ModifyHostsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala(value: Option[Seq[String]]): ModifyHostsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successful(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala(value: Option[Seq[UnsuccessfulItem]]): ModifyHostsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessful(v.asJava)
    }
  }

}

final class ModifyHostsResponseOps(val self: ModifyHostsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala: Option[Seq[String]] = Option(self.successful).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] = Option(self.unsuccessful).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyHostsResponseOps {

  implicit def toModifyHostsResponseBuilderOps(v: ModifyHostsResponse.Builder): ModifyHostsResponseBuilderOps =
    new ModifyHostsResponseBuilderOps(v)

  implicit def toModifyHostsResponseOps(v: ModifyHostsResponse): ModifyHostsResponseOps = new ModifyHostsResponseOps(v)

}
