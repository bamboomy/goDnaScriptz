package genetic;
import java.util.ArrayList;
class Thought143 extends Thought{
private static ArrayList<Thought143> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 490.4941248006425;
private double fd1 = 995.4643481967652;
private Thought fo0 = null;
private Thought fo1 = null;
Thought143 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought143 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought143 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought143 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought143 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought143 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought143 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought143 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought143 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought143 instance = new Thought143 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought143 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought143 instance = new Thought143 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought143 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought143 instance = new Thought143 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought143 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought143 instance = new Thought143 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought143 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought143 instance = new Thought143 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought143 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought143 instance = new Thought143 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought143 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought143 instance = new Thought143 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought143 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought143 instance = new Thought143 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    if (fb1) {
        fb0 = fd0 > fd1;
        fb1 = fd0 > fd1;
        fb0 = !fb1;
        Thought lo0 = Thought295.getInstance(fb0, fb1, fb0, fb1);
        boolean lb1 = false;
        Thought lo2 = Thought37.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
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
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Output.points[4][1] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    Output.points[4][2] += fd1;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought270.getInstance();
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
        ab2 = !ab3;
        fd1 *= -1;
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        ab1 = !ab2;
        Thought lo2 = Thought81.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought155.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought249.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fd0 < fd1;
    ad1 *= -1;
    ad2 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb2 = true;
    boolean lb3 = true;
    ad1 = ad2 + ad3;
    lb2 = lb3 && fb0;
    fb1 = lb2 || lb3;
    fb0 = !fb1;
    ad4 = fd0 + fd1;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        lb0 = ab1 && ab2;
        double ld1 = 498.44428399715196;
        Thought lo2 = Thought285.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb0);
}
        ab1 = ad2 > ad3;
        ad4 = fd0 + fd1;
        ld1 *= -1;
        ab2 = ad1 < ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        lb0 = ad3 < ad4;
        boolean lb3 = true;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, ld1, ad1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        ab1 = fd1 < ld1;
        double ld4 = 808.9963736897957;
if(fo1 != null){
          fo1.m1();
}
        ld4 = ad1 + ad2;
        ad3 = ad4 - fd0;
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
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    double ld1 = 158.72964468460765;
    fb1 = lb0 && fb0;
    if (fb1) {
        ld1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld1, fd0);
}
        lb0 = fb0 || fb1;
        fd1 = ld1 - fd0;
        Thought lo2 = Thought238.getInstance(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
if(ao3 != null){
          ao3.m1();
}
        lb0 = ld1 > fd0;
        fb0 = !fb1;
        boolean lb3 = false;
if(fo0 != null){
          ao4 = fo0.m4(lb3, lb0, fb0, fb1);
}
        lb3 = fd1 > ld1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb3);
}
        Thought lo4 = Thought184.getInstance(fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb3);
        lb0 = ld1 > fd0;
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
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    boolean lb1 = true;
    Output.points[4][3] += ad1;
    lb0 = lb1 && fb0;
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, lb2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 && fb0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
        fb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = ab4 && fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    Thought lo0 = Thought173.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
    double ld1 = 543.9980206855344;
    boolean lb2 = false;
    boolean lb3 = true;
    Output.points[4][4] -= fd0;

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
    ab1 = ad1 > ad2;
    boolean lb0 = true;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[4][5] -= fd1;
if(ao2 != null){
      ao2.m2();
}
    ab2 = ab3 && ab4;
    Thought lo1 = Thought249.getInstance(fb0, fb1, lb0, ab1);
    ab2 = ab3 || ab4;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought153.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    fb1 = lb0 || ab1;
    Output.points[4][6] += ad3;
    Output.points[4][7] += ad4;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought298.getInstance();
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    double ld2 = 32.30641245395449;
    ld2 *= -1;

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
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    fd0 *= -1;
    ab4 = fb0 || fb1;
    double ld2 = 46.65225807586794;
    boolean lb3 = true;
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
    Thought lo4 = Thought1.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
if(fo1 != null){
      ld2 = fo1.m3();
}
    fd0 = fd1 + ld2;
    if (lb3) {
        double ld5 = 983.6453595545994;
if(fo0 != null){
          fo0.m1(ab1, ab2, ab3, ab4);
}
        fb0 = ld2 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld5, ld2, fd0, fd1, fb1, lb0, lb1, lb3);
}
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo0.m3(ld5, ld2, fd0, fd1, ab4, fb0, fb1, lb0);
}
        ld5 = ld2 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb3, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
