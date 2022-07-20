package genetic;
import java.util.ArrayList;
class Thought79 extends Thought{
private static ArrayList<Thought79> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 427.8660635729719;
private double fd1 = 470.21234243008496;
private Thought fo0 = null;
private Thought fo1 = null;
Thought79 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought79 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought79 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought79 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought79 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought79 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought79 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought79 instance = new Thought79 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    double ld0 = 945.3530044481024;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
        fb1 = fd0 > fd1;
        double ld1 = 200.84047200130297;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld0, fd0, fd1);
}
        fb1 = fb0 || fb1;
        Thought lo2 = Thought375.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    ab3 = ab4 || fb0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought322.getInstance();
    ad1 = ad2 - ad3;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    ad4 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    double ld3 = 510.369990229076;
    fb0 = !fb1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld3, ad1);
}
    lb1 = lb2 && fb0;
    ad2 = ad3 - ad4;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1);
}
    Output.points[8][3] -= ad2;
    Thought lo5 = Thought174.getInstance();
    fb0 = fb1 || lb1;
        boolean lb6 = false;
    lb2 = lb4 || lb6;
    Thought lo7 = Thought303.getInstance(fb0, fb1, lb1, lb2);
    double ld8 = 657.3251805885859;
    boolean lb9 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][4] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab3 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    Thought lo1 = Thought8.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb3 = false;
    lb0 = !lb2;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb2 = fd0 > fd1;
    boolean lb4 = true;
    double ld5 = 868.4498369260223;
    ld5 *= -1;
    double ld6 = 42.76912749783594;
if(ao2 != null){
      ao2.m3(ld6, fd0, fd1, ld5);
}
    ld6 = fd0 - fd1;
    lb3 = lb4 || fb0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld5, ld6, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Thought lo0 = Thought156.getInstance();
    ad2 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = false;
    lb1 = ad2 < ad3;
    boolean lb2 = true;
    lb2 = !fb0;
    double ld3 = 951.0473629647576;
    fb1 = lb1 && lb2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    Output.points[8][5] += fd0;
    ab3 = !ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[8][6] += fd1;
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fb1 = ab1 && ab2;
    ab3 = fd0 < fd1;
    fd0 *= -1;
    Output.points[8][7] -= fd1;
if(fo0 != null){
      fo0.m1();
}
    ab4 = !fb0;
    fb1 = !ab1;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    boolean lb1 = true;
    double ld2 = 361.5730307339051;
        Thought lo3 = Thought9.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2, lb1, ab1, ab2, ab3);
    ad1 = ad2 - ad3;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, fb1, lb0, lb1, ab1);
}
    ad1 *= -1;
    Thought lo4 = Thought367.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    Thought lo5 = Thought59.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2);
}
    ad3 *= -1;
    fb1 = lb0 && lb1;
    Output.points[8][8] += ad4;
    ab1 = !ab2;
    Thought lo6 = Thought145.getInstance();
    ab3 = fd0 < fd1;
if(ao4 != null){
      ao4.m1(ab4, fb0, fb1, lb0);
}
    Thought lo7 = Thought173.getInstance(fo0, fo1, ao1, ao2, ld2, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
    ab4 = ad4 < fd0;
    Thought lo8 = Thought227.getInstance(fd1, ld2, ad1, ad2, fb0, fb1, lb0, lb1);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
    fb1 = lb0 && lb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    double ld0 = 600.9505683971901;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = fb0 || fb1;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought161.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    fd1 = fd0 + fd1;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[0][0] -= ad2;
    fb1 = ad3 > ad4;
    Output.points[0][1] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 417.6028922689169;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 557.0731281809402;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
    boolean lb1 = false;
    ab4 = ld0 > ad1;
    Output.points[0][2] -= ad2;
    double ld2 = 384.36595311229587;
    double ld3 = 122.7273787920992;
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, ld3, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    ad2 = ad3 - ad4;
    double ld4 = 500.8064706018786;
    ab4 = !fb0;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb1 = ad4 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(ld0, ld2, ld3, ld4);
}
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 989.8406656088407;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(lb1, lb2, fb0, fb1);
}
    lb1 = lb2 || fb0;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb1, lb1, lb2, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1, fb1, lb1, lb2, fb0);
}
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, lb2, fb0);
}
    fd1 = ld0 + fd0;
    fd1 *= -1;
    fb1 = !lb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      lb2 = ao4.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    Thought lo3 = Thought308.getInstance();
    fd1 *= -1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao1 != null){
      ad4 = ao1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought377.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought396.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought112.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = fb0 && fb1;
    ad1 *= -1;
    double ld3 = 392.39237762076874;
    fb0 = ad1 > ad2;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld3);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3);
}
    Thought lo4 = Thought162.getInstance();
    double ld5 = 334.0557451328673;
    boolean lb6 = false;
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return lb6;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
        Output.points[0][3] -= fd0;
    boolean lb0 = false;
    ab3 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = ab1 && ab2;
    double ld2 = 22.003934090014447;
        ab3 = !ab4;
    boolean lb3 = true;
