// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactWriteItem => ScalaTransactWriteItem, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TransactWriteItem => JavaTransactWriteItem }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactWriteItemOps {

  implicit class ScalaTransactWriteItemOps(val self: ScalaTransactWriteItem) extends AnyVal {

    def toJava: JavaTransactWriteItem = {
      val result = JavaTransactWriteItem.builder()
      self.conditionCheck.foreach { v =>
        import ConditionCheckOps._; result.conditionCheck(v.toJava)
      } // ConditionCheck
      self.put.foreach { v =>
        import PutOps._; result.put(v.toJava)
      } // Put
      self.delete.foreach { v =>
        import DeleteOps._; result.delete(v.toJava)
      } // Delete
      self.update.foreach { v =>
        import UpdateOps._; result.update(v.toJava)
      } // Update

      result.build()
    }

  }

  implicit class JavaTransactWriteItemOps(val self: JavaTransactWriteItem) extends AnyVal {

    def toScala: ScalaTransactWriteItem = {
      ScalaTransactWriteItem()
        .withConditionCheck(Option(self.conditionCheck).map { v =>
          import ConditionCheckOps._; v.toScala
        }) // ConditionCheck
        .withPut(Option(self.put).map { v =>
          import PutOps._; v.toScala
        }) // Put
        .withDelete(Option(self.delete).map { v =>
          import DeleteOps._; v.toScala
        }) // Delete
        .withUpdate(Option(self.update).map { v =>
          import UpdateOps._; v.toScala
        }) // Update
    }

  }

}
