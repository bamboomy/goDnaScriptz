package genetic;
import java.util.ArrayList;
class Thought57 extends Thought{
private static ArrayList<Thought57> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 127.5437031006097;
private double fd1 = 129.68241426312;
private Thought fo0 = null;
private Thought fo1 = null;
Thought57 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought57 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought57 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought57 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought57 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    Thought lo1 = Thought139.getInstance();
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    Output.points[2][5] -= fd1;
    fd0 *= -1;
    boolean lb2 = true;
    lb0 = fd1 > fd0;
    Output.points[2][6] += fd1;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    boolean lb4 = true;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, lb4, fb0);
}
    fb1 = fd0 < fd1;

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
    Thought lo0 = Thought156.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    double ld1 = 751.4455228963018;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ld1 *= -1;
    ab4 = fb0 && fb1;
    ab1 = fd0 < fd1;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    ab2 = ab3 || ab4;
    fd1 = ld1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 + ad3;
    Output.points[2][7] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[2][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Output.points[3][0] += ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought307.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Thought lo1 = Thought198.getInstance();
    ad3 *= -1;
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[3][1] -= ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought104.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
    Thought lo2 = Thought11.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    boolean lb3 = false;
    ad1 = ad2 + ad3;
    if (ab4) {
        ad4 = fd0 - fd1;
        Thought lo4 = Thought194.getInstance(fo0, fo1, fo0, fo1);
        Thought lo5 = Thought23.getInstance(ad1, ad2, ad3, ad4);
        fb0 = fb1 && lb0;
        lb3 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ab2 = ab3 || ab4;
        fb0 = fb1 && lb0;
        lb3 = ad3 < ad4;
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
    Thought lo0 = Thought261.getInstance();
    boolean lb1 = false;
    Thought lo2 = Thought387.getInstance(lb1, fb0, fb1, lb1);
    Output.points[3][2] -= fd0;
    for(int i0=0; i0<10; i0++){
        double ld3 = 891.0547133251712;
        fd0 = fd1 + ld3;
        fb0 = fb1 && lb1;
        fd0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld3, fd0, fd1, fb0, fb1, lb1, fb0);
}
        fb1 = ld3 > fd0;
        lb1 = fb0 && fb1;
        Thought lo4 = Thought218.getInstance(fd1, ld3, fd0, fd1, lb1, fb0, fb1, lb1);
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Output.points[3][3] -= fd0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    lb0 = !fb0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
    double ld2 = 988.0999592568637;
    double ld3 = 448.97190949071467;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb0 && lb1;
    Thought lo4 = Thought129.getInstance(fb0, fb1, lb0, lb1);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld3, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;

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
      ao2.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
    if (fb1) {
        ab1 = fd1 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        ab3 = fd1 < fd0;
        ab4 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        fd1 *= -1;
        boolean lb0 = false;
        ab2 = fd0 < fd1;
        boolean lb1 = false;
        fd0 = fd1 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = !lb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        ab4 = !fb0;
if(ao3 != null){
          ao3.m2(fd0, fd1, fd0, fd1);
}
        fb1 = !lb0;
        lb1 = ab1 || ab2;
        Output.points[3][4] += fd0;
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
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[3][5] += fd1;
    boolean lb0 = true;
    ab1 = !ab2;
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ao2.m3(ab3, ab4, fb0, fb1);
}
    Output.points[3][6] += ad1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
    Output.points[3][7] -= ad3;
    ad4 = fd0 - fd1;
    fb0 = fb1 || lb0;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    Output.points[3][8] -= ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m3(ad3, ad4, fd0, fd1);
}
        fb0 = fb1 || lb0;
        Output.points[4][0] -= ad1;
        }
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
    double ld1 = 249.75831224986243;

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
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[4][1] -= fd0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    lb0 = lb1 || fb0;
    double ld2 = 3.2339501633923193;
    double ld3 = 316.40222295019845;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
    Output.points[4][2] += ld3;
    fb1 = fd0 > fd1;
    double ld4 = 454.7657703802912;
    ld2 = ld3 + ld4;
    Thought lo5 = Thought137.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
    lb0 = fd0 > fd1;
    double ld6 = 491.45295519995335;
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
    fb1 = ld2 < ld3;
    ld4 = ld6 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld7 = 190.99912996806546;

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
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld0 = 381.19455588454946;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought218.getInstance();
    Thought lo2 = Thought334.getInstance(ab1, ab2, ab3, ab4);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    double ld3 = 248.76586371313948;
    ab1 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ld3 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ld0 < ld3;
    ab1 = !ab2;

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
    fb1 = fb0 || fb1;
    Output.points[4][3] += ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    double ld0 = 40.76511818530745;
        boolean lb1 = true;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ad4 *= -1;
    Thought lo2 = Thought263.getInstance();
    fd0 = fd1 - ld0;
    lb1 = fb0 && fb1;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2, lb1, fb0, fb1, lb1);
}
    ad3 *= -1;

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
    double ld0 = 594.6556855460996;
    boolean lb1 = false;
    ld0 = ad1 - ad2;
    Thought lo2 = Thought31.getInstance(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
    ab4 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
    fb1 = ld0 < ad1;
    lb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ab1 = !ab2;
    Output.points[4][4] -= ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 - fd0;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought140.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    if (lb0) {
        Thought lo2 = Thought243.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo1 != null){
          lb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo1 != null){
          fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought269.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
    double ld1 = 457.6263836805358;
    ad3 *= -1;
    double ld2 = 119.65992831750835;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ao2.m2(fb1, fb0, fb1, fb0);
}
    ld1 *= -1;
    fb1 = fb0 || fb1;
    ld2 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 = ld1 - ld2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought299.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    boolean lb1 = true;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 885.5546982646703;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
}
        fb0 = fd0 < fd1;
        boolean lb3 = true;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb3, lb1);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
        Output.points[4][5] -= fd0;
        fd1 = ld2 - fd0;