return ab3;
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
    double ld0 = 942.8052794963156;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Output.points[4][8] += ld0;
    fb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
    fd0 *= -1;
    fd1 *= -1;
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(ld0, ad1, ad2, ad3);
}
        fb0 = ad4 < fd0;
        boolean lb1 = false;
        fb0 = !fb1;
        boolean lb2 = false;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought90.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
        ab1 = fd0 < fd1;
        double ld2 = 818.0807625361807;
        ld2 = ad1 - ad2;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          ad3 = fo1.m3(ab2, ab3, ab4, fb0);
}
        boolean lb3 = false;
        boolean lb4 = false;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, fb0, fb1, lb3, lb4);
}
        lb0 = ad1 < ad2;
        Output.points[5][0] -= ad3;
        double ld5 = 811.5035284635893;
if(fo1 != null){
          ab1 = fo1.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo6 = Thought235.getInstance(fo0, fo1, fo0, fo1, fb1, lb3, lb4, lb0);
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld7 = 905.4418817016473;
        ab2 = ab3 || ab4;
}
Thought.STACK_COUNTER++;
return lb0;
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
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    if (fb1) {
        fd0 *= -1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
        boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          lb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        double ld1 = 786.2561004838707;
        ld1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          fb0 = ao1.m2(fb1, lb0, fb0, fb1);
}
}
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
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    Thought lo1 = Thought263.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought253.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 *= -1;
    fb0 = fd1 < ad1;
    Output.points[5][1] += ad2;
    Thought lo3 = Thought141.getInstance(ad3, ad4, fd0, fd1);
    boolean lb4 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 345.3149148806771;
    for(int i0=0; i0<10; i0++){
        ld1 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        lb0 = ld1 < fd0;
        fd1 = ld1 + fd0;
if(fo0 != null){
          ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
        double ld2 = 447.1629263700524;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ld1, fb0, fb1, lb0, ab1);
}
        ab2 = !ab3;
        fd0 *= -1;
if(fo0 != null){
          ab4 = fo0.m2(fd1, ld2, ld1, fd0, fb0, fb1, lb0, ab1);
}
        ab2 = fd1 < ld2;
if(fo1 != null){
          ld1 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
}
Thought.STACK_COUNTER++;
return lb0;
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
    Thought lo0 = Thought191.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      ab2 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought60.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
    boolean lb2 = true;
    double ld3 = 524.8882248683523;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought379.getInstance(ao2, ao3, ao4, fo0);
    double ld5 = 982.061584737646;
if(ao1 != null){
      fo1 = ao1.m4(ld5, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3);
}
    Thought lo6 = Thought317.getInstance();
    ld5 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(lb2, ab1, ab2, ab3);
}
    boolean lb7 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo8 = Thought221.getInstance(fd0, fd1, ld3, ld5, lb2, lb7, ab1, ab2);
    ab3 = ad1 < ad2;
    ab4 = fb0 && fb1;
    lb2 = ad3 > ad4;
    Output.points[5][2] += fd0;
    boolean lb9 = true;
    Thought lo10 = Thought114.getInstance(ao3, ao4, fo0, fo1, lb7, lb9, ab1, ab2);
    ab3 = ab4 || fb0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 690.7483182761961;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[5][3] -= fd0;
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && fb0;
    ld0 = fd0 - fd1;
    fb1 = fb0 && fb1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    double ld1 = 628.0233722813905;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;
    fd1 = ld0 - ld1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    double ld0 = 750.2341682871995;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    Output.points[5][4] += ld0;
    Thought lo1 = Thought109.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 - ld0;
    double ld2 = 771.0697362881165;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    double ld3 = 318.5573105277989;
    for(int i0=0; i0<10; i0++){
        double ld4 = 674.1690268499628;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, ld3, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb5 = true;
        ab2 = !ab3;
        ab4 = fd1 < ld4;
        fb0 = fb1 && lb5;
        boolean lb6 = true;
}
Thought.STACK_COUNTER++;
return ld2;
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
        fb1 = !fb0;
    fb1 = fb0 && fb1;
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    double ld0 = 959.9241408114297;
    boolean lb1 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    Output.points[5][5] += ad1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fd1 < ad1;
    Output.points[5][6] -= ad2;
    ad3 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad3 *= -1;
    double ld2 = 690.8313751204428;
    ad3 *= -1;
    fb1 = lb0 || lb1;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld2, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
    lb3 = ab1 || ab2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought380.getInstance();
    fb1 = fd0 < fd1;
    Output.points[5][7] += fd0;
    fd1 *= -1;
    if (fb0) {
        fd0 = fd1 - fd0;
        boolean lb1 = false;
        fb0 = fd1 < fd0;
        Output.points[5][8] += fd1;
        fb1 = lb1 && fb0;
        double ld2 = 600.1856023669102;
        Thought lo3 = Thought240.getInstance(fb1, lb1, fb0, fb1);
        Output.points[6][0] += ld2;
        fd0 *= -1;
        fd1 *= -1;
        boolean lb4 = true;
        ld2 *= -1;
        lb1 = lb4 && fb0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, lb1, lb4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld2, fd0, fd1, lb1, lb4, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
            lb1 = lb4 && fb0;
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    double ld0 = 420.94028579216587;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1);
}
        fb0 = ad2 > ad3;
    fb1 = fb0 || fb1;
    double ld1 = 56.850357518590606;
    fb0 = !fb1;
    Thought lo2 = Thought362.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    double ld3 = 752.2510419832655;
    boolean lb4 = true;
    boolean lb5 = true;
    Output.points[6][1] += ld0;
    Thought lo6 = Thought365.getInstance();
    lb4 = ld1 < ld3;
    Thought lo7 = Thought347.getInstance(lb5, fb0, fb1, lb4);
    boolean lb8 = false;
    ad1 = ad2 - ad3;
    lb5 = lb8 || fb0;
    Output.points[6][2] -= ad4;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1, fb1, lb4, lb5, lb8);
}
    fb0 = ld3 > ad1;