if(ao2 != null){
      ab4 = ao2.m2(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    boolean lb0 = true;
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab4 = ad1 > ad2;
    ad3 = ad4 - fd0;
    Output.points[0][4] -= fd1;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
    Output.points[0][5] -= fd0;
    Thought lo1 = Thought142.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = true;
if(ao2 != null){
      ad4 = ao2.m3(ab4, fb0, fb1, lb0);
}
    double ld3 = 570.7867852794036;
    Thought lo4 = Thought209.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld3, lb2, ab1, ab2, ab3);
    Output.points[0][6] -= ad1;
if(ao1 != null){
      ab4 = ao1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld3, ad1, ad2);
}
    Output.points[0][7] += ad3;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld1 = 632.1933785402105;
    ld1 *= -1;
    Thought lo2 = Thought112.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    Thought lo3 = Thought312.getInstance(fo1, fo0, fo1, fo0);
        Output.points[0][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    Output.points[1][0] -= fd0;
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    fd0 *= -1;
    double ld0 = 755.6395582387828;
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
        fd0 *= -1;
    ab3 = ab4 && fb0;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1);
}
    double ld2 = 485.70823644203443;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1);
}
    boolean lb3 = true;
if(fo0 != null){
      ab2 = fo0.m2();
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb3);
}

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    Thought lo0 = Thought176.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld1 = 493.4883753822178;
if(fo0 != null){
      ad1 = fo0.m3();
}
    fb1 = ad2 > ad3;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld1;
    Output.points[1][1] += ad1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
    boolean lb2 = true;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    ab3 = ab4 || fb0;
    fb1 = ad4 > fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, lb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
    ab3 = fd0 > fd1;
        Thought lo2 = Thought86.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[1][2] -= ad1;
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    if (fb0) {
        fd0 *= -1;
        fb1 = lb0 || fb0;
        Thought lo1 = Thought389.getInstance();
        if (fb1) {
            lb0 = fd1 > fd0;
if(ao1 != null){
              fd1 = ao1.m3(fb0, fb1, lb0, fb0);
}
            boolean lb2 = true;
            double ld3 = 452.73978619959837;
            fb0 = fb1 && lb2;
            Thought lo4 = Thought397.getInstance(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld3, lb0, fb0, fb1, lb2);
            lb0 = fd0 < fd1;
            fb0 = fb1 && lb2;
            lb0 = ld3 > fd0;
if(ao1 != null){
              fo1 = ao1.m4(fd1, ld3, fd0, fd1, fb0, fb1, lb2, lb0);
}
}}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    ad2 *= -1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    if (fb0) {
        ad3 = ad4 - fd0;
        fb1 = fb0 || fb1;
        fd1 = ad1 + ad2;
        fb0 = !fb1;
        fb0 = ad3 > ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb1 = !fb0;
        double ld0 = 643.4346200253689;
        double ld1 = 464.50650254717925;
        fb1 = ad3 > ad4;
        fb0 = fb1 || fb0;
        Output.points[1][3] += fd0;
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    ab3 = fd1 < fd0;
    Output.points[1][4] += fd1;
    ab4 = fd0 < fd1;
    boolean lb2 = true;
    double ld3 = 997.340735839187;
if(ao4 != null){
      ld3 = ao4.m3();
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb1, lb2, ab1);
}
    if (ab2) {
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld3, fd0, fd1, ab4, fb0, fb1, lb0);
}
        ld3 = fd0 + fd1;
        ld3 *= -1;
        double ld4 = 209.3942249516205;
