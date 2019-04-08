// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UlimitBuilderOps(val self: Ulimit.Builder) extends AnyVal {

  final def nameAsScala(value: Option[UlimitName]): Ulimit.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def softLimitAsScala(value: Option[Int]): Ulimit.Builder = {
    value.fold(self) { v =>
      self.softLimit(v)
    }
  }

  final def hardLimitAsScala(value: Option[Int]): Ulimit.Builder = {
    value.fold(self) { v =>
      self.hardLimit(v)
    }
  }

}

final class UlimitOps(val self: Ulimit) extends AnyVal {

  final def nameAsScala: Option[UlimitName] = Option(self.name)

  final def softLimitAsScala: Option[Int] = Option(self.softLimit)

  final def hardLimitAsScala: Option[Int] = Option(self.hardLimit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUlimitOps {

  implicit def toUlimitBuilderOps(v: Ulimit.Builder): UlimitBuilderOps = new UlimitBuilderOps(v)

  implicit def toUlimitOps(v: Ulimit): UlimitOps = new UlimitOps(v)

}
