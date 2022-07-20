package genetic;
import java.util.ArrayList;
class Thought351 extends Thought{
private static ArrayList<Thought351> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 578.7142995872108;
private double fd1 = 22.18271454897505;
private Thought fo0 = null;
private Thought fo1 = null;
Thought351 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought351 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought351 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought351 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought351 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought351 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought351 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought351 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought351 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought351 instance = new Thought351 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought351 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought351 instance = new Thought351 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought351 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought351 instance = new Thought351 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought351 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought351 instance = new Thought351 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought351 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought351 instance = new Thought351 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought351 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought351 instance = new Thought351 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought351 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought351 instance = new Thought351 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought351 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought351 instance = new Thought351 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Output.points[3][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought277.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    double ld1 = 1000.5263058189555;
    Thought lo2 = Thought356.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought207.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
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
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
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
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        boolean lb0 = true;
if(fo0 != null){
          fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        if (lb0) {
            if (fb0) {
                fb1 = ad1 < ad2;
                lb0 = ad3 < ad4;
                fb0 = fb1 || lb0;
                fd0 *= -1;
                boolean lb1 = false;
                Thought lo2 = Thought110.getInstance();
if(fo0 != null){
                  fo1 = fo0.m4(lb0, fb0, fb1, lb1);
}
if(fo1 != null){
                  fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb1);
}
                ad4 = fd0 + fd1;
if(fo0 != null){
                  ad1 = fo0.m3(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb1);
}
                double ld3 = 422.851343061138;
                lb0 = fd0 > fd1;
                ld3 = ad1 + ad2;
                fb0 = fb1 || lb1;
                ad3 = ad4 + fd0;
}}}
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought16.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    double ld1 = 702.6290478740248;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ld1 = fo0.m3(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    ab2 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    double ld2 = 856.7202965258479;
    ad4 *= -1;
    fd0 = fd1 - ld1;
    ld2 *= -1;
    Thought lo3 = Thought263.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    Output.points[3][6] += ad1;

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
    Output.points[3][7] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
    lb0 = !fb0;
    Output.points[3][8] += fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    Output.points[4][0] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Output.points[4][1] += fd0;
    boolean lb1 = true;
    fd1 *= -1;
    double ld2 = 761.1330604486913;
    fb0 = fb1 || lb0;
    double ld3 = 117.11358875429211;

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
    boolean lb0 = false;
    Thought lo1 = Thought19.getInstance();
    fb0 = fb1 || lb0;
    Thought lo2 = Thought298.getInstance(fb0, fb1, lb0, fb0);
    Thought lo3 = Thought366.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
    lb0 = fd0 > fd1;
    ad1 *= -1;
    boolean lb4 = true;
    lb4 = fb0 && fb1;
    lb0 = lb4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb0, lb4, fb0);
}
    boolean lb5 = true;
    double ld6 = 935.587124708641;
    fb0 = fd0 > fd1;
    double ld7 = 551.8857641667269;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, lb4, lb5);
}
    boolean lb8 = true;
    ld6 = ld7 - ad1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    lb8 = fb0 && fb1;
    boolean lb9 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld6, ld7, ad1);
}
    ad2 = ad3 - ad4;
    double ld10 = 888.7809051484154;
    Output.points[4][2] += ad4;
    Thought lo11 = Thought264.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld6, ld7);

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
    Thought lo0 = Thought34.getInstance();
    Thought lo1 = Thought35.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Output.points[4][3] -= fd0;
    ab3 = !ab4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[4][4] -= fd1;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 807.4707012408306;
        ld0 *= -1;
    boolean lb1 = true;
    Thought lo2 = Thought364.getInstance();
    ad1 *= -1;
    Output.points[4][5] += ad2;
    Output.points[4][6] += ad3;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ad4 < fd0;

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
    fb0 = !fb1;
    Thought lo0 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 303.3766072338269;
    fd0 *= -1;
    double ld2 = 296.9562914074021;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
    ld2 = fd0 - fd1;
    Thought lo3 = Thought306.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(ld1, ld2, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
    ld1 = ld2 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 > ld1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ld2 > fd0;
    fb0 = fd1 < ld1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld1, ld2, fb0, fb1, fb0, fb1);
}
    double ld4 = 427.92457942677004;
    Thought lo5 = Thought322.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Output.points[4][7] -= ld4;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][8] -= fd1;
    Thought lo0 = Thought59.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought381.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    Output.points[5][0] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][1] += ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    double ld0 = 184.538064323707;
    ld0 *= -1;
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 *= -1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      ad3 = fo0.m3(lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought122.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
    ad1 *= -1;
    double ld3 = 49.15961732964674;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
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
    double ld0 = 236.00978877882196;
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
    ab4 = fb0 || fb1;
        ad4 = fd0 + fd1;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;

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
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought157.getInstance(fb0, fb1, fb0, fb1);
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = !fb0;
    double ld2 = 39.94378831016274;
    Thought lo3 = Thought173.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
    lb1 = ld2 < fd0;
    fb0 = fd1 < ld2;
    Thought lo4 = Thought60.getInstance(ao3, ao4, fo0, fo1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
          ao3.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[5][2] -= ad1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        fb0 = ad2 < ad3;
        fb1 = !lb0;
        double ld1 = 649.1234202128769;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought70.getInstance(ao2, ao3, ao4, fo0);
    fd1 = fd0 + fd1;
    Thought lo1 = Thought140.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld2 = 425.59119479361993;
if(fo1 != null){
      ld2 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb0 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    boolean lb2 = false;
    lb2 = ab1 && ab2;
    Thought lo3 = Thought273.getInstance(ad2, ad3, ad4, fd0);

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought88.getInstance();
    boolean lb2 = false;
    fb0 = fb1 && lb0;
    fd1 *= -1;
    boolean lb3 = true;
    boolean lb4 = true;
    boolean lb5 = true;

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
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ab3 = ab4 && fb0;
    fb1 = fd1 > fd0;
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    ad1 *= -1;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 217.14211296132962;
    Thought lo1 = Thought18.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    Output.points[5][3] -= fd1;
    boolean lb2 = true;
    if (fb0) {
        fb1 = ld0 > ad1;
        double ld3 = 916.549249064161;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld3, ld0);
}
        fb1 = !lb2;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m2();
}
if(fo1 != null){
          fo1.m3(fb0, fb1, lb2, fb0);
}
        Output.points[5][4] += fd0;
        fd1 *= -1;
        ld3 *= -1;
        fb1 = ld0 > ad1;
        lb2 = !fb0;
        boolean lb4 = false;
        fb0 = fb1 && lb4;
}
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
    Thought lo0 = Thought359.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    Output.points[5][5] += ad4;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
    ab4 = fd0 < fd1;
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4);
}
    boolean lb5 = false;
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        fd0 = fd1 - ad1;
        double ld6 = 793.1717033560241;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 450.7793988507541;
    boolean lb1 = true;
    ld0 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 *= -1;
    lb1 = fb0 && fb1;
    boolean lb2 = true;
    boolean lb3 = true;
    fd1 = ld0 + fd0;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    boolean lb4 = true;
    lb1 = ld0 < fd0;
    lb2 = fd1 > ld0;
    double ld5 = 833.6416725600276;