if(ao3 != null){
          fd1 = ao3.m3(ld2, fd0, fd1, ld2, fb0, fb1, lb3, lb1);
}
        fd0 = fd1 - ld2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb3;
        lb1 = !ab1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fd0 *= -1;
        ab2 = fd1 < ld2;
        if (ab3) {
if(ao4 != null){
              ao4.m3(fd0, fd1, ld2, fd0);
}
            fd1 = ld2 + fd0;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
    double ld1 = 462.4030890667882;
    ad4 *= -1;
    lb0 = ab1 || ab2;
    fd0 = fd1 - ld1;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought368.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
    fd0 = fd1 + ld1;
    boolean lb3 = false;
    ad1 = ad2 - ad3;
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld1, fb1, lb0, lb3, ab1);
}
    ab2 = ad1 < ad2;
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return ab2;
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
    fd1 = fd0 - fd1;
    double ld0 = 850.5145481463857;
    fb1 = fb0 || fb1;
    Output.points[4][6] += ld0;
    boolean lb1 = true;
    fd0 = fd1 + ld0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    lb1 = fd1 < ld0;
    Output.points[4][7] += fd0;
    fd1 = ld0 - fd0;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld0 = fd0 + fd1;
    Thought lo2 = Thought167.getInstance(fb1, lb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought363.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb1 = ab1 || ab2;
    Thought lo1 = Thought177.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    ab3 = ab4 && fb0;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought333.getInstance();
    fd1 = fd0 + fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 646.364258276412;
    if (fb1) {
if(fo1 != null){
          fo1.m3(ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        Thought lo2 = Thought132.getInstance(fo1, fo0, fo1, fo0);
        fd0 *= -1;
        boolean lb3 = false;
if(fo1 != null){
          fo1.m1(fd1, ld1, ad1, ad2);
}
        fb0 = ad3 > ad4;
        Thought lo4 = Thought55.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
        Output.points[4][8] -= ad2;
        fb1 = ad3 > ad4;
if(fo0 != null){
          fd0 = fo0.m3();
}
        boolean lb5 = false;
if(fo0 != null){
          fo1 = fo0.m4(lb3, lb5, lb0, fb0);
}
        fb1 = lb3 && lb5;
        Output.points[5][0] -= fd1;
        boolean lb6 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, lb6, lb0, fb0, fb1);
}
        lb3 = ad4 < fd0;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought134.getInstance(fo1, fo0, fo1, fo0);
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = ad3 < ad4;
    Output.points[5][1] += fd0;
    ab4 = !fb0;
    fb1 = fd1 < ad1;
    ab1 = ab2 && ab3;
        Output.points[5][2] += ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return ad4;
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
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[5][3] -= fd1;
    double ld0 = 788.1903156962695;
    fb0 = ld0 > fd0;
if(ao1 != null){
      fb1 = ao1.m2(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    Thought lo1 = Thought304.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[5][4] += ad2;
    boolean lb0 = false;
    ad3 = ad4 + fd0;
    double ld1 = 609.9088885211121;
    Thought lo2 = Thought102.getInstance(fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld3 = 400.802372261599;
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb4 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        fd0 *= -1;
        Thought lo1 = Thought344.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
        ab1 = fd1 > fd0;
        boolean lb2 = true;
        fd1 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && ab1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        ab2 = fd1 > ad1;
if(ao2 != null){
          ab3 = ao2.m2();
}
        boolean lb0 = false;
        }
    ab4 = fb0 && fb1;
    if (ab1) {
if(ao3 != null){
          ao3.m3(ab2, ab3, ab4, fb0);
}
        if (fb1) {
            ab1 = ad2 < ad3;
}}
Thought.STACK_COUNTER++;
return ad4;
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 541.5115655710508;
    double ld1 = 187.39578253038565;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    ld1 *= -1;
    Output.points[5][5] += fd0;
    Output.points[5][6] -= fd1;
if(fo0 != null){
      fo0.m2(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ld0 = ld1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1);
}
    Thought lo2 = Thought203.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld3 = 10.34773369508217;

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
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought180.getInstance();
        boolean lb1 = true;
if(fo0 != null){
          ab4 = fo0.m2(fb0, fb1, lb1, ab1);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        Output.points[5][7] += fd1;
        fb1 = lb1 || ab1;
        double ld2 = 133.39904153133554;
        ab2 = !ab3;
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
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
    ad3 *= -1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought201.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = ad4 < fd0;
    boolean lb2 = false;
    fd1 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
    boolean lb4 = true;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought297.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    double ld2 = 412.1410801865737;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld2 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo3 = Thought81.getInstance(ab1, ab2, ab3, ab4);
    boolean lb4 = true;
    Thought lo5 = Thought267.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2, ab4, fb0, fb1, lb1);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb4, ab1, ab2, ab3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 515.898175858972;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    if (lb1) {
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
        fb0 = ld0 > fd0;
        fb1 = lb1 || fb0;
        Thought lo2 = Thought386.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
        fb1 = !lb1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        fb0 = ld0 < fd0;
if(fo1 != null){
          fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
        fd1 = ld0 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
        fb1 = lb1 && fb0;
        fb1 = !lb1;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
        fd0 = fd1 - ld0;
        Thought lo3 = Thought388.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
        fd1 *= -1;
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb4 = true;
        double ld5 = 413.53040763384024;
}
Thought.STACK_COUNTER++;
return ao4;
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
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[5][8] += ad1;
    fb1 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought274.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd0 = fd1 + ad1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    boolean lb2 = true;
    fd1 *= -1;
    ad1 *= -1;
    Output.points[6][0] += ad2;
    double ld3 = 312.2007896224073;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    boolean lb4 = false;
    fd1 = ld3 + ad1;
    boolean lb5 = false;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 482.1244299862161;
    boolean lb1 = false;
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao4.m2(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    boolean lb2 = false;
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ao4;
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
    Output.points[6][1] += ad2;
    Output.points[6][2] -= ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab2 = !ab3;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    if (ab4) {
        fb0 = ad1 < ad2;
        fb1 = ad3 < ad4;
if(ao1 != null){
          ao1.m3();
}
        boolean lb0 = false;
        lb0 = fd0 > fd1;
}
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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought363.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
    double ld4 = 445.58710590506115;
    fd0 *= -1;
    boolean lb5 = true;

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
    fb0 = fd0 < fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought51.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    Thought lo1 = Thought82.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
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
    Output.points[6][3] -= fd0;
    Thought lo0 = Thought99.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
        double ld1 = 153.60989360432134;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought129.getInstance(ld1, fd0, fd1, ld1);
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    Thought lo4 = Thought340.getInstance();
    fb0 = ld1 > fd0;
    Thought lo5 = Thought307.getInstance(fb1, lb3, fb0, fb1);
        lb3 = !fb0;
    boolean lb6 = false;
    fd1 *= -1;
    boolean lb7 = false;
    lb7 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb3, lb6, lb7, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, lb3, lb6, lb7);
}
    fb0 = fb1 || lb3;
    lb6 = fd1 < ld1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb7, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld8 = 401.9333913856061;

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