if(fo0 != null){
          fo0.m1(ld3, fd0, fd1, ld4, lb1, lb2, ab1, ab2);
}
        boolean lb5 = true;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb6 = false;
        Output.points[1][5] -= ld3;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    lb0 = ab1 || ab2;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    lb0 = lb1 && ab1;
    double ld2 = 373.96955394487094;
    for(int i0=0; i0<10; i0++){
        }
    ab2 = ad4 > fd0;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld2, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab4 = fb0 && fb1;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought69.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo4 = Thought136.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    lb2 = lb3 && fb0;
    fb1 = !lb1;
    lb2 = lb3 || fb0;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab1 = fo1.m2();
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought140.getInstance(ab2, ab3, ab4, fb0);
    double ld2 = 793.1019266394769;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ld2 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = ld2 + fd0;
    fd1 = ld2 + fd0;
    Thought lo3 = Thought318.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1);
}
    Output.points[1][6] += ld2;
    fd0 = fd1 - ld2;
    fd0 *= -1;
    Thought lo4 = Thought374.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
    ab1 = !ab2;
    ld2 = fd0 + fd1;
    ab3 = ab4 && fb0;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad1 *= -1;
    fb1 = !fb0;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought74.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    Output.points[1][7] += fd0;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
    boolean lb2 = false;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    if (lb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo3 = Thought327.getInstance(fb0, fb1, lb1, lb2);
        fb0 = fd1 > ad1;
        double ld4 = 275.0109353556929;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
    boolean lb0 = true;
    fd1 = ad1 - ad2;
        fb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
}
        ab3 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (ab2) {
        double ld1 = 115.07207357765752;
        Thought lo2 = Thought177.getInstance(ad1, ad2, ad3, ad4);
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    Thought lo0 = Thought39.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    Output.points[1][8] -= fd1;
    Output.points[2][0] += fd0;
    boolean lb2 = false;
    Thought lo3 = Thought42.getInstance();
    lb1 = !lb2;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(lb1, lb2, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb1 = lb2 || fb0;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
    boolean lb5 = false;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, lb4, lb5, fb0, fb1);
}
    boolean lb6 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb1, lb2, lb4, lb5);
}
    lb6 = fb0 || fb1;
    if (lb1) {
        fd0 = fd1 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        lb2 = lb4 && lb5;
        lb6 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao3.m2();
}
if(ao4 != null){
          lb1 = ao4.m2(lb2, lb4, lb5, lb6);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][1] -= ad2;
    Thought lo0 = Thought193.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought276.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    fb0 = ad3 < ad4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
    fb1 = ad4 > fd0;
    Thought lo3 = Thought183.getInstance(lb1, fb0, fb1, lb1);
    double ld4 = 119.68814070180343;
    fb0 = fd0 > fd1;
    fb1 = ld4 > ad1;
    boolean lb5 = false;
    Output.points[2][2] -= ad2;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb5, fb0, fb1, lb1);
}
    Thought lo6 = Thought69.getInstance(ld4, ad1, ad2, ad3, lb5, fb0, fb1, lb1);
    Thought lo7 = Thought127.getInstance(fo1, ao1, ao2, ao3, lb5, fb0, fb1, lb1);
    Thought lo8 = Thought302.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    lb5 = !fb0;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = fd1 < fd0;
    Output.points[2][3] -= fd1;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ab2 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            for(int i2=0; i2<10; i2++){
}}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    fb1 = fd1 > ad1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[2][4] -= fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    Thought lo2 = Thought331.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    Thought lo3 = Thought6.getInstance();
    Thought lo4 = Thought267.getInstance(lb0, lb1, ab1, ab2);

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 638.104345639736;
    ld0 = fd0 - fd1;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 164.0053710071356;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld2 = 859.1070070664806;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 || fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[2][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 354.08236131623136;
    fd0 = fd1 + ld0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought41.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    ld0 = fd0 + fd1;
    fb1 = fb0 && fb1;
    double ld2 = 425.2695598710855;
    double ld3 = 927.8118853445775;
if(fo0 != null){
      fb0 = fo0.m2(ld0, ld2, ld3, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ld3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