if(ao4 != null){
      ao3 = ao4.m4(lb3, lb4, fb0, fb1);
}
    lb1 = ld5 > fd0;
        fd1 = ld0 - ld5;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld5, fd0, fd1, ld0, lb2, lb3, lb4, fb0);
}
if(fo0 != null){
      ld5 = fo0.m3(fd0, fd1, ld0, ld5, fb1, lb1, lb2, lb3);
}
if(fo1 != null){
      lb4 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb2);
}
    lb3 = !lb4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo6 = Thought199.getInstance(fd0, fd1, ld0, ld5);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld5, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought389.getInstance();
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 179.39055269409172;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
if(ao2 != null){
          fd1 = ao2.m3(ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        boolean lb2 = true;
        lb2 = ad4 > fd0;
        Output.points[5][6] -= fd1;
        ld1 *= -1;
        Thought lo3 = Thought62.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
        Thought lo4 = Thought331.getInstance(ao1, ao2, ao3, ao4);
        ad1 = ad2 - ad3;
        Thought lo5 = Thought314.getInstance(ad4, fd0, fd1, ld1);
        Thought lo6 = Thought271.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
        boolean lb7 = true;
        fb0 = fd0 < fd1;
        fb1 = ld1 < ad1;
        boolean lb8 = false;
if(ao3 != null){
          lb2 = ao3.m2();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought310.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought147.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ab1 = fd0 > fd1;
    ab2 = !ab3;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo3 = Thought19.getInstance();

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
    boolean lb0 = false;
    double ld1 = 919.4560886798765;
    ld1 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao3.m3(ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought33.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought245.getInstance(ld1, ad1, ad2, ad3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
    ad1 *= -1;
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = !lb0;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Output.points[5][7] -= ld1;
    ab2 = ad1 > ad2;
    ab3 = ad3 > ad4;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ld1;
    Thought lo4 = Thought100.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb0;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}

Thought.STACK_COUNTER++;
return ad1;
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
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought263.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 = fd1 + fd0;
    Output.points[5][8] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd0 *= -1;
    Output.points[6][0] += fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld2 = 482.99420266429667;
    fd0 *= -1;
    fd1 = ld2 - fd0;
    lb0 = fb0 || fb1;
    lb0 = fd1 > ld2;
    fb0 = fd0 > fd1;
    fb1 = lb0 || fb0;

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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    double ld1 = 950.5058891646066;
    lb0 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ld1;
    fb1 = lb0 || ab1;
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    fb1 = lb0 || ab1;
    Thought lo2 = Thought303.getInstance(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    boolean lb3 = true;
    Output.points[6][1] += ld1;
    boolean lb4 = true;

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
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    Output.points[6][2] += fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    if (fb1) {
        ad4 = fd0 + fd1;
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        double ld1 = 82.14310332135682;
        lb0 = fb0 && fb1;
        } else {
        boolean lb2 = false;
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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1();
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ab1 = fo0.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab3 = fo0.m2(ad1, ad2, ad3, ad4);
}
    double ld1 = 97.75911683215439;
        ab4 = fb0 && fb1;
        lb0 = ab1 && ab2;
    ad4 = fd0 + fd1;
    Thought lo2 = Thought285.getInstance(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    double ld3 = 87.79203059394489;
    ab3 = ld1 > ld3;
if(fo1 != null){
      ab4 = fo1.m2();
}
    ad1 = ad2 + ad3;
    Thought lo4 = Thought236.getInstance(fb0, fb1, lb0, ab1);

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
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 318.34206386351235;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[6][3] -= fd1;
    fb0 = ld0 < fd0;
    fb1 = fd1 > ld0;
    Output.points[6][4] -= fd0;
    fd1 = ld0 + fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    if (fb1) {
        fd0 = fd1 + ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
          ao3.m2();
}
        Thought lo1 = Thought372.getInstance(fb0, fb1, fb0, fb1);
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    if (fb0) {
        Thought lo0 = Thought44.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
        fd0 = fd1 - ad1;
        ad2 *= -1;
if(fo1 != null){
          fo1.m2();
}
if(ao1 != null){
          ad3 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        lb1 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        lb1 = !fb0;
        fd1 *= -1;
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        Thought lo2 = Thought125.getInstance();
        fb1 = fd1 > ad1;
        lb1 = ad2 > ad3;
if(ao2 != null){
          fb0 = ao2.m2(fb1, lb1, fb0, fb1);
}
}
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
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    boolean lb1 = false;
    Output.points[6][5] -= fd1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 || ab1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Output.points[6][6] += fd0;
    Thought lo2 = Thought35.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, lb1, ab1);
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
    double ld3 = 926.7469598394352;

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
    ab2 = ad2 < ad3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ab4 = ad1 < ad2;
    Thought lo0 = Thought294.getInstance();
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, lb1);
}
    Output.points[6][7] += ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    lb0 = fb0 && fb1;
    Thought lo1 = Thought28.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    lb0 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !lb0;

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
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[6][8] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    lb0 = fd1 < fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    lb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 < fd0;
if(fo1 != null){
          fo1.m2(fb1, lb0, lb1, fb0);
}
    fb1 = fd1 > fd0;
    double ld2 = 162.91136724851398;

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
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[7][0] -= fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Output.points[7][1] -= fd0;
    double ld0 = 930.3329556939146;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;

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