if(ao4 != null){
      fb1 = ao4.m2(ad2, ad3, ad4, fd0, lb4, lb5, lb8, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo0 = Thought208.getInstance(fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
        lb1 = fd0 < fd1;
if(fo0 != null){
          fd0 = fo0.m3();
}
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        fd1 *= -1;
        fd0 = fd1 + fd0;
        if (lb1) {
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
            Output.points[6][3] += fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[6][4] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought332.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
    ad3 *= -1;
    double ld4 = 253.66642010407753;
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb0 = !lb1;
if(ao1 != null){
          fo1 = ao1.m4(lb2, ab1, ab2, ab3);
}
    if (ab4) {
        ad3 = ad4 - fd0;
        fb0 = !fb1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, ld4, ad1, ad2, lb0, lb1, lb2, ab1);
}
if(ao1 != null){
          ad3 = ao1.m3(ad4, fd0, fd1, ld4, ab2, ab3, ab4, fb0);
}
        boolean lb5 = false;
        boolean lb6 = true;
        boolean lb7 = true;
        Output.points[6][5] -= ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    if (fb1) {
        Thought lo0 = Thought181.getInstance();
        Thought lo1 = Thought98.getInstance(fb0, fb1, fb0, fb1);
        fb0 = fd1 > fd0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo2 = Thought61.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m3(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
        fb1 = fd0 > fd1;
        double ld3 = 258.30051003573914;
        fb0 = ld3 < fd0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 842.1679883205569;
    fb1 = !lb0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = !lb0;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fb1 = !lb0;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        Thought lo1 = Thought21.getInstance();
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        fd1 *= -1;
        lb0 = fb0 && fb1;
        boolean lb2 = true;
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
        lb2 = lb0 || fb0;
        fb1 = lb2 || lb0;
        ad1 = ad2 - ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought34.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    ab3 = fd0 > fd1;
    ab4 = ad1 > ad2;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    double ld1 = 594.47487158323;
    fb0 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    fb1 = lb0 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    fb1 = lb0 && fb0;
    Output.points[6][6] += ld1;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      ao2.m1(fb1, lb0, fb0, fb1);
}
    double ld2 = 401.72737758151254;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + ld1;

Thought.STACK_COUNTER++;
return ao2;
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
    double ld0 = 599.04385941981;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    fb0 = ad2 < ad3;
    Thought lo1 = Thought372.getInstance(ao2, ao3, ao4, fo0);
    fb1 = ad4 < fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
    double ld4 = 432.30141632873506;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
    Thought lo5 = Thought148.getInstance(lb3, fb0, fb1, lb2);

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
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought177.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    ab1 = fd0 < fd1;
    Output.points[6][7] += fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return ao1;
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
    ab2 = ad1 < ad2;
    ab3 = ad3 > ad4;
    Thought lo0 = Thought165.getInstance();
    fd0 *= -1;
    Thought lo1 = Thought32.getInstance(ab4, fb0, fb1, ab1);
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    if (ab1) {
if(ao1 != null){
          ao1.m1(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        Output.points[6][8] -= ad2;
        ad3 = ad4 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
        ab1 = ad2 < ad3;
        Thought lo2 = Thought14.getInstance();
        Thought lo3 = Thought394.getInstance(ab2, ab3, ab4, fb0);
        boolean lb4 = true;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb4, ab1);
}
        ad2 = ad3 + ad4;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        for(int i0=0; i0<10; i0++){
            Thought lo5 = Thought295.getInstance(fo0, fo1, ao1, ao2, fb1, lb4, ab1, ab2);
}}
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[7][0] -= fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
        fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo1 = Thought24.getInstance(fb1, lb0, fb0, fb1);
    fd0 *= -1;
    lb0 = fd1 < fd0;
        fb0 = fb1 || lb0;
    Thought lo2 = Thought141.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[7][1] -= fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought271.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    Output.points[7][2] += fd0;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    fd1 = fd0 + fd1;

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
    boolean lb0 = true;
    Thought lo1 = Thought326.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
